package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
public final class zf implements ed, us2, kg7, l8c, eq6, xcb, NativeInstance.PayloadCallback {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public zf(int i, Context context, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.a = (byte) 16;
        this.b = i;
        this.c = context;
        this.d = tL_messages_stickerSet;
    }

    @Override
    public final void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf.accept(java.lang.Object):void");
    }

    @Override
    public final void b(Canvas canvas) {
        qh9 qh9Var = (qh9) this.c;
        AtomicReference atomicReference = qh9Var.E;
        StaticLayout staticLayout = qh9Var.b;
        ArrayList arrayList = qh9Var.x;
        qla.g((View) this.d, false, this.b, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        ama.a(canvas, qh9Var.b);
        gm.drawAnimatedEmojis(canvas, qh9Var.b, qh9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public final void f(String str, ArrayList arrayList) {
        b1b b1bVar = (b1b) this.c;
        HashMap hashMap = (HashMap) this.d;
        c1b c1bVar = b1bVar.a;
        int i = c1bVar.Q;
        HashMap hashMap2 = c1bVar.J;
        if (this.b == i) {
            int size = arrayList.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = ((dq6) arrayList.get(i2)).a;
                ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    b1bVar.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        c1bVar.K.add(arrayList2);
                        z = true;
                    }
                }
            }
            if (z) {
                c1bVar.f();
            }
        }
    }

    @Override
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i = this.b;
        String str = "😀";
        String V = k27.V(document, "😀", Integer.valueOf(i));
        if (!TextUtils.isEmpty(V)) {
            str = V;
        }
        hd hdVar = new hd(3, null, context);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = hq6.b0(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = hq6.c0(document, str);
        ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_stickers_addStickerToSet, new vt0(hdVar, i, document, obj, tL_stickers_addStickerToSet, (byte) 13));
        try {
            hdVar.q(350L);
        } catch (Exception unused) {
        }
    }

    @Override
    public final Object m() {
        ((xl3) ((z90) this.c).d).F((ra0) this.d, this.b + 1, false);
        return null;
    }

    @Override
    public final void run(int i, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$69(this.b, (boolean[]) this.d, i, str);
    }

    @Override
    public final void u(hd hdVar, int i) {
        int i2;
        byte b = this.a;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hj hjVar = (hj) obj2;
                yc7 yc7Var = (yc7) obj;
                String trim = hjVar.getText().toString().trim();
                if (trim.length() <= i3 && !trim.isEmpty()) {
                    yc7Var.a(trim);
                    hdVar.dismiss();
                    return;
                }
                gl.A3(hjVar);
                return;
            case 1:
                c41 c41Var = (c41) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                String obj3 = c41Var.getText().toString();
                if (obj3.length() > 32) {
                    gl.A3(c41Var);
                    return;
                }
                j41 d = j41.d(i3);
                TL_account.TL_businessChatLink c = d.c(tL_businessChatLink.link);
                if (c != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c.message;
                    tL_inputBusinessChatLink.entities = c.entities;
                    tL_inputBusinessChatLink.title = obj3;
                    d.b(c, tL_inputBusinessChatLink, null);
                }
                hdVar.dismiss();
                return;
            case 2:
                mu1 mu1Var = (mu1) obj2;
                boolean[] zArr = (boolean[]) obj;
                boolean z = zArr[0];
                mu1Var.getMessagesController().D3(mu1Var.e, mu1Var.f, this.b, false, !zArr[1], z);
                m21 B = u21.B(mu1Var, true, null, null, mu1Var.Ba);
                B.j();
                q11 q11Var = B.e;
                q11Var.postDelayed(new b11(q11Var, (byte) 2), 550L);
                return;
            case 3:
                ((mu1) obj2).q9(i3, (k27) obj);
                return;
            case 4:
            case 8:
            case 11:
            case 12:
            default:
                ((StickersActivity) obj2).j0(i3, (ArrayList) obj);
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                h75 h75Var = ((f65) obj2).r1.b;
                h75Var.T2.C(i3, editTextBoldCursor.getText().toString());
                gl.t1(editTextBoldCursor);
                UndoView c1 = h75Var.c1();
                if (i3 == 0) {
                    i2 = 39;
                } else {
                    i2 = 100;
                }
                c1.j(i2, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                HashMap hashMap = (HashMap) obj;
                String str = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.e0;
                if (!arrayList.isEmpty() && gl.H1((d) b00.f(1, arrayList))) {
                    qa6 qa6Var = new qa6(0);
                    qa6Var.M0 = new jh(hashMap, i3, (byte) 10);
                    launchActivity.t0(qa6Var);
                    return;
                }
                return;
            case 7:
                ((qa6) obj2).H0(900, i3, (TLRPC.User) obj);
                return;
            case 9:
                hmc.L0(i3, (wjb) obj, (Context) obj2);
                return;
            case 10:
                ((PasscodeActivity) obj2).q0((hn7) obj, i3);
                return;
            case 13:
                ps9 ps9Var = (ps9) obj2;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                String obj4 = ps9Var.getText().toString();
                if (obj4.length() > 12) {
                    gl.A3(ps9Var);
                    return;
                }
                na7.q1(i3).n4(h19.d(reaction), obj4);
                hdVar.dismiss();
                return;
            case 14:
                ((SessionsActivity) obj2).j0(i3, (boolean[]) obj);
                return;
        }
    }

    public zf(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public zf(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
