package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class wz3 extends f79 {
    public boolean g3;
    public final o24 h3;

    public wz3(o24 o24Var, Context context) {
        super(context, null);
        this.h3 = o24Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.n2.g();
    }

    @Override
    public final void n0(int i) {
        int i2;
        o24 o24Var = this.h3;
        j24 j24Var = o24Var.A0;
        if (o24Var.D0 != null) {
            b04 b04Var = o24Var.C0;
            if (o24Var.E0.canScrollVertically(-1)) {
                i2 = hl.e1();
            } else {
                i2 = 0;
            }
            b04Var.setUnderlineHeight(i2);
        }
        if (j24Var != null && getAdapter() == j24Var && j24Var.d == 0) {
            j24 j24Var2 = j24Var.P.x;
            if (!j24Var2.R.H0.G && !j24Var2.E) {
                if (o24Var.F0.M0() + 50 > j24Var.b()) {
                    i24 i24Var = j24Var.P;
                    Objects.requireNonNull(i24Var);
                    hl.c3(new vz3(i24Var, (byte) 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o24 o24Var = this.h3;
        if (!o24Var.f) {
            rw2 e = rw2.e();
            wz3 wz3Var = o24Var.E0;
            o24Var.getMeasuredHeight();
            boolean g = e.g(motionEvent, wz3Var, o24Var.h2, this.o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !g) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        o24 o24Var = this.h3;
        if (o24Var.J0 && o24Var.z0.b() > 0) {
            this.g3 = true;
            o24Var.F0.g1(0, 0);
            o24Var.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        o24Var.n(true);
    }

    @Override
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
