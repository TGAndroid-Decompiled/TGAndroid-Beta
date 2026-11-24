package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class bz3 extends q39 {
    public boolean g3;
    public final t14 h3;

    public bz3(t14 t14Var, Context context) {
        super(context, null);
        this.h3 = t14Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.n2.g();
    }

    @Override
    public final void m0(int i) {
        int i2;
        t14 t14Var = this.h3;
        o14 o14Var = t14Var.A0;
        if (t14Var.D0 != null) {
            gz3 gz3Var = t14Var.C0;
            if (t14Var.E0.canScrollVertically(-1)) {
                i2 = gl.e1();
            } else {
                i2 = 0;
            }
            gz3Var.setUnderlineHeight(i2);
        }
        if (o14Var != null && getAdapter() == o14Var && o14Var.d == 0) {
            o14 o14Var2 = o14Var.P.x;
            if (!o14Var2.R.H0.G && !o14Var2.E) {
                if (t14Var.F0.M0() + 50 > o14Var.b()) {
                    n14 n14Var = o14Var.P;
                    Objects.requireNonNull(n14Var);
                    gl.c3(new az3(n14Var, (byte) 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        t14 t14Var = this.h3;
        if (!t14Var.f) {
            xv2 e = xv2.e();
            bz3 bz3Var = t14Var.E0;
            t14Var.getMeasuredHeight();
            boolean g = e.g(motionEvent, bz3Var, t14Var.h2, this.o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !g) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        t14 t14Var = this.h3;
        if (t14Var.J0 && t14Var.z0.b() > 0) {
            this.g3 = true;
            t14Var.F0.g1(0, 0);
            t14Var.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        t14Var.n(true);
    }

    @Override
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
