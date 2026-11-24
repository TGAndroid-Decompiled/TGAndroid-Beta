package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.q;
public final class lp1 extends AnimatorListenerAdapter {
    public final byte a;
    public final mu1 b;

    public lp1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jq1 jq1Var;
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                q qVar = mu1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(false);
                    mu1Var.q3.m();
                    mu1Var.q3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                mu1Var.X9 = gl.L(30.0f);
                mu1Var.E7();
                return;
            case 2:
                if (mu1Var.fragmentView != null && (jq1Var = mu1Var.A0) != null) {
                    jq1Var.invalidate();
                    mu1Var.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                mu1Var.R.setVisibility(4);
                return;
            case 4:
                if (animator.equals(mu1Var.v3)) {
                    mu1Var.v3 = null;
                    return;
                }
                return;
            case 5:
                if (animator.equals(mu1Var.v3)) {
                    mu1Var.v3 = null;
                    return;
                }
                return;
            case 6:
                if (animator.equals(mu1Var.w3)) {
                    mu1Var.x3 = 1.0f;
                    mu1Var.Fc();
                    mu1Var.w3 = null;
                    return;
                }
                return;
            case 7:
                if (animator.equals(mu1Var.w3)) {
                    mu1Var.x3 = 0.0f;
                    mu1Var.Fc();
                    mu1Var.w3 = null;
                    return;
                }
                return;
            case 8:
                mu1Var.h5 = null;
                return;
            case 9:
                mu1Var.bb = 1.0f;
                mu1Var.a0.setVisibility(4);
                mu1Var.d1.setVisibility(4);
                mu1Var.E7();
                return;
            default:
                mu1Var.bb = 0.0f;
                mu1Var.E7();
                return;
        }
    }
}
