package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.l;
import org.telegram.ui.ProfileActivity;
public final class hq1 implements Runnable {
    public final byte a;
    public final Object b;

    public hq1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        int i;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jq1) obj).G3.A4();
                return;
            case 1:
                ((mq1) obj).T.D0.J(false);
                return;
            case 2:
                Bundle bundle = new Bundle();
                vs1 vs1Var = ((ps1) obj).c.a;
                i = ((d) vs1Var.R).currentAccount;
                bundle.putLong("user_id", y6c.h(i).n);
                vs1Var.R.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 3:
                ((xs1) obj).b.u7(true);
                return;
            case 4:
                ((pp1) obj).c(false);
                return;
            case 5:
                mu1 mu1Var = ((xt1) obj).h;
                mu1Var.getNotificationCenter().j(mu1Var.fa);
                return;
            case 6:
                mu1 mu1Var2 = ((du1) obj).b;
                mu1Var2.k0.getSearchField().requestFocus();
                gl.F3(mu1Var2.k0.getSearchField());
                if (mu1Var2.Ma > 0) {
                    wl1 wl1Var = new wl1(mu1Var2, (byte) 12);
                    mu1Var2.Na = wl1Var;
                    gl.e3(wl1Var, 200L);
                    return;
                }
                return;
            case 7:
                int i2 = ChatActivityEnterView.r7;
                ((ev1) obj).a(Boolean.FALSE, 0, 0);
                return;
            case 8:
                ((Dialog) obj).dismiss();
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView = ((hx1) obj).f;
                int i3 = ChatActivityEnterView.r7;
                chatActivityEnterView.T1();
                return;
            case 10:
                gl.B2((hjc) obj);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = ((l) obj).Q0;
                if (!MediaController.w().F()) {
                    na7.c1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView2.h5) {
                    chatActivityEnterView2.y4 = true;
                }
                MediaController.w().C0(chatActivityEnterView2.P);
                chatActivityEnterView2.P3.n0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView2.a2;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 12:
                ((qy1) obj).s = null;
                return;
            case 13:
                ((k02) obj).r0.x3.f();
                return;
            case 14:
                r12 r12Var = (r12) obj;
                r12Var.R = r12Var.r;
                return;
            case 15:
                d32 d32Var = (d32) ((zj) obj).b;
                try {
                    File file = d32Var.P;
                    if (file == null) {
                        d32Var.T();
                    } else {
                        d32Var.S(file);
                    }
                    d32Var.a0();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((v42) obj).b;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                return;
            case 17:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((t42) obj).c;
                b52 b52Var = chatAttachAlertPhotoLayout3.Q;
                if (b52Var != null && !chatAttachAlertPhotoLayout3.b.J) {
                    b52Var.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 18:
                m52 m52Var = (m52) obj;
                x02 x02Var = m52Var.b;
                if (m52Var.R && (chatAttachAlertPhotoLayout = x02Var.d2) != null) {
                    chatAttachAlertPhotoLayout.d1.setIcon(2131231243);
                    chatAttachAlertPhotoLayout.d1.setText(k96.M0(2131753753, null));
                    chatAttachAlertPhotoLayout.d1.setRightIcon(0);
                    return;
                }
                return;
            case 19:
                k62 k62Var = (k62) obj;
                k62Var.m1 = -1;
                k62Var.l1 = null;
                return;
            case 20:
                p82 p82Var = ((m82) obj).a;
                p82Var.e.setImageDrawable(p82Var.r);
                p82Var.c0.o(2131232052, k96.M0(2131752200, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = p82Var.D0;
                if (user != null) {
                    user.photo = null;
                    p82Var.getMessagesController().Z3(p82Var.D0, true, false);
                }
                p82Var.P0 = true;
                if (p82Var.S0 == null) {
                    p82Var.S0 = new oy8(2131623965, gl.L(50.0f), gl.L(50.0f), false, null);
                }
                p82Var.c0.e.setTranslationX(-gl.L(8.0f));
                p82Var.c0.e.setAnimation(p82Var.S0);
                return;
            case 21:
                bb2 bb2Var = ((ob2) obj).e;
                if (bb2Var != null) {
                    bb2Var.p();
                    return;
                }
                return;
            case 22:
                ((xb2) obj).i();
                return;
            case 23:
                ((pc2) obj).setVisibility(8);
                return;
            case 24:
                fd2 fd2Var = (fd2) ((qx4) obj).a;
                ed2 ed2Var = fd2Var.b;
                if (ed2Var != null) {
                    ed2Var.a(true);
                }
                fd2Var.a.E5(true);
                return;
            case 25:
                ((fh) obj).a(0);
                return;
            case 26:
                mf2 mf2Var = (mf2) obj;
                l5c l5cVar = mf2Var.Z1;
                if (l5cVar != null) {
                    l5cVar.O(true);
                }
                mf2Var.Y0(true);
                return;
            case 27:
                uf2 uf2Var = (uf2) ((l69) obj).b;
                uf2Var.c.g3.O(true);
                uf2Var.f0();
                return;
            case 28:
                ((mg2) obj).invalidateSelf();
                return;
            default:
                ((di2) obj).dismiss();
                return;
        }
    }
}
