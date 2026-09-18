package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j81;
import org.telegram.ui.ab1;
import org.telegram.ui.b41;
import org.telegram.ui.bo;
import org.telegram.ui.c41;
import org.telegram.ui.cq0;
import org.telegram.ui.d41;
import org.telegram.ui.me1;
import org.telegram.ui.ow0;
import org.telegram.ui.wp0;
public final class i1 extends j81 {
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
                    bo boVar = (bo) this.V;
                    if (boVar.f32443s1) {
                        boVar.f32443s1 = false;
                        boVar.f32416q1.h.clear();
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
                ab1.Y((ab1) this.V);
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
                ab1 ab1Var = (ab1) this.V;
                ab1Var.m0(ab1Var.f31798i0.getCurrentPosition(), true);
                ab1Var.n0(0.0f, false);
                ab1.W(ab1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        b41 b41Var;
        switch (this.U) {
            case 6:
                if ((getCurrentView() instanceof c41) && (b41Var = ((c41) getCurrentView()).f32668n) != null) {
                    AndroidUtilities.hideKeyboard(b41Var);
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
                bo boVar = (bo) this.V;
                boVar.X0.getClass();
                boVar.X0.getClass();
                boVar.l7();
                boVar.q9(1);
                return;
            case 4:
                cq0 cq0Var = (cq0) this.V;
                float positionAnimated = cq0Var.I.getPositionAnimated();
                cq0Var.M.setSelected(positionAnimated);
                cq0Var.e.setProgressToGradient(1.0f - w7.p.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                cq0Var.G0();
                wp0 C0 = cq0Var.C0();
                d dVar = cq0Var.Q;
                if (dVar != null && C0 != null && C0 != cq0Var.R) {
                    cq0Var.R = C0;
                    n7.a1 a1Var = C0.e;
                    dVar.g((CharSequence) a1Var.f15118b, true, true);
                    cq0Var.Q.f((SpannableStringBuilder) a1Var.f15119c, true);
                }
                cq0Var.D0(1);
                return;
            case 5:
                ((ow0) this.V).e();
                return;
            case 6:
                d41.o((d41) this.V).invalidate();
                return;
            case 7:
                ab1 ab1Var = (ab1) this.V;
                float positionAnimated2 = ab1Var.f31798i0.getPositionAnimated();
                ab1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    ab1Var.m0(Math.round(positionAnimated2), true);
                }
                ab1.W(ab1Var);
                ab1.Y(ab1Var);
                return;
            default:
                ((me1) this.V).e();
                return;
        }
    }

    public i1(Context context, org.telegram.ui.ActionBar.f6 f6Var, bo boVar) {
        super(context, f6Var);
        this.U = 3;
        this.V = boVar;
    }
}
