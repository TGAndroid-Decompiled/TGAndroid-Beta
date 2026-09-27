package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y81;
import org.telegram.ui.ee1;
import org.telegram.ui.gw0;
import org.telegram.ui.qp0;
import org.telegram.ui.ra1;
import org.telegram.ui.t31;
import org.telegram.ui.u31;
import org.telegram.ui.v31;
import org.telegram.ui.wp0;
import org.telegram.ui.xn;
public final class i1 extends y81 {
    public final int U;
    public final Object V;

    public i1(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public void A(int i10) {
        switch (this.U) {
            case 3:
                if (i10 == 0) {
                    xn xnVar = (xn) this.V;
                    if (xnVar.f39914s1) {
                        xnVar.f39914s1 = false;
                        xnVar.f39887q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.i1.i(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.U) {
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
        switch (this.U) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.U) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void t(View view, View view2, int i10, int i11) {
        switch (this.U) {
            case 1:
                ea eaVar = (ea) this.V;
                if (ea.d0(eaVar)) {
                    eaVar.f1();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void u() {
        switch (this.U) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((fi.k0) this.V).v.d.Y2.N(false);
                    return;
                }
                return;
            case 7:
                ra1 ra1Var = (ra1) this.V;
                ra1Var.k0(ra1Var.f37065h0.getCurrentPosition(), true);
                ra1Var.l0(0.0f, false);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        t31 t31Var;
        switch (this.U) {
            case 6:
                if ((getCurrentView() instanceof u31) && (t31Var = ((u31) getCurrentView()).f38116n) != null) {
                    AndroidUtilities.hideKeyboard(t31Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                s2 s2Var = (s2) this.V;
                i1 i1Var = s2Var.f5478f;
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
                ea.c0((ea) this.V).invalidate();
                return;
            case 2:
                fi.k0.s((fi.k0) this.V).invalidate();
                return;
            case 3:
                xn xnVar = (xn) this.V;
                xnVar.X0.getClass();
                xnVar.X0.getClass();
                xnVar.l7();
                xnVar.q9(1);
                return;
            case 4:
                wp0 wp0Var = (wp0) this.V;
                float positionAnimated = wp0Var.I.getPositionAnimated();
                wp0Var.M.setSelected(positionAnimated);
                wp0Var.e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                wp0Var.G0();
                qp0 C0 = wp0Var.C0();
                d dVar = wp0Var.Q;
                if (dVar != null && C0 != null && C0 != wp0Var.R) {
                    wp0Var.R = C0;
                    n7.z0 z0Var = C0.e;
                    dVar.g((CharSequence) z0Var.f15445b, true, true);
                    wp0Var.Q.f((SpannableStringBuilder) z0Var.f15446c, true);
                }
                wp0Var.D0(1);
                return;
            case 5:
                ((gw0) this.V).e();
                return;
            case 6:
                v31.o((v31) this.V).invalidate();
                return;
            case 7:
                ra1 ra1Var = (ra1) this.V;
                float positionAnimated2 = ra1Var.f37065h0.getPositionAnimated();
                ra1Var.l0(positionAnimated2, !z10);
                if (!z10) {
                    ra1Var.k0(Math.round(positionAnimated2), true);
                    return;
                }
                return;
            default:
                ((ee1) this.V).e();
                return;
        }
    }

    public i1(Context context, org.telegram.ui.ActionBar.e6 e6Var, xn xnVar) {
        super(context, e6Var);
        this.U = 3;
        this.V = xnVar;
    }
}
