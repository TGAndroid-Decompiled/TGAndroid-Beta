package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
public final class wl1 implements Runnable {
    public final byte a;
    public final mu1 b;

    public wl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                ar1 ar1Var = mu1Var.a0;
                if (ar1Var != null && mu1Var.Sb != 5) {
                    ar1Var.h1();
                    return;
                }
                return;
            case 1:
                pc2 pc2Var = ((pc2[]) mu1Var.c0.b)[0];
                jia jiaVar = pc2Var.d;
                jia jiaVar2 = pc2Var.e;
                mu1Var.U1 = !mu1Var.U1;
                jiaVar.setPivotX(0.0f);
                jiaVar2.setPivotX(0.0f);
                if (mu1Var.U1) {
                    jiaVar.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    jiaVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    jiaVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    jiaVar2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                gl.d3(mu1Var.V1, 6000L);
                return;
            case 2:
                gl.d0(mu1Var.A0, new bm0((byte) 5));
                vs1 vs1Var = mu1Var.D0;
                if (vs1Var != null) {
                    vs1Var.J(true);
                    return;
                }
                return;
            case 3:
                mu1Var.G5(true);
                return;
            case 4:
                mu1Var.G5(true);
                return;
            case 5:
                gl.d0(mu1Var.A0, new bm0((byte) 4));
                vs1 vs1Var2 = mu1Var.D0;
                if (vs1Var2 != null) {
                    vs1Var2.J(false);
                    return;
                }
                return;
            case 6:
                mu1Var.Qc();
                return;
            case 7:
                mu1Var.G5(false);
                jh8 jh8Var = new jh8((d) mu1Var, 24, true);
                jh8Var.p0 = false;
                jh8Var.I0 = new cl1(mu1Var, (byte) 7);
                jh8Var.show();
                return;
            case 8:
                mu1Var.G9();
                return;
            case 9:
                if (mu1Var.getUserConfig().p()) {
                    mu1Var.qc = null;
                    mu1Var.nd(true);
                    u21.b0(mu1Var).c(k96.M0(2131754485, null)).j();
                    mu1Var.getMessagesController().l0(true);
                    return;
                }
                mu1Var.showDialog(new jh8((d) mu1Var, 3, true));
                return;
            case 10:
                ar1 ar1Var2 = mu1Var.a0;
                if (ar1Var2 != null) {
                    ar1Var2.N0(true);
                    return;
                }
                return;
            case 11:
                mu1Var.x9();
                return;
            case 12:
                mu1Var.Na = null;
                mu1Var.Ma = -1;
                View view = mu1Var.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 13:
                ArrayList arrayList = mu1Var.M6;
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.Message message = ((k27) arrayList.get(i)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                mu1Var.D6 = 0;
                mu1Var.getMessagesController().q3(mu1Var.l6, mu1Var.d());
                mu1Var.E6 = true;
                mu1Var.ac(false);
                m8 m8Var = mu1Var.g9;
                if (m8Var != null) {
                    m8Var.dismiss();
                    return;
                }
                return;
            case 14:
                ArrayList arrayList2 = mu1Var.M6;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    ((k27) arrayList2.get(i2)).g5();
                }
                mu1Var.A1 = 0;
                mu1Var.Xc(true);
                mu1Var.getMessagesController().v3(mu1Var.l6, mu1Var.d());
                m8 m8Var2 = mu1Var.g9;
                if (m8Var2 != null) {
                    m8Var2.dismiss();
                    return;
                }
                return;
            case 15:
                ArrayList arrayList3 = mu1Var.M6;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    TLRPC.Message message2 = ((k27) arrayList3.get(i3)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                mu1Var.B1 = 0;
                mu1Var.Wc(true);
                mu1Var.getMessagesController().u3(mu1Var.l6, mu1Var.d());
                m8 m8Var3 = mu1Var.g9;
                if (m8Var3 != null) {
                    m8Var3.dismiss();
                    return;
                }
                return;
            case 16:
                mu1Var.p9();
                return;
            case 17:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 18:
                mu1Var.vc(true);
                mu1Var.md(true);
                u21.z(mu1Var, 4, 0, mu1Var.Ba).j();
                return;
            case 19:
                mu1Var.a0.h1();
                return;
            case 20:
                gl.B2(mu1Var.Y0);
                return;
            case 21:
                u21.b0(mu1Var).I(2131623982, k96.M0(2131753287, null), k96.M0(2131753288, null)).j();
                return;
            case 22:
                mu1Var.Q4 = null;
                mu1Var.G7();
                mu1Var.I7();
                return;
            case 23:
                mu1Var.Dc(false);
                return;
            case 24:
                mu1Var.Lb = null;
                return;
            case 25:
                mu1Var.L9 = false;
                mu1Var.w7(true);
                return;
            case 26:
                mu1Var.I7 = null;
                q qVar = mu1Var.q3;
                if (qVar != null) {
                    wo5 cameraContainer = qVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(mu1Var.q3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(mu1Var.q3.getPaint(), rn.b, 0), ObjectAnimator.ofFloat(mu1Var.q3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new lp1(mu1Var, (byte) 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                mu1Var.Y4();
                return;
            case 28:
                dr1 dr1Var = mu1Var.J8;
                if (dr1Var != null && dr1Var.getParent() != null) {
                    mu1Var.A0.h1();
                    mu1Var.L8.setDrawingReady(false);
                    mu1Var.J8.setTag(null);
                    mu1Var.m1.removeView(mu1Var.J8);
                    return;
                }
                return;
            default:
                ar1 ar1Var3 = mu1Var.a0;
                if (ar1Var3 != null && mu1Var.ld != null) {
                    boolean Q0 = ar1Var3.Q0();
                    ar1 ar1Var4 = mu1Var.a0;
                    if (Q0) {
                        ar1Var4.J0(false);
                        gl.E3(mu1Var.ld.a);
                        ((fm0) mu1Var.ld.b.b).a(false, true);
                        return;
                    }
                    ar1Var4.w1(false, false, false);
                    mu1Var.a0.V1();
                    ((fm0) mu1Var.ld.b.b).a(true, true);
                    return;
                }
                return;
        }
    }
}
