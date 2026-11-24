package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class g04 extends r59 {
    public boolean f3;
    public boolean g3;
    public final e34 h3;

    public g04(e34 e34Var, Context context) {
        super(context, null);
        this.h3 = e34Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hx2 e = hx2.e();
        e34 e34Var = this.h3;
        boolean g = e.g(motionEvent, e34Var.i0, e34Var.h2, this.o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !g) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e34 e34Var = this.h3;
        if (e34Var.r0 && e34Var.o0.H > 1) {
            this.f3 = true;
            e34Var.j0.g1(0, 0);
            e34Var.p0.setVisibility(0);
            e34Var.q0.k(0, 0);
            e34Var.r0 = false;
            this.f3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        e34Var.k(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.g3) {
            this.h3.o0.f();
            this.g3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
