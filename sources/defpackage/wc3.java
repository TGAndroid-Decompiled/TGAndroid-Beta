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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.EglRenderer;
import org.webrtc.GlGenericDrawer;
public final class wc3 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public wc3(Object obj, Object obj2, byte b) {
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
                ((xc3) ((lv6) this.b).c).i.a((icc) this.c);
                return;
            case 1:
                Callable callable = (Callable) this.b;
                kd3 kd3Var = (kd3) ((l69) this.c).b;
                try {
                    kd3Var.k(callable.call());
                    return;
                } catch (Exception e) {
                    kd3Var.l(e);
                    return;
                }
            case 2:
                ((cj3) this.b).b4((TLRPC.TL_attachMenuBot) this.c);
                return;
            case 3:
                cj3 cj3Var = (cj3) this.b;
                fx0[] fx0VarArr = (fx0[]) this.c;
                fx0 fx0Var = fx0VarArr[0];
                if (fx0Var != null) {
                    fx0Var.dismiss();
                    fx0VarArr[0] = null;
                }
                gl.e3(new wf3(cj3Var, (byte) 18), 300L);
                return;
            case 4:
                cj3 cj3Var2 = (cj3) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                na7 messagesController = cj3Var2.getMessagesController();
                if (cj3Var2.Y2 == 0 && cj3Var2.a3 == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                messagesController.c(arrayList, i, -1, null, 0L);
                return;
            case 5:
                CharSequence charSequence = (CharSequence) this.c;
                cj3 cj3Var3 = ((ih3) this.b).a;
                cj3Var3.J2 = null;
                bba bbaVar = cj3Var3.I2;
                if (bbaVar != null && bbaVar.h) {
                    bbaVar.e(charSequence, false);
                    return;
                }
                return;
            case 6:
                d[] dVarArr = (d[]) this.c;
                ((wh3) this.b).b.removeSelfFromStack();
                if (dVarArr[1] != null) {
                    dVarArr[0].removeSelfFromStack();
                    dVarArr[1].finishFragment();
                    return;
                }
                dVarArr[0].finishFragment();
                return;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.c;
                cj3 cj3Var4 = ((ti3) this.b).b;
                if (cj3Var4.E4(cj3Var4.f0[0]) && !cj3Var4.U1) {
                    z = true;
                } else {
                    z = false;
                }
                cj3Var4.Q4(true, true);
                cj3Var4.G2();
                if (z && cj3Var4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList2.get(i2)).id));
                    }
                    boolean z3 = false;
                    for (int size = cj3Var4.T1.size() - 1; size >= 0; size--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var4.T1.get(size);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.id)) && cj3Var4.D4(cj3Var4.f0[0], dialog)) {
                            cj3Var4.T1.remove(size);
                            z3 = true;
                        }
                    }
                    if (z3) {
                        cj3Var4.f0[0].b(false);
                    }
                }
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    long j2 = ((TLRPC.Dialog) arrayList2.get(i3)).id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i3);
                    if (!cj3Var4.getMessagesController().r2(j2) && !cj3Var4.getMessagesController().y2(j2)) {
                        j = j2;
                    } else {
                        na7 messagesController2 = cj3Var4.getMessagesController();
                        ad7 messagesStorage = messagesController2.getMessagesStorage();
                        j = j2;
                        messagesStorage.a.c(new de2(messagesStorage, j, new x67(messagesController2, j2), (byte) 5));
                    }
                    cj3Var4.getMessagesController().p3(j, 0L);
                    int i4 = dialog2.top_message;
                    cj3Var4.getMessagesController().k3(j, i4, i4, dialog2.last_message_date, false, 0L, 0, true, 0);
                }
                return;
            case 8:
                ((ti3) this.b).d((t97) this.c);
                return;
            case 9:
                uj3 uj3Var = (uj3) this.b;
                TLObject tLObject = (TLObject) this.c;
                qj3 qj3Var = uj3Var.b;
                ArrayList arrayList3 = uj3Var.h;
                int i5 = uj3Var.a;
                if (tLObject instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
                    na7.q1(i5).a4(popularappbots.users, false);
                    ad7.Y(i5).j1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    uj3Var.g = str;
                    if (str == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    uj3Var.e = z2;
                    long currentTimeMillis = System.currentTimeMillis();
                    uj3Var.f = currentTimeMillis;
                    if (!uj3Var.i) {
                        uj3Var.i = true;
                        String str2 = uj3Var.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i6 = 0; i6 < arrayList3.size(); i6 = mue.c(i6, 1, ((TLRPC.User) arrayList3.get(i6)).id, arrayList4)) {
                        }
                        ad7 Y = ad7.Y(i5);
                        Y.a.c(new o77(uj3Var, Y, arrayList4, currentTimeMillis, str3, (byte) 5));
                    }
                    uj3Var.c = false;
                    qj3Var.run();
                    return;
                }
                uj3Var.g = null;
                uj3Var.e = true;
                uj3Var.c = false;
                qj3Var.run();
                return;
            case 10:
                bl3 bl3Var = (bl3) this.b;
                View view = (View) this.c;
                bl3Var.n0 = false;
                bl3Var.p0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 11:
                mt9 mt9Var = (mt9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i7 = mt9Var.t0;
                ArrayList arrayList5 = mt9Var.L;
                mt9Var.T = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList5.isEmpty()) {
                        arrayList5.clear();
                        mt9Var.f();
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    na7.q1(i7).a4(tL_contacts_sponsoredPeers.users, true);
                    na7.q1(i7).U3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList5.addAll(tL_contacts_sponsoredPeers.peers);
                    mt9Var.f();
                    return;
                } else {
                    return;
                }
            case 12:
                mt9 mt9Var2 = (mt9) this.b;
                StringBuilder sb = (StringBuilder) this.c;
                mt9Var2.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    ad7.Y(mt9Var2.t0).b.executeFast(sb.toString()).stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 13:
                ((hl3) this.b).b((ArrayList) this.c);
                return;
            case 14:
                ((jl3) this.b).c(null, ((TLRPC.TL_composedMessageWithAI) this.c).result_text.text);
                return;
            case 15:
                n3b n3bVar = (n3b) this.c;
                vl3[] vl3VarArr = DictationAsr.a;
                if (!((boolean[]) this.b)[0]) {
                    n3bVar.a(null, null, true);
                    return;
                }
                return;
            case 16:
                ul3 ul3Var = (ul3) this.c;
                vl3[] vl3VarArr2 = DictationAsr.a;
                if (!((boolean[]) this.b)[0]) {
                    ul3Var.a(null, null, true);
                    return;
                }
                return;
            case 17:
                am3 am3Var = (am3) this.b;
                gn3 gn3Var = (gn3) this.c;
                byte[] bArr = new byte[3200];
                while (!am3Var.d) {
                    int read = am3Var.e.read(bArr, 0, 3200);
                    if (read <= 0) {
                        if (read < 0) {
                            Log.d("Dictation", "audio read " + read);
                            return;
                        }
                        return;
                    }
                    am3Var.a(read, bArr);
                    int i8 = read / 2;
                    double d = 0.0d;
                    for (int i9 = 0; i9 < i8; i9++) {
                        int i10 = i9 << 1;
                        double d2 = (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
                        d += d2 * d2;
                    }
                    gn3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i8)))) * 20.0d) - 42.0d) / 30.0d)));
                }
                return;
            case 18:
                ((jm3) this.b).A((String) this.c);
                return;
            case 19:
                ((jm3) this.b).c((kl3) this.c);
                return;
            case 20:
                jm3 jm3Var = (jm3) this.b;
                ln3 ln3Var = (ln3) this.c;
                if (jm3Var.G == ln3Var && jm3Var.r == 1) {
                    ln3Var.l();
                    return;
                }
                return;
            case 21:
                ((be2) this.b).a((kl3) this.c);
                return;
            case 22:
                gl.d3(new sm3((pz1) this.c, DictationLid.j((byte[]) this.b).length / 32, (byte) 0));
                return;
            case 23:
                Runnable runnable = (Runnable) this.c;
                if (!((ln3) this.b).h) {
                    runnable.run();
                    return;
                }
                return;
            case 24:
                eo3 eo3Var = (eo3) this.b;
                do3 do3Var = (do3) this.c;
                eo3Var.g--;
                SparseIntArray sparseIntArray = eo3Var.b;
                int i11 = sparseIntArray.get(do3Var.index) - 1;
                int i12 = do3Var.index;
                if (i11 == 0) {
                    sparseIntArray.delete(i12);
                    eo3Var.c.remove(do3Var);
                    eo3Var.a.add(do3Var);
                    return;
                }
                sparseIntArray.put(i12, i11);
                return;
            case 25:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(gl.L(26.0f), gl.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                gl.d3(new wc3((ss3) this.b, decodeFile, (byte) 26));
                return;
            case 26:
                ((ss3) this.b).setImage((Bitmap) this.c);
                return;
            case 27:
                Field field = EditTextBoldCursor.E1;
                ((EditTextBoldCursor) this.b).p0.draw((Canvas) this.c);
                return;
            case 28:
                EglRenderer.h((EglRenderer) this.b, (GlGenericDrawer.TextureCallback) this.c);
                return;
            default:
                EglRenderer.c((EglRenderer) this.b, (CountDownLatch) this.c);
                return;
        }
    }
}
