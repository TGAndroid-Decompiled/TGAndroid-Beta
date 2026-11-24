package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.q;
public final class yq1 extends AnimatorListenerAdapter {
    public final byte a;
    public final yv1 b;

    public yq1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        vr1 vr1Var;
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                q qVar = yv1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(false);
                    yv1Var.q3.m();
                    yv1Var.q3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                yv1Var.X9 = gm.L(30.0f);
                yv1Var.O7();
                return;
            case 2:
                if (yv1Var.fragmentView != null && (vr1Var = yv1Var.A0) != null) {
                    vr1Var.invalidate();
                    yv1Var.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                yv1Var.R.setVisibility(4);
                return;
            case 4:
                if (animator.equals(yv1Var.v3)) {
                    yv1Var.v3 = null;
                    return;
                }
                return;
            case 5:
                if (animator.equals(yv1Var.v3)) {
                    yv1Var.v3 = null;
                    return;
                }
                return;
            case 6:
                if (animator.equals(yv1Var.w3)) {
                    yv1Var.x3 = 1.0f;
                    yv1Var.Tc();
                    yv1Var.w3 = null;
                    return;
                }
                return;
            case 7:
                if (animator.equals(yv1Var.w3)) {
                    yv1Var.x3 = 0.0f;
                    yv1Var.Tc();
                    yv1Var.w3 = null;
                    return;
                }
                return;
            case 8:
                yv1Var.h5 = null;
                return;
            case 9:
                yv1Var.bb = 1.0f;
                yv1Var.a0.setVisibility(4);
                yv1Var.d1.setVisibility(4);
                yv1Var.O7();
                return;
            default:
                yv1Var.bb = 0.0f;
                yv1Var.O7();
                return;
        }
    }
}
