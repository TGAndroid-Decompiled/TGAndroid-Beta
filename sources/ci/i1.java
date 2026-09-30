package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y81;
import org.telegram.ui.de1;
import org.telegram.ui.dw0;
import org.telegram.ui.mp0;
import org.telegram.ui.r31;
import org.telegram.ui.s31;
import org.telegram.ui.sa1;
import org.telegram.ui.sp0;
import org.telegram.ui.t31;
import org.telegram.ui.wn;
public final class i1 extends y81 {
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
                    ((fi.k0) this.U).v.d.f28778f3.N(false);
                    return;
                }
                return;
            case 7:
                sa1 sa1Var = (sa1) this.U;
                sa1Var.m0(sa1Var.f37775i0.getCurrentPosition(), true);
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
                if ((getCurrentView() instanceof s31) && (r31Var = ((s31) getCurrentView()).f37681n) != null) {
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
        switch (this.T) {
            case 0:
                s2 s2Var = (s2) this.U;
                i1 i1Var = s2Var.f5483f;
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
                wn wnVar = (wn) this.U;
                wnVar.X0.getClass();
                wnVar.X0.getClass();
                wnVar.l7();
                wnVar.q9(1);
                return;
            case 4:
                sp0 sp0Var = (sp0) this.U;
                float positionAnimated = sp0Var.I.getPositionAnimated();
                sp0Var.M.setSelected(positionAnimated);
                sp0Var.e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                sp0Var.G0();
                mp0 C0 = sp0Var.C0();
                d dVar = sp0Var.Q;
                if (dVar != null && C0 != null && C0 != sp0Var.R) {
                    sp0Var.R = C0;
                    n7.z0 z0Var = C0.e;
                    dVar.g((CharSequence) z0Var.f15426b, true, true);
                    sp0Var.Q.f((SpannableStringBuilder) z0Var.f15427c, true);
                }
                sp0Var.D0(1);
                return;
            case 5:
                ((dw0) this.U).e();
                return;
            case 6:
                t31.o((t31) this.U).invalidate();
                return;
            case 7:
                sa1 sa1Var = (sa1) this.U;
                float positionAnimated2 = sa1Var.f37775i0.getPositionAnimated();
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
                    if (wnVar.f39725s1) {
                        wnVar.f39725s1 = false;
                        wnVar.f39698q1.h.clear();
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
