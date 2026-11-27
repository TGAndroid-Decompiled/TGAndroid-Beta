package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.EglRenderer;
public final class wd3 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public wd3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        int i;
        boolean z;
        long j;
        boolean z2;
        Bitmap createBitmap;
        switch (this.a) {
            case 0:
                Callable callable = (Callable) this.b;
                de3 de3Var = (de3) ((z8d) this.c).b;
                try {
                    de3Var.k(callable.call());
                    return;
                } catch (Exception e) {
                    de3Var.l(e);
                    return;
                }
            case 1:
                ((uj3) this.b).e4((TLRPC.TL_attachMenuBot) this.c);
                return;
            case 2:
                uj3 uj3Var = (uj3) this.b;
                nx0[] nx0VarArr = (nx0[]) this.c;
                nx0 nx0Var = nx0VarArr[0];
                if (nx0Var != null) {
                    nx0Var.dismiss();
                    nx0VarArr[0] = null;
                }
                hl.d3(new rg3(uj3Var, (byte) 27), 300L);
                return;
            case 3:
                uj3 uj3Var2 = (uj3) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                uc7 messagesController = uj3Var2.getMessagesController();
                if (uj3Var2.Y2 == 0 && uj3Var2.a3 == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                messagesController.c(arrayList, i, -1, null, 0L);
                return;
            case 4:
                CharSequence charSequence = (CharSequence) this.c;
                uj3 uj3Var3 = ((ci3) this.b).a;
                uj3Var3.J2 = null;
                sea seaVar = uj3Var3.I2;
                if (seaVar != null && seaVar.h) {
                    seaVar.e(charSequence, false);
                    return;
                }
                return;
            case 5:
                e[] eVarArr = (e[]) this.c;
                ((qi3) this.b).b.removeSelfFromStack();
                if (eVarArr[1] != null) {
                    eVarArr[0].removeSelfFromStack();
                    eVarArr[1].finishFragment();
                    return;
                }
                eVarArr[0].finishFragment();
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.c;
                uj3 uj3Var4 = ((lj3) this.b).b;
                if (uj3Var4.I4(uj3Var4.f0[0]) && !uj3Var4.U1) {
                    z = true;
                } else {
                    z = false;
                }
                uj3Var4.U4(true, true);
                uj3Var4.I2();
                if (z && uj3Var4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList2.get(i2)).id));
                    }
                    boolean z3 = false;
                    for (int size = uj3Var4.T1.size() - 1; size >= 0; size--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var4.T1.get(size);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.id)) && uj3Var4.H4(uj3Var4.f0[0], dialog)) {
                            uj3Var4.T1.remove(size);
                            z3 = true;
                        }
                    }
                    if (z3) {
                        uj3Var4.f0[0].b(false);
                    }
                }
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    long j2 = ((TLRPC.Dialog) arrayList2.get(i3)).id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i3);
                    if (!uj3Var4.getMessagesController().v2(j2) && !uj3Var4.getMessagesController().C2(j2)) {
                        j = j2;
                    } else {
                        uc7 messagesController2 = uj3Var4.getMessagesController();
                        jf7 messagesStorage = messagesController2.getMessagesStorage();
                        j = j2;
                        messagesStorage.a.c(new ue2(messagesStorage, j, new y97(messagesController2, j2), (byte) 5));
                    }
                    uj3Var4.getMessagesController().w3(j, 0L);
                    int i4 = dialog2.top_message;
                    uj3Var4.getMessagesController().r3(j, i4, i4, dialog2.last_message_date, false, 0L, 0, true, 0);
                }
                return;
            case 7:
                ((lj3) this.b).c((ac7) this.c);
                return;
            case 8:
                mk3 mk3Var = (mk3) this.b;
                TLObject tLObject = (TLObject) this.c;
                ik3 ik3Var = mk3Var.b;
                ArrayList arrayList3 = mk3Var.h;
                int i5 = mk3Var.a;
                if (tLObject instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
                    uc7.s1(i5).j4(popularappbots.users, false);
                    jf7.Y(i5).j1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    mk3Var.g = str;
                    if (str == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    mk3Var.e = z2;
                    long currentTimeMillis = System.currentTimeMillis();
                    mk3Var.f = currentTimeMillis;
                    if (!mk3Var.i) {
                        mk3Var.i = true;
                        String str2 = mk3Var.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i6 = 0; i6 < arrayList3.size(); i6 = dze.c(i6, 1, ((TLRPC.User) arrayList3.get(i6)).id, arrayList4)) {
                        }
                        jf7 Y = jf7.Y(i5);
                        Y.a.c(new da7(mk3Var, Y, arrayList4, currentTimeMillis, str3, (byte) 5));
                    }
                    mk3Var.c = false;
                    ik3Var.run();
                    return;
                }
                mk3Var.g = null;
                mk3Var.e = true;
                mk3Var.c = false;
                ik3Var.run();
                return;
            case 9:
                tl3 tl3Var = (tl3) this.b;
                View view = (View) this.c;
                tl3Var.n0 = false;
                tl3Var.p0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                gx9 gx9Var = (gx9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i7 = gx9Var.t0;
                ArrayList arrayList5 = gx9Var.L;
                gx9Var.T = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList5.isEmpty()) {
                        arrayList5.clear();
                        gx9Var.f();
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    uc7.s1(i7).j4(tL_contacts_sponsoredPeers.users, true);
                    uc7.s1(i7).c4(tL_contacts_sponsoredPeers.chats, true);
                    arrayList5.addAll(tL_contacts_sponsoredPeers.peers);
                    gx9Var.f();
                    return;
                } else {
                    return;
                }
            case 11:
                gx9 gx9Var2 = (gx9) this.b;
                StringBuilder sb = (StringBuilder) this.c;
                gx9Var2.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    jf7.Y(gx9Var2.t0).b.executeFast(sb.toString()).stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 12:
                ((zl3) this.b).b((ArrayList) this.c);
                return;
            case 13:
                ((bm3) this.b).c(null, ((TLRPC.TL_composedMessageWithAI) this.c).result_text.text);
                return;
            case 14:
                mm3 mm3Var = (mm3) this.c;
                nm3[] nm3VarArr = DictationAsr.a;
                if (!((boolean[]) this.b)[0]) {
                    mm3Var.a(null, null, true);
                    return;
                }
                return;
            case 15:
                j7b j7bVar = (j7b) this.c;
                nm3[] nm3VarArr2 = DictationAsr.a;
                if (!((boolean[]) this.b)[0]) {
                    j7bVar.a(null, null, true);
                    return;
                }
                return;
            case 16:
                sm3 sm3Var = (sm3) this.b;
                xn3 xn3Var = (xn3) this.c;
                byte[] bArr = new byte[3200];
                while (!sm3Var.d) {
                    int read = sm3Var.e.read(bArr, 0, 3200);
                    if (read <= 0) {
                        if (read < 0) {
                            Log.d("Dictation", "audio read " + read);
                            return;
                        }
                        return;
                    }
                    sm3Var.a(read, bArr);
                    int i8 = read / 2;
                    double d = 0.0d;
                    for (int i9 = 0; i9 < i8; i9++) {
                        int i10 = i9 << 1;
                        double d2 = (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
                        d += d2 * d2;
                    }
                    xn3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i8)))) * 20.0d) - 42.0d) / 30.0d)));
                }
                return;
            case 17:
                ((bn3) this.b).c((cm3) this.c);
                return;
            case 18:
                bn3 bn3Var = (bn3) this.b;
                co3 co3Var = (co3) this.c;
                if (bn3Var.G == co3Var && bn3Var.r == 1) {
                    co3Var.l();
                    return;
                }
                return;
            case 19:
                ((te2) this.b).a((cm3) this.c);
                return;
            case 20:
                hl.c3(new hl3((rx1) this.c, DictationLid.k((byte[]) this.b).length / 32, (byte) 2));
                return;
            case 21:
                Runnable runnable = (Runnable) this.c;
                if (!((co3) this.b).h) {
                    runnable.run();
                    return;
                }
                return;
            case 22:
                vo3 vo3Var = (vo3) this.b;
                uo3 uo3Var = (uo3) this.c;
                vo3Var.g--;
                SparseIntArray sparseIntArray = vo3Var.b;
                int i11 = sparseIntArray.get(uo3Var.index) - 1;
                int i12 = uo3Var.index;
                if (i11 == 0) {
                    sparseIntArray.delete(i12);
                    vo3Var.c.remove(uo3Var);
                    vo3Var.a.add(uo3Var);
                    return;
                }
                sparseIntArray.put(i12, i11);
                return;
            case 23:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(hl.L(26.0f), hl.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                hl.c3(new wd3((kt3) this.b, decodeFile, (byte) 24));
                return;
            case 24:
                ((kt3) this.b).setImage((Bitmap) this.c);
                return;
            case 25:
                Field field = EditTextBoldCursor.F1;
                ((EditTextBoldCursor) this.b).p0.draw((Canvas) this.c);
                return;
            case 26:
                EglRenderer.a((EglRenderer) this.b, (Runnable) this.c);
                return;
            case 27:
                EglRenderer.d((EglRenderer) this.b, (CountDownLatch) this.c);
                return;
            case 28:
                tv3 tv3Var = (tv3) this.b;
                zu1 zu1Var = tv3Var.a;
                s4b s4bVar = new s4b(zu1Var.getParentActivity(), tv3Var.a, r47.j1(((r47) this.c).k), null, zu1Var.a0, zu1Var.getResourceProvider());
                boolean Y7 = zu1Var.Y7();
                s4bVar.i0 = Y7;
                s4bVar.n = Y7;
                zu1Var.showDialog(s4bVar);
                return;
            default:
                fw3 fw3Var = (fw3) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                hw3 hw3Var = fw3Var.s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    zw3 zw3Var = hw3Var.r;
                    int i13 = zw3.C1;
                    uc7.s1(zw3Var.a).j4(tL_contacts_resolvedPeer.users, false);
                    uc7.s1(zw3Var.a).c4(tL_contacts_resolvedPeer.chats, false);
                    jf7.Y(zw3Var.a).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                fw3Var.n = true;
                fw3Var.F();
                return;
        }
    }
}
