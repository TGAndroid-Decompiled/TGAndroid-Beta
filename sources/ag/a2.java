package ag;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class a2 extends m2.g {

    public long f286s0;

    public boolean f287t0;

    public final z1 f288u0;

    public final g2 f289v0;

    public a2(g2 g2Var, Context context) {
        super(context);
        this.f289v0 = g2Var;
        try {
            Field declaredField = m2.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            z1 z1Var = new z1(this, getContext());
            this.f288u0 = z1Var;
            declaredField.set(this, z1Var);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        z1 z1Var;
        if (motionEvent.getAction() == 0) {
            this.f286s0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f286s0 <= ViewConfiguration.getTapTimeout() && (z1Var = this.f288u0) != null && z1Var.isFinished()) {
                this.f287t0 = true;
                float x8 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                g2 g2Var = this.f289v0;
                if (x8 <= width) {
                    int i10 = g2Var.C - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                } else if (g2Var.C + 1 < g2Var.d.size()) {
                    x(g2Var.C + 1, true);
                }
                this.f287t0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f286s0 = -1L;
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
        int iDp = AndroidUtilities.dp(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            iDp = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(iDp + this.f289v0.H, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f289v0.f397w) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || A(motionEvent);
    }
}
