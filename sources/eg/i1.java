package eg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class i1 extends m2.h {
    public long f5303t0;
    public boolean f5304u0;
    public final h1 f5305v0;
    public final o1 f5306w0;

    public i1(o1 o1Var, Context context) {
        super(context);
        this.f5306w0 = o1Var;
        try {
            Field declaredField = m2.h.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            h1 h1Var = new h1(this, getContext());
            this.f5305v0 = h1Var;
            declaredField.set(this, h1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        h1 h1Var;
        if (motionEvent.getAction() == 0) {
            this.f5303t0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f5303t0 <= ViewConfiguration.getTapTimeout() && (h1Var = this.f5305v0) != null && h1Var.isFinished()) {
                this.f5304u0 = true;
                o1 o1Var = this.f5306w0;
                if (motionEvent.getX() > getWidth() * 0.45f) {
                    if (o1Var.D + 1 < o1Var.d.size()) {
                        x(o1Var.D + 1, true);
                    }
                } else {
                    int i10 = o1Var.D - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                }
                this.f5304u0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f5303t0 = -1L;
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp + this.f5306w0.I, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5306w0.f5397w) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
