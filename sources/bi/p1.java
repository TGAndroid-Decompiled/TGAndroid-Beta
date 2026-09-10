package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v81;
import org.telegram.ui.bq0;
import org.telegram.ui.eo;
import org.telegram.ui.f41;
import org.telegram.ui.fb1;
import org.telegram.ui.g41;
import org.telegram.ui.h41;
import org.telegram.ui.ow0;
import org.telegram.ui.pe1;
import org.telegram.ui.up0;
public final class p1 extends v81 {
    public final int T;
    public final Object U;

    public p1(Object obj, Context context, int i10) {
        super(context, null);
        this.T = i10;
        this.U = obj;
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.p1.i(android.view.MotionEvent):boolean");
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
                fb1.Y((fb1) this.U);
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
                rb rbVar = (rb) this.U;
                if (rb.d0(rbVar)) {
                    rbVar.f1();
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
                    ((ei.k0) this.U).v.d.Y2.N(false);
                    return;
                }
                return;
            case 7:
                fb1 fb1Var = (fb1) this.U;
                fb1Var.m0(fb1Var.f32752i0.getCurrentPosition(), true);
                fb1Var.n0(0.0f, false);
                fb1.W(fb1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        f41 f41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof g41) && (f41Var = ((g41) getCurrentView()).f32992n) != null) {
                    AndroidUtilities.hideKeyboard(f41Var);
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
                f3 f3Var = (f3) this.U;
                p1 p1Var = f3Var.f2693f;
                e3 e3Var = f3Var.h;
                if (e3Var != null) {
                    e3Var.F = p1Var.getPositionAnimated();
                    e3Var.invalidate();
                }
                f3.b0(f3Var).invalidate();
                invalidate();
                f3.G = p1Var.getCurrentPosition();
                return;
            case 1:
                rb.c0((rb) this.U).invalidate();
                return;
            case 2:
                ei.k0.s((ei.k0) this.U).invalidate();
                return;
            case 3:
                eo eoVar = (eo) this.U;
                eoVar.X0.getClass();
                eoVar.X0.getClass();
                eoVar.l7();
                eoVar.q9(1);
                return;
            case 4:
                bq0 bq0Var = (bq0) this.U;
                float positionAnimated = bq0Var.I.getPositionAnimated();
                bq0Var.M.setSelected(positionAnimated);
                bq0Var.e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                bq0Var.G0();
                up0 C0 = bq0Var.C0();
                d dVar = bq0Var.Q;
                if (dVar != null && C0 != null && C0 != bq0Var.R) {
                    bq0Var.R = C0;
                    og.u0 u0Var = C0.e;
                    dVar.g((CharSequence) u0Var.f14497b, true, true);
                    bq0Var.Q.f((SpannableStringBuilder) u0Var.f14498c, true);
                }
                bq0Var.D0(1);
                return;
            case 5:
                ((ow0) this.U).e();
                return;
            case 6:
                h41.o((h41) this.U).invalidate();
                return;
            case 7:
                fb1 fb1Var = (fb1) this.U;
                float positionAnimated2 = fb1Var.f32752i0.getPositionAnimated();
                fb1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    fb1Var.m0(Math.round(positionAnimated2), true);
                }
                fb1.W(fb1Var);
                fb1.Y(fb1Var);
                return;
            default:
                ((pe1) this.U).e();
                return;
        }
    }

    @Override
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    eo eoVar = (eo) this.U;
                    if (eoVar.f32479s1) {
                        eoVar.f32479s1 = false;
                        eoVar.f32452q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public p1(Context context, org.telegram.ui.ActionBar.f6 f6Var, eo eoVar) {
        super(context, f6Var);
        this.T = 3;
        this.U = eoVar;
    }
}
