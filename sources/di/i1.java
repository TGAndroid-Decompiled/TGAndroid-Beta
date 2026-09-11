package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i81;
import org.telegram.ui.bb1;
import org.telegram.ui.bq0;
import org.telegram.ui.c41;
import org.telegram.ui.co;
import org.telegram.ui.d41;
import org.telegram.ui.e41;
import org.telegram.ui.le1;
import org.telegram.ui.lw0;
import org.telegram.ui.vp0;
public final class i1 extends i81 {
    public final int T;
    public final Object U;

    public i1(Object obj, Context context, int i10) {
        super(context, null);
        this.T = i10;
        this.U = obj;
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.i1.i(android.view.MotionEvent):boolean");
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
                bb1.Y((bb1) this.U);
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
                ia iaVar = (ia) this.U;
                if (ia.d0(iaVar)) {
                    iaVar.f1();
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
                    ((gi.k0) this.U).v.d.Y2.N(false);
                    return;
                }
                return;
            case 7:
                bb1 bb1Var = (bb1) this.U;
                bb1Var.m0(bb1Var.f34703i0.getCurrentPosition(), true);
                bb1Var.n0(0.0f, false);
                bb1.W(bb1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        c41 c41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof d41) && (c41Var = ((d41) getCurrentView()).f35650n) != null) {
                    AndroidUtilities.hideKeyboard(c41Var);
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
                t2 t2Var = (t2) this.U;
                i1 i1Var = t2Var.f8170f;
                s2 s2Var = t2Var.h;
                if (s2Var != null) {
                    s2Var.F = i1Var.getPositionAnimated();
                    s2Var.invalidate();
                }
                t2.b0(t2Var).invalidate();
                invalidate();
                t2.G = i1Var.getCurrentPosition();
                return;
            case 1:
                ia.c0((ia) this.U).invalidate();
                return;
            case 2:
                gi.k0.s((gi.k0) this.U).invalidate();
                return;
            case 3:
                co coVar = (co) this.U;
                coVar.X0.getClass();
                coVar.X0.getClass();
                coVar.l7();
                coVar.q9(1);
                return;
            case 4:
                bq0 bq0Var = (bq0) this.U;
                float positionAnimated = bq0Var.I.getPositionAnimated();
                bq0Var.M.setSelected(positionAnimated);
                bq0Var.f34864e.setProgressToGradient(1.0f - w7.p.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                bq0Var.G0();
                vp0 C0 = bq0Var.C0();
                d dVar = bq0Var.Q;
                if (dVar != null && C0 != null && C0 != bq0Var.R) {
                    bq0Var.R = C0;
                    n7.z0 z0Var = C0.f41606e;
                    dVar.g((CharSequence) z0Var.f16703b, true, true);
                    bq0Var.Q.f((SpannableStringBuilder) z0Var.f16704c, true);
                }
                bq0Var.D0(1);
                return;
            case 5:
                ((lw0) this.U).e();
                return;
            case 6:
                e41.o((e41) this.U).invalidate();
                return;
            case 7:
                bb1 bb1Var = (bb1) this.U;
                float positionAnimated2 = bb1Var.f34703i0.getPositionAnimated();
                bb1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    bb1Var.m0(Math.round(positionAnimated2), true);
                }
                bb1.W(bb1Var);
                bb1.Y(bb1Var);
                return;
            default:
                ((le1) this.U).e();
                return;
        }
    }

    @Override
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    co coVar = (co) this.U;
                    if (coVar.f35410s1) {
                        coVar.f35410s1 = false;
                        coVar.f35383q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public i1(Context context, org.telegram.ui.ActionBar.f6 f6Var, co coVar) {
        super(context, f6Var);
        this.T = 3;
        this.U = coVar;
    }
}
