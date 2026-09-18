package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x81;
import org.telegram.ui.a41;
import org.telegram.ui.b41;
import org.telegram.ui.cq0;
import org.telegram.ui.ke1;
import org.telegram.ui.mw0;
import org.telegram.ui.wp0;
import org.telegram.ui.z31;
import org.telegram.ui.za1;
import org.telegram.ui.zn;
public final class i1 extends x81 {
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
                    zn znVar = (zn) this.V;
                    if (znVar.f40425s1) {
                        znVar.f40425s1 = false;
                        znVar.f40398q1.h.clear();
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.U) {
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                za1.Y((za1) this.V);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
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
                ia iaVar = (ia) this.V;
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
        switch (this.U) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((fi.k0) this.V).v.d.Y2.N(false);
                    return;
                }
                return;
            case 7:
                za1 za1Var = (za1) this.V;
                za1Var.m0(za1Var.f40044i0.getCurrentPosition(), true);
                za1Var.n0(0.0f, false);
                za1.W(za1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        z31 z31Var;
        switch (this.U) {
            case 6:
                if ((getCurrentView() instanceof a41) && (z31Var = ((a41) getCurrentView()).f31949n) != null) {
                    AndroidUtilities.hideKeyboard(z31Var);
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
                t2 t2Var = (t2) this.V;
                i1 i1Var = t2Var.f5549f;
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
                ia.c0((ia) this.V).invalidate();
                return;
            case 2:
                fi.k0.s((fi.k0) this.V).invalidate();
                return;
            case 3:
                zn znVar = (zn) this.V;
                znVar.X0.getClass();
                znVar.X0.getClass();
                znVar.l7();
                znVar.q9(1);
                return;
            case 4:
                cq0 cq0Var = (cq0) this.V;
                float positionAnimated = cq0Var.I.getPositionAnimated();
                cq0Var.M.setSelected(positionAnimated);
                cq0Var.e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                cq0Var.G0();
                wp0 C0 = cq0Var.C0();
                d dVar = cq0Var.Q;
                if (dVar != null && C0 != null && C0 != cq0Var.R) {
                    cq0Var.R = C0;
                    n7.z0 z0Var = C0.e;
                    dVar.g((CharSequence) z0Var.f15367b, true, true);
                    cq0Var.Q.f((SpannableStringBuilder) z0Var.f15368c, true);
                }
                cq0Var.D0(1);
                return;
            case 5:
                ((mw0) this.V).e();
                return;
            case 6:
                b41.o((b41) this.V).invalidate();
                return;
            case 7:
                za1 za1Var = (za1) this.V;
                float positionAnimated2 = za1Var.f40044i0.getPositionAnimated();
                za1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    za1Var.m0(Math.round(positionAnimated2), true);
                }
                za1.W(za1Var);
                za1.Y(za1Var);
                return;
            default:
                ((ke1) this.V).e();
                return;
        }
    }

    public i1(Context context, org.telegram.ui.ActionBar.e6 e6Var, zn znVar) {
        super(context, e6Var);
        this.U = 3;
        this.V = znVar;
    }
}
