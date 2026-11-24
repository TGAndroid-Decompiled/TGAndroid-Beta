package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
public final class hj8 extends ggc {
    public final kj8 A0;
    public long x0;
    public boolean y0;
    public final gj8 z0;

    public hj8(kj8 kj8Var, Context context) {
        super(context);
        this.A0 = kj8Var;
        try {
            Field declaredField = ggc.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            gj8 gj8Var = new gj8(this, getContext());
            this.z0 = gj8Var;
            declaredField.set(this, gj8Var);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        gj8 gj8Var;
        if (motionEvent.getAction() == 0) {
            this.x0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.x0 <= ViewConfiguration.getTapTimeout() && (gj8Var = this.z0) != null && gj8Var.isFinished()) {
                this.y0 = true;
                int i = (motionEvent.getX() > (getWidth() * 0.45f) ? 1 : (motionEvent.getX() == (getWidth() * 0.45f) ? 0 : -1));
                kj8 kj8Var = this.A0;
                int i2 = kj8Var.A1;
                if (i > 0) {
                    if (i2 + 1 < kj8Var.n1.size()) {
                        x(kj8Var.A1 + 1, true);
                    }
                } else {
                    int i3 = i2 - 1;
                    if (i3 >= 0) {
                        x(i3, true);
                    }
                }
                this.y0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.x0 = -1L;
        }
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L = gm.L(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i, 0);
            L = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L + this.A0.F1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0.v1) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
