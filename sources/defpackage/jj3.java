package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class jj3 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final nk3 c;

    public jj3(nk3 nk3Var, boolean z, byte b) {
        this.a = b;
        this.c = nk3Var;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                nk3 nk3Var = this.c;
                nk3Var.r3.e();
                if (nk3Var.y1 == animator) {
                    mk3[] mk3VarArr = nk3Var.f0;
                    if (this.b) {
                        mk3VarArr[0].a.d1();
                    } else {
                        jk3 jk3Var = mk3VarArr[0].a;
                        if (jk3Var.h1) {
                            jk3Var.h1 = false;
                            jk3Var.L0(false);
                        }
                    }
                    nk3Var.y1 = null;
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
        nk3 nk3Var = this.c;
        switch (b) {
            case 0:
                nk3Var.r3.e();
                if (nk3Var.y1 == animator) {
                    nk3Var.U4(false, true);
                    if (z) {
                        nk3Var.f0[0].a.d1();
                        aj3 aj3Var = nk3Var.F0;
                        if (aj3Var != null) {
                            aj3Var.setVisibility(8);
                        }
                        nk3Var.t3 = true;
                        Activity parentActivity = nk3Var.getParentActivity();
                        i = ((d) nk3Var).classGuid;
                        gm.V2(parentActivity, i);
                        nk3Var.k0.setVisibility(8);
                        dj3 dj3Var = nk3Var.H3;
                        if (dj3Var != null) {
                            dj3Var.setVisibility(8);
                        }
                    } else {
                        nk3Var.u3 = false;
                        sj3 sj3Var = nk3Var.D0;
                        if (sj3Var != null) {
                            sj3Var.setVisibility(8);
                        }
                        zj3 zj3Var = nk3Var.Y;
                        if (zj3Var != null) {
                            zj3Var.c();
                        }
                        sj3 sj3Var2 = nk3Var.D0;
                        if (sj3Var2 != null) {
                            sj3Var2.D0.clear();
                            sj3Var2.L();
                        }
                        jk3 jk3Var = nk3Var.f0[0].a;
                        if (jk3Var.h1) {
                            jk3Var.h1 = false;
                            jk3Var.L0(false);
                        }
                        nk3Var.t3 = false;
                        dj3 dj3Var2 = nk3Var.H3;
                        if (dj3Var2 != null) {
                            dj3Var2.setVisibility(0);
                        }
                    }
                    View view = nk3Var.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z) {
                        f = 1.0f;
                    }
                    nk3Var.X4(f);
                    nk3Var.f0[0].a.setVerticalScrollBarEnabled(true);
                    sj3 sj3Var3 = nk3Var.D0;
                    if (sj3Var3 != null) {
                        sj3Var3.setBackground(null);
                    }
                    nk3Var.y1 = null;
                    return;
                }
                return;
            case 1:
                nk3Var.V3 = null;
                if (!z && (r7Var = nk3Var.n0) != null) {
                    r7Var.setVisibility(8);
                    return;
                }
                return;
            default:
                nk3Var.J = null;
                nk3Var.L = z;
                if (!z && !nk3Var.M) {
                    nk3Var.F0.setVisibility(8);
                }
                if (!z) {
                    nk3Var.W4(0.0f);
                    nk3Var.A3 = gm.L(81.0f);
                } else {
                    nk3Var.A3 = -gm.L(81.0f);
                    nk3Var.W4(-nk3Var.r3());
                }
                while (true) {
                    mk3[] mk3VarArr = nk3Var.f0;
                    if (i2 < mk3VarArr.length) {
                        mk3 mk3Var = mk3VarArr[i2];
                        if (mk3Var != null) {
                            mk3Var.a.requestLayout();
                        }
                        i2++;
                    } else {
                        View view2 = nk3Var.fragmentView;
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
