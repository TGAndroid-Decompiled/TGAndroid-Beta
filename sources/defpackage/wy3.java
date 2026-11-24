package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class wy3 extends o39 {
    public boolean f3;
    public boolean g3;
    public final t14 h3;

    public wy3(t14 t14Var, Context context) {
        super(context, null);
        this.h3 = t14Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xv2 e = xv2.e();
        t14 t14Var = this.h3;
        boolean g = e.g(motionEvent, t14Var.i0, t14Var.h2, this.o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !g) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        t14 t14Var = this.h3;
        if (t14Var.r0 && t14Var.o0.H > 1) {
            this.f3 = true;
            t14Var.j0.g1(0, 0);
            t14Var.p0.setVisibility(0);
            t14Var.q0.k(0, 0);
            t14Var.r0 = false;
            this.f3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        t14Var.k(true);
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
