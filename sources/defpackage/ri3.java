package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.ui.ActionBar.e;
public final class ri3 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final uj3 c;

    public ri3(uj3 uj3Var, boolean z, byte b) {
        this.a = b;
        this.c = uj3Var;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                uj3 uj3Var = this.c;
                uj3Var.r3.e();
                if (uj3Var.y1 == animator) {
                    tj3[] tj3VarArr = uj3Var.f0;
                    if (this.b) {
                        tj3VarArr[0].a.e1();
                    } else {
                        qj3 qj3Var = tj3VarArr[0].a;
                        if (qj3Var.h1) {
                            qj3Var.h1 = false;
                            qj3Var.M0(false);
                        }
                    }
                    uj3Var.y1 = null;
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
        s7 s7Var;
        byte b = this.a;
        int i2 = 0;
        float f = 0.0f;
        boolean z = this.b;
        uj3 uj3Var = this.c;
        switch (b) {
            case 0:
                uj3Var.r3.e();
                if (uj3Var.y1 == animator) {
                    uj3Var.U4(false, true);
                    if (z) {
                        uj3Var.f0[0].a.e1();
                        ii3 ii3Var = uj3Var.F0;
                        if (ii3Var != null) {
                            ii3Var.setVisibility(8);
                        }
                        uj3Var.t3 = true;
                        Activity parentActivity = uj3Var.getParentActivity();
                        i = ((e) uj3Var).classGuid;
                        hl.V2(parentActivity, i);
                        uj3Var.k0.setVisibility(8);
                        li3 li3Var = uj3Var.H3;
                        if (li3Var != null) {
                            li3Var.setVisibility(8);
                        }
                    } else {
                        uj3Var.u3 = false;
                        bj3 bj3Var = uj3Var.D0;
                        if (bj3Var != null) {
                            bj3Var.setVisibility(8);
                        }
                        hj3 hj3Var = uj3Var.Y;
                        if (hj3Var != null) {
                            hj3Var.d();
                        }
                        bj3 bj3Var2 = uj3Var.D0;
                        if (bj3Var2 != null) {
                            bj3Var2.D0.clear();
                            bj3Var2.M();
                        }
                        qj3 qj3Var = uj3Var.f0[0].a;
                        if (qj3Var.h1) {
                            qj3Var.h1 = false;
                            qj3Var.M0(false);
                        }
                        uj3Var.t3 = false;
                        li3 li3Var2 = uj3Var.H3;
                        if (li3Var2 != null) {
                            li3Var2.setVisibility(0);
                        }
                    }
                    View view = uj3Var.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z) {
                        f = 1.0f;
                    }
                    uj3Var.X4(f);
                    uj3Var.f0[0].a.setVerticalScrollBarEnabled(true);
                    bj3 bj3Var3 = uj3Var.D0;
                    if (bj3Var3 != null) {
                        bj3Var3.setBackground(null);
                    }
                    uj3Var.y1 = null;
                    return;
                }
                return;
            case 1:
                uj3Var.V3 = null;
                if (!z && (s7Var = uj3Var.n0) != null) {
                    s7Var.setVisibility(8);
                    return;
                }
                return;
            default:
                uj3Var.J = null;
                uj3Var.L = z;
                if (!z && !uj3Var.M) {
                    uj3Var.F0.setVisibility(8);
                }
                if (!z) {
                    uj3Var.W4(0.0f);
                    uj3Var.A3 = hl.L(81.0f);
                } else {
                    uj3Var.A3 = -hl.L(81.0f);
                    uj3Var.W4(-uj3Var.r3());
                }
                while (true) {
                    tj3[] tj3VarArr = uj3Var.f0;
                    if (i2 < tj3VarArr.length) {
                        tj3 tj3Var = tj3VarArr[i2];
                        if (tj3Var != null) {
                            tj3Var.a.requestLayout();
                        }
                        i2++;
                    } else {
                        View view2 = uj3Var.fragmentView;
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
