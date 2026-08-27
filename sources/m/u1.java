package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class u1 implements Runnable {

    public final int f17480a;

    public final v1 f17481b;

    public u1(v1 v1Var, int i10) {
        this.f17480a = i10;
        this.f17481b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f17480a) {
            case 0:
                ViewParent parent = this.f17481b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                v1 v1Var = this.f17481b;
                v1Var.a();
                View view = v1Var.d;
                if (view.isEnabled() && !view.isLongClickable() && v1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    v1Var.h = true;
                    break;
                }
                break;
        }
    }
}
