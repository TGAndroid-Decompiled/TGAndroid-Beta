package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class xh3 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final cj3 c;

    public xh3(cj3 cj3Var, boolean z, byte b) {
        this.a = b;
        this.c = cj3Var;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                cj3 cj3Var = this.c;
                cj3Var.r3.e();
                if (cj3Var.y1 == animator) {
                    bj3[] bj3VarArr = cj3Var.f0;
                    if (this.b) {
                        bj3VarArr[0].a.d1();
                    } else {
                        yi3 yi3Var = bj3VarArr[0].a;
                        if (yi3Var.h1) {
                            yi3Var.h1 = false;
                            yi3Var.L0(false);
                        }
                    }
                    cj3Var.y1 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        r7 r7Var;
        byte b = this.a;
        int i2 = 0;
        float f = 0.0f;
        boolean z = this.b;
        cj3 cj3Var = this.c;
        switch (b) {
            case 0:
                cj3Var.r3.e();
                if (cj3Var.y1 == animator) {
                    cj3Var.Q4(false, true);
                    if (z) {
                        cj3Var.f0[0].a.d1();
                        oh3 oh3Var = cj3Var.F0;
                        if (oh3Var != null) {
                            oh3Var.setVisibility(8);
                        }
                        cj3Var.t3 = true;
                        Activity parentActivity = cj3Var.getParentActivity();
                        i = ((d) cj3Var).classGuid;
                        gl.W2(parentActivity, i);
                        cj3Var.k0.setVisibility(8);
                        rh3 rh3Var = cj3Var.H3;
                        if (rh3Var != null) {
                            rh3Var.setVisibility(8);
                        }
                    } else {
                        cj3Var.u3 = false;
                        hi3 hi3Var = cj3Var.D0;
                        if (hi3Var != null) {
                            hi3Var.setVisibility(8);
                        }
                        pi3 pi3Var = cj3Var.Y;
                        if (pi3Var != null) {
                            pi3Var.c();
                        }
                        hi3 hi3Var2 = cj3Var.D0;
                        if (hi3Var2 != null) {
                            hi3Var2.D0.clear();
                            hi3Var2.L();
                        }
                        yi3 yi3Var = cj3Var.f0[0].a;
                        if (yi3Var.h1) {
                            yi3Var.h1 = false;
                            yi3Var.L0(false);
                        }
                        cj3Var.t3 = false;
                        rh3 rh3Var2 = cj3Var.H3;
                        if (rh3Var2 != null) {
                            rh3Var2.setVisibility(0);
                        }
                    }
                    View view = cj3Var.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z) {
                        f = 1.0f;
                    }
                    cj3Var.T4(f);
                    cj3Var.f0[0].a.setVerticalScrollBarEnabled(true);
                    hi3 hi3Var3 = cj3Var.D0;
                    if (hi3Var3 != null) {
                        hi3Var3.setBackground(null);
                    }
                    cj3Var.y1 = null;
                    return;
                }
                return;
            case 1:
                cj3Var.T3 = null;
                if (!z && (r7Var = cj3Var.n0) != null) {
                    r7Var.setVisibility(8);
                    return;
                }
                return;
            default:
                cj3Var.J = null;
                cj3Var.L = z;
                if (!z && !cj3Var.M) {
                    cj3Var.F0.setVisibility(8);
                }
                if (!z) {
                    cj3Var.S4(0.0f);
                    cj3Var.A3 = gl.L(81.0f);
                } else {
                    cj3Var.A3 = -gl.L(81.0f);
                    cj3Var.S4(-cj3Var.p3());
                }
                while (true) {
                    bj3[] bj3VarArr = cj3Var.f0;
                    if (i2 < bj3VarArr.length) {
                        bj3 bj3Var = bj3VarArr[i2];
                        if (bj3Var != null) {
                            bj3Var.a.requestLayout();
                        }
                        i2++;
                    } else {
                        View view2 = cj3Var.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }
}
