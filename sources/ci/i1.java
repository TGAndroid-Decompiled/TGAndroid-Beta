package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h81;
import org.telegram.ui.de1;
import org.telegram.ui.fw0;
import org.telegram.ui.op0;
import org.telegram.ui.ra1;
import org.telegram.ui.s31;
import org.telegram.ui.t31;
import org.telegram.ui.u31;
import org.telegram.ui.up0;
import org.telegram.ui.xn;
public final class i1 extends h81 {
    public final int T;
    public final Object U;

    public i1(Object obj, Context context, int i10) {
        super(context, null);
        this.T = i10;
        this.U = obj;
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.i1.i(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.T) {
            case 2:
                if (getCurrentPosition() != 2) {
                    return true;
                }
                return false;
            default:
                return super.j(motionEvent);
        }
    }

    @Override
    public boolean k(MotionEvent motionEvent) {
        switch (this.T) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T) {
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                ra1.Y((ra1) this.U);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void t(View view, View view2, int i10, int i11) {
        switch (this.T) {
            case 1:
                fa faVar = (fa) this.U;
                if (fa.d0(faVar)) {
                    faVar.f1();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void u() {
        switch (this.T) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((fi.k0) this.U).v.d.Y2.N(false);
                    return;
                }
                return;
            case 7:
                ra1 ra1Var = (ra1) this.U;
                ra1Var.m0(ra1Var.f36764i0.getCurrentPosition(), true);
                ra1Var.n0(0.0f, false);
                ra1.W(ra1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        s31 s31Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof t31) && (s31Var = ((t31) getCurrentView()).f37516n) != null) {
                    AndroidUtilities.hideKeyboard(s31Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                s2 s2Var = (s2) this.U;
                i1 i1Var = s2Var.f5474f;
                r2 r2Var = s2Var.h;
                if (r2Var != null) {
                    r2Var.F = i1Var.getPositionAnimated();
                    r2Var.invalidate();
                }
                s2.b0(s2Var).invalidate();
                invalidate();
                s2.G = i1Var.getCurrentPosition();
                return;
            case 1:
                fa.c0((fa) this.U).invalidate();
                return;
            case 2:
                fi.k0.s((fi.k0) this.U).invalidate();
                return;
            case 3:
                xn xnVar = (xn) this.U;
                xnVar.X0.getClass();
                xnVar.X0.getClass();
                xnVar.l7();
                xnVar.q9(1);
                return;
            case 4:
                up0 up0Var = (up0) this.U;
                float positionAnimated = up0Var.I.getPositionAnimated();
                up0Var.M.setSelected(positionAnimated);
                up0Var.e.setProgressToGradient(1.0f - w7.p.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                up0Var.G0();
                op0 C0 = up0Var.C0();
                d dVar = up0Var.Q;
                if (dVar != null && C0 != null && C0 != up0Var.R) {
                    up0Var.R = C0;
                    n7.a1 a1Var = C0.e;
                    dVar.g((CharSequence) a1Var.f15083b, true, true);
                    up0Var.Q.f((SpannableStringBuilder) a1Var.f15084c, true);
                }
                up0Var.D0(1);
                return;
            case 5:
                ((fw0) this.U).e();
                return;
            case 6:
                u31.o((u31) this.U).invalidate();
                return;
            case 7:
                ra1 ra1Var = (ra1) this.U;
                float positionAnimated2 = ra1Var.f36764i0.getPositionAnimated();
                ra1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    ra1Var.m0(Math.round(positionAnimated2), true);
                }
                ra1.W(ra1Var);
                ra1.Y(ra1Var);
                return;
            default:
                ((de1) this.U).e();
                return;
        }
    }

    @Override
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    xn xnVar = (xn) this.U;
                    if (xnVar.f39533s1) {
                        xnVar.f39533s1 = false;
                        xnVar.f39506q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public i1(Context context, org.telegram.ui.ActionBar.d6 d6Var, xn xnVar) {
        super(context, d6Var);
        this.T = 3;
        this.U = xnVar;
    }
}
