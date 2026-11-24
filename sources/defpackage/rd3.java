package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.EglRenderer;
import org.webrtc.GlGenericDrawer;
public final class rd3 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public rd3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        int i;
        boolean z;
        boolean z2;
        Bitmap createBitmap;
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                ud3 ud3Var = (ud3) ((sd3) this.b).c;
                ud3Var.a();
                ud3Var.c();
                int w0 = cmb.w0(null, cmb.p6, false);
                p09 p09Var = ud3Var.d;
                p09Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                boolean i1 = cmb.i1();
                xib xibVar = ud3Var.e;
                if (i1) {
                    xibVar.p(jb6.M0(2131745200, null), p09Var, true);
                    xibVar.x += 2;
                } else {
                    xibVar.p(jb6.M0(2131745201, null), p09Var, true);
                    xibVar.x += 2;
                }
                cmb.K1(dVar);
                return;
            case 1:
                ((je3) ((hi2) this.b).c).i.a((jec) this.c);
                return;
            case 2:
                Callable callable = (Callable) this.b;
                we3 we3Var = (we3) ((k6d) this.c).b;
                try {
                    we3Var.k(callable.call());
                    return;
                } catch (Exception e) {
                    we3Var.l(e);
                    return;
                }
            case 3:
                ((nk3) this.b).e4((TLRPC.TL_attachMenuBot) this.c);
                return;
            case 4:
                nk3 nk3Var = (nk3) this.b;
                my0[] my0VarArr = (my0[]) this.c;
                my0 my0Var = my0VarArr[0];
                if (my0Var != null) {
                    my0Var.dismiss();
                    my0VarArr[0] = null;
                }
                gm.d3(new kh3(nk3Var, (byte) 18), 300L);
                return;
            case 5:
                nk3 nk3Var2 = (nk3) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                oc7 messagesController = nk3Var2.getMessagesController();
                if (nk3Var2.Y2 == 0 && nk3Var2.a3 == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                messagesController.c(arrayList, i, -1, null, 0L);
                return;
            case 6:
                CharSequence charSequence = (CharSequence) this.c;
                nk3 nk3Var3 = ((ui3) this.b).a;
                nk3Var3.J2 = null;
                bda bdaVar = nk3Var3.I2;
                if (bdaVar != null && bdaVar.h) {
                    bdaVar.e(charSequence, false);
                    return;
                }
                return;
            case 7:
                d[] dVarArr = (d[]) this.c;
                ((ij3) this.b).b.removeSelfFromStack();
                if (dVarArr[1] != null) {
                    dVarArr[0].removeSelfFromStack();
                    dVarArr[1].finishFragment();
                    return;
                }
                dVarArr[0].finishFragment();
                return;
            case 8:
                ArrayList arrayList2 = (ArrayList) this.c;
                nk3 nk3Var4 = ((dk3) this.b).b;
                if (nk3Var4.I4(nk3Var4.f0[0]) && !nk3Var4.U1) {
                    z = true;
                } else {
                    z = false;
                }
                nk3Var4.U4(true, true);
                nk3Var4.I2();
                if (z && nk3Var4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList2.get(i2)).id));
                    }
                    boolean z3 = false;
                    for (int size = nk3Var4.T1.size() - 1; size >= 0; size--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) nk3Var4.T1.get(size);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.id)) && nk3Var4.H4(nk3Var4.f0[0], dialog)) {
                            nk3Var4.T1.remove(size);
                            z3 = true;
                        }
                    }
                    if (z3) {
                        nk3Var4.f0[0].b(false);
                    }
                }
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    long j = ((TLRPC.Dialog) arrayList2.get(i3)).id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i3);
                    if (nk3Var4.getMessagesController().s2(j) || nk3Var4.getMessagesController().z2(j)) {
                        oc7 messagesController2 = nk3Var4.getMessagesController();
                        cf7 messagesStorage = messagesController2.getMessagesStorage();
                        v87 v87Var = new v87(messagesController2, j);
                        mp3 mp3Var = messagesStorage.a;
                        of2 of2Var = new of2(messagesStorage, j, v87Var, (byte) 5);
                        j = j;
                        mp3Var.c(of2Var);
                    }
                    nk3Var4.getMessagesController().s3(j, 0L);
                    oc7 messagesController3 = nk3Var4.getMessagesController();
                    int i4 = dialog2.top_message;
                    messagesController3.n3(j, i4, i4, dialog2.last_message_date, false, 0L, 0, true, 0);
                }
                return;
            case 9:
                ((dk3) this.b).d((ub7) this.c);
                return;
            case 10:
                fl3 fl3Var = (fl3) this.b;
                TLObject tLObject = (TLObject) this.c;
                bl3 bl3Var = fl3Var.b;
                ArrayList arrayList3 = fl3Var.h;
                int i5 = fl3Var.a;
                if (tLObject instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
                    oc7.r1(i5).d4(popularappbots.users, false);
                    cf7.Y(i5).j1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    fl3Var.g = str;
                    if (str == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    fl3Var.e = z2;
                    long currentTimeMillis = System.currentTimeMillis();
                    fl3Var.f = currentTimeMillis;
                    if (!fl3Var.i) {
                        fl3Var.i = true;
                        String str2 = fl3Var.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i6 = 0; i6 < arrayList3.size(); i6 = mle.c(i6, 1, ((TLRPC.User) arrayList3.get(i6)).id, arrayList4)) {
                        }
                        cf7 Y = cf7.Y(i5);
                        Y.a.c(new r97(fl3Var, Y, arrayList4, currentTimeMillis, str3, (byte) 5));
                    }
                    fl3Var.c = false;
                    bl3Var.run();
                    return;
                }
                fl3Var.g = null;
                fl3Var.e = true;
                fl3Var.c = false;
                bl3Var.run();
                return;
            case 11:
                mm3 mm3Var = (mm3) this.b;
                View view = (View) this.c;
                mm3Var.n0 = false;
                mm3Var.p0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 12:
                ov9 ov9Var = (ov9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i7 = ov9Var.t0;
                ArrayList arrayList5 = ov9Var.L;
                ov9Var.T = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList5.isEmpty()) {
                        arrayList5.clear();
                        ov9Var.f();
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    oc7.r1(i7).d4(tL_contacts_sponsoredPeers.users, true);
                    oc7.r1(i7).X3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList5.addAll(tL_contacts_sponsoredPeers.peers);
                    ov9Var.f();
                    return;
                } else {
                    return;
                }
            case 13:
                ov9 ov9Var2 = (ov9) this.b;
                StringBuilder sb = (StringBuilder) this.c;
                ov9Var2.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    cf7.Y(ov9Var2.t0).b.executeFast(sb.toString()).stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 14:
                ((sm3) this.b).b((ArrayList) this.c);
                return;
            case 15:
                ((um3) this.b).c(null, ((TLRPC.TL_composedMessageWithAI) this.c).result_text.text);
                return;
            case 16:
                o5b o5bVar = (o5b) this.c;
                gn3[] gn3VarArr = DictationAsr.a;
                if (!((boolean[]) this.b)[0]) {
                    o5bVar.a(null, null, true);
                    return;
                }
                return;
            case 17:
                fn3 fn3Var = (fn3) this.c;
                gn3[] gn3VarArr2 = DictationAsr.a;
                if (!((boolean[]) this.b)[0]) {
                    fn3Var.a(null, null, true);
                    return;
                }
                return;
            case 18:
                ln3 ln3Var = (ln3) this.b;
                qo3 qo3Var = (qo3) this.c;
                byte[] bArr = new byte[3200];
                while (!ln3Var.d) {
                    int read = ln3Var.e.read(bArr, 0, 3200);
                    if (read <= 0) {
                        if (read < 0) {
                            Log.d("Dictation", "audio read " + read);
                            return;
                        }
                        return;
                    }
                    ln3Var.a(read, bArr);
                    int i8 = read / 2;
                    double d = 0.0d;
                    for (int i9 = 0; i9 < i8; i9++) {
                        int i10 = i9 << 1;
                        double d2 = (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
                        d += d2 * d2;
                    }
                    qo3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i8)))) * 20.0d) - 42.0d) / 30.0d)));
                }
                return;
            case 19:
                ((un3) this.b).A((String) this.c);
                return;
            case 20:
                ((un3) this.b).c((vm3) this.c);
                return;
            case 21:
                un3 un3Var = (un3) this.b;
                vo3 vo3Var = (vo3) this.c;
                if (un3Var.G == vo3Var && un3Var.r == 1) {
                    vo3Var.l();
                    return;
                }
                return;
            case 22:
                ((mf2) this.b).a((vm3) this.c);
                return;
            case 23:
                gm.c3(new bm3((qy1) this.c, DictationLid.j((byte[]) this.b).length / 32, (byte) 1));
                return;
            case 24:
                Runnable runnable = (Runnable) this.c;
                if (!((vo3) this.b).h) {
                    runnable.run();
                    return;
                }
                return;
            case 25:
                op3 op3Var = (op3) this.b;
                np3 np3Var = (np3) this.c;
                op3Var.g--;
                SparseIntArray sparseIntArray = op3Var.b;
                int i11 = sparseIntArray.get(np3Var.index) - 1;
                int i12 = np3Var.index;
                if (i11 == 0) {
                    sparseIntArray.delete(i12);
                    op3Var.c.remove(np3Var);
                    op3Var.a.add(np3Var);
                    return;
                }
                sparseIntArray.put(i12, i11);
                return;
            case 26:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(gm.L(26.0f), gm.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                gm.c3(new rd3((cu3) this.b, decodeFile, (byte) 27));
                return;
            case 27:
                ((cu3) this.b).setImage((Bitmap) this.c);
                return;
            case 28:
                Field field = EditTextBoldCursor.E1;
                ((EditTextBoldCursor) this.b).p0.draw((Canvas) this.c);
                return;
            default:
                EglRenderer.h((EglRenderer) this.b, (GlGenericDrawer.TextureCallback) this.c);
                return;
        }
    }
}
