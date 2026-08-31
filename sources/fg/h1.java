package fg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class h1 extends m2.h {
    public long f6323t0;
    public boolean f6324u0;
    public final g1 f6325v0;
    public final n1 f6326w0;

    public h1(n1 n1Var, Context context) {
        super(context);
        this.f6326w0 = n1Var;
        try {
            Field declaredField = m2.h.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            g1 g1Var = new g1(this, getContext());
            this.f6325v0 = g1Var;
            declaredField.set(this, g1Var);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        g1 g1Var;
        if (motionEvent.getAction() == 0) {
            this.f6323t0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f6323t0 <= ViewConfiguration.getTapTimeout() && (g1Var = this.f6325v0) != null && g1Var.isFinished()) {
                this.f6324u0 = true;
                n1 n1Var = this.f6326w0;
                if (motionEvent.getX() > getWidth() * 0.45f) {
                    if (n1Var.D + 1 < n1Var.d.size()) {
                        x(n1Var.D + 1, true);
                    }
                } else {
                    int i10 = n1Var.D - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                }
                this.f6324u0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f6323t0 = -1L;
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
        int dp = AndroidUtilities.dp(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp + this.f6326w0.I, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6326w0.f6418w) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
