package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class v1 implements Runnable {
    public final int f14996a;
    public final w1 f14997b;

    public v1(w1 w1Var, int i10) {
        this.f14996a = i10;
        this.f14997b = w1Var;
    }

    @Override
    public final void run() {
        switch (this.f14996a) {
            case 0:
                ViewParent parent = this.f14997b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                w1 w1Var = this.f14997b;
                w1Var.a();
                View view = w1Var.d;
                if (view.isEnabled() && !view.isLongClickable() && w1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    w1Var.h = true;
                    return;
                }
                return;
        }
    }
}
