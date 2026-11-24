package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class l04 extends t59 {
    public boolean g3;
    public final e34 h3;

    public l04(e34 e34Var, Context context) {
        super(context, null);
        this.h3 = e34Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.n2.g();
    }

    @Override
    public final void m0(int i) {
        int i2;
        e34 e34Var = this.h3;
        z24 z24Var = e34Var.A0;
        if (e34Var.D0 != null) {
            q04 q04Var = e34Var.C0;
            if (e34Var.E0.canScrollVertically(-1)) {
                i2 = gm.e1();
            } else {
                i2 = 0;
            }
            q04Var.setUnderlineHeight(i2);
        }
        if (z24Var != null && getAdapter() == z24Var && z24Var.d == 0) {
            z24 z24Var2 = z24Var.P.x;
            if (!z24Var2.R.H0.G && !z24Var2.E) {
                if (e34Var.F0.M0() + 50 > z24Var.b()) {
                    y24 y24Var = z24Var.P;
                    Objects.requireNonNull(y24Var);
                    gm.c3(new k04(y24Var, (byte) 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e34 e34Var = this.h3;
        if (!e34Var.f) {
            hx2 e = hx2.e();
            l04 l04Var = e34Var.E0;
            e34Var.getMeasuredHeight();
            boolean g = e.g(motionEvent, l04Var, e34Var.h2, this.o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !g) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e34 e34Var = this.h3;
        if (e34Var.J0 && e34Var.z0.b() > 0) {
            this.g3 = true;
            e34Var.F0.g1(0, 0);
            e34Var.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        e34Var.n(true);
    }

    @Override
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
