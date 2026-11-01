package kg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.f8;
public final class d1 extends z4.g {
    public long f11030w0;
    public boolean f11031x0;
    public final c1 f11032y0;
    public final i1 f11033z0;

    public d1(i1 i1Var, Context context) {
        super(context);
        this.f11033z0 = i1Var;
        try {
            Field declaredField = z4.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            c1 c1Var = new c1(this, getContext());
            this.f11032y0 = c1Var;
            declaredField.set(this, c1Var);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        c1 c1Var;
        if (motionEvent.getAction() == 0) {
            this.f11030w0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f11030w0 <= ViewConfiguration.getTapTimeout() && (c1Var = this.f11032y0) != null && c1Var.isFinished()) {
                this.f11031x0 = true;
                int i10 = (motionEvent.getX() > (getWidth() * 0.45f) ? 1 : (motionEvent.getX() == (getWidth() * 0.45f) ? 0 : -1));
                i1 i1Var = this.f11033z0;
                if (i10 > 0) {
                    if (i1Var.f11125x1 + 1 < i1Var.f11113k1.size()) {
                        x(i1Var.f11125x1 + 1, true);
                    }
                } else {
                    int i11 = i1Var.f11125x1 - 1;
                    if (i11 >= 0) {
                        x(i11, true);
                    }
                }
                this.f11031x0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f11030w0 = -1L;
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
    public final void onMeasure(int i10, int i11) {
        int L = org.telegram.messenger.i0.L(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            L = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(L + this.f11033z0.C1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f11033z0.f11120s1) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
