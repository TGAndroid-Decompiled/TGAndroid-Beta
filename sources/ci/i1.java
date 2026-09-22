package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i81;
import org.telegram.ui.a41;
import org.telegram.ui.aq0;
import org.telegram.ui.b41;
import org.telegram.ui.bo;
import org.telegram.ui.c41;
import org.telegram.ui.le1;
import org.telegram.ui.mw0;
import org.telegram.ui.up0;
import org.telegram.ui.za1;
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
                za1.Y((za1) this.U);
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
                    ((fi.k0) this.U).v.d.Y2.N(false);
                    return;
                }
                return;
            case 7:
                za1 za1Var = (za1) this.U;
                za1Var.m0(za1Var.f40120i0.getCurrentPosition(), true);
                za1Var.n0(0.0f, false);
                za1.W(za1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        a41 a41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof b41) && (a41Var = ((b41) getCurrentView()).f32034n) != null) {
                    AndroidUtilities.hideKeyboard(a41Var);
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
                i1 i1Var = t2Var.f5546f;
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
                fi.k0.s((fi.k0) this.U).invalidate();
                return;
            case 3:
                bo boVar = (bo) this.U;
                boVar.X0.getClass();
                boVar.X0.getClass();
                boVar.l7();
                boVar.q9(1);
                return;
            case 4:
                aq0 aq0Var = (aq0) this.U;
                float positionAnimated = aq0Var.I.getPositionAnimated();
                aq0Var.M.setSelected(positionAnimated);
                aq0Var.e.setProgressToGradient(1.0f - w7.p.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                aq0Var.G0();
                up0 C0 = aq0Var.C0();
                d dVar = aq0Var.Q;
                if (dVar != null && C0 != null && C0 != aq0Var.R) {
                    aq0Var.R = C0;
                    n7.a1 a1Var = C0.e;
                    dVar.g((CharSequence) a1Var.f15106b, true, true);
                    aq0Var.Q.f((SpannableStringBuilder) a1Var.f15107c, true);
                }
                aq0Var.D0(1);
                return;
            case 5:
                ((mw0) this.U).e();
                return;
            case 6:
                c41.o((c41) this.U).invalidate();
                return;
            case 7:
                za1 za1Var = (za1) this.U;
                float positionAnimated2 = za1Var.f40120i0.getPositionAnimated();
                za1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    za1Var.m0(Math.round(positionAnimated2), true);
                }
                za1.W(za1Var);
                za1.Y(za1Var);
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
                    bo boVar = (bo) this.U;
                    if (boVar.f32456s1) {
                        boVar.f32456s1 = false;
                        boVar.f32429q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public i1(Context context, org.telegram.ui.ActionBar.e6 e6Var, bo boVar) {
        super(context, e6Var);
        this.T = 3;
        this.U = boVar;
    }
}
