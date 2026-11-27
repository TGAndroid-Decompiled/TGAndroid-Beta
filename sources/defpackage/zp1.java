package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.q;
public final class zp1 extends AnimatorListenerAdapter {
    public final byte a;
    public final zu1 b;

    public zp1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wq1 wq1Var;
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                q qVar = zu1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(false);
                    zu1Var.q3.m();
                    zu1Var.q3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                zu1Var.X9 = hl.L(30.0f);
                zu1Var.O7();
                return;
            case 2:
                if (zu1Var.fragmentView != null && (wq1Var = zu1Var.A0) != null) {
                    wq1Var.invalidate();
                    zu1Var.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                zu1Var.R.setVisibility(4);
                return;
            case 4:
                if (animator.equals(zu1Var.v3)) {
                    zu1Var.v3 = null;
                    return;
                }
                return;
            case 5:
                if (animator.equals(zu1Var.v3)) {
                    zu1Var.v3 = null;
                    return;
                }
                return;
            case 6:
                if (animator.equals(zu1Var.w3)) {
                    zu1Var.x3 = 1.0f;
                    zu1Var.Tc();
                    zu1Var.w3 = null;
                    return;
                }
                return;
            case 7:
                if (animator.equals(zu1Var.w3)) {
                    zu1Var.x3 = 0.0f;
                    zu1Var.Tc();
                    zu1Var.w3 = null;
                    return;
                }
                return;
            case 8:
                zu1Var.h5 = null;
                return;
            case 9:
                zu1Var.bb = 1.0f;
                zu1Var.a0.setVisibility(4);
                zu1Var.d1.setVisibility(4);
                zu1Var.O7();
                return;
            default:
                zu1Var.bb = 0.0f;
                zu1Var.O7();
                return;
        }
    }
}
