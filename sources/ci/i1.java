package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w81;
import org.telegram.ui.de1;
import org.telegram.ui.dw0;
import org.telegram.ui.np0;
import org.telegram.ui.r31;
import org.telegram.ui.s31;
import org.telegram.ui.sa1;
import org.telegram.ui.t31;
import org.telegram.ui.tp0;
import org.telegram.ui.wn;
public final class i1 extends w81 {
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
                sa1.Y((sa1) this.U);
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
                sa1 sa1Var = (sa1) this.U;
                sa1Var.m0(sa1Var.f37664i0.getCurrentPosition(), true);
                sa1Var.n0(0.0f, false);
                sa1.W(sa1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        r31 r31Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof s31) && (r31Var = ((s31) getCurrentView()).f37570n) != null) {
                    AndroidUtilities.hideKeyboard(r31Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        switch (this.T) {
            case 0:
                s2 s2Var = (s2) this.U;
                i1 i1Var = s2Var.f5474f;
                r2 r2Var = s2Var.h;
                if (r2Var != null) {
                    r2Var.F = i1Var.getPositionAnimated();
                    r2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.e3) s2Var).containerView;
                viewGroup.invalidate();
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
                wn wnVar = (wn) this.U;
                wnVar.X0.getClass();
                wnVar.X0.getClass();
                wnVar.l7();
                wnVar.q9(1);
                return;
            case 4:
                tp0 tp0Var = (tp0) this.U;
                float positionAnimated = tp0Var.I.getPositionAnimated();
                tp0Var.M.setSelected(positionAnimated);
                tp0Var.e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                tp0Var.G0();
                np0 C0 = tp0Var.C0();
                d dVar = tp0Var.Q;
                if (dVar != null && C0 != null && C0 != tp0Var.R) {
                    tp0Var.R = C0;
                    n7.z0 z0Var = C0.e;
                    dVar.g((CharSequence) z0Var.f15395b, true, true);
                    tp0Var.Q.f((SpannableStringBuilder) z0Var.f15396c, true);
                }
                tp0Var.D0(1);
                return;
            case 5:
                ((dw0) this.U).e();
                return;
            case 6:
                t31.o((t31) this.U).invalidate();
                return;
            case 7:
                sa1 sa1Var = (sa1) this.U;
                float positionAnimated2 = sa1Var.f37664i0.getPositionAnimated();
                sa1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    sa1Var.m0(Math.round(positionAnimated2), true);
                }
                sa1.W(sa1Var);
                sa1.Y(sa1Var);
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
                    wn wnVar = (wn) this.U;
                    if (wnVar.f39617s1) {
                        wnVar.f39617s1 = false;
                        wnVar.f39590q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public i1(Context context, org.telegram.ui.ActionBar.d6 d6Var, wn wnVar) {
        super(context, d6Var);
        this.T = 3;
        this.U = wnVar;
    }
}
