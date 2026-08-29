package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class u1 implements Runnable {
    public final int f16703a;
    public final v1 f16704b;

    public u1(v1 v1Var, int i10) {
        this.f16703a = i10;
        this.f16704b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f16703a) {
            case 0:
                ViewParent parent = this.f16704b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                v1 v1Var = this.f16704b;
                v1Var.a();
                View view = v1Var.d;
                if (view.isEnabled() && !view.isLongClickable() && v1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    v1Var.h = true;
                    return;
                }
                return;
        }
    }
}
