package cg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class j1 extends m2.g {
    public long f3165s0;
    public boolean f3166t0;
    public final i1 f3167u0;
    public final p1 f3168v0;

    public j1(p1 p1Var, Context context) {
        super(context);
        this.f3168v0 = p1Var;
        try {
            Field declaredField = m2.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            i1 i1Var = new i1(this, getContext());
            this.f3167u0 = i1Var;
            declaredField.set(this, i1Var);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        i1 i1Var;
        if (motionEvent.getAction() == 0) {
            this.f3165s0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f3165s0 <= ViewConfiguration.getTapTimeout() && (i1Var = this.f3167u0) != null && i1Var.isFinished()) {
                this.f3166t0 = true;
                p1 p1Var = this.f3168v0;
                if (motionEvent.getX() > getWidth() * 0.45f) {
                    if (p1Var.C + 1 < p1Var.d.size()) {
                        x(p1Var.C + 1, true);
                    }
                } else {
                    int i10 = p1Var.C - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                }
                this.f3166t0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f3165s0 = -1L;
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp + this.f3168v0.H, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3168v0.f3270w) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
