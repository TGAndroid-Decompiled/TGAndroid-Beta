package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class t1 implements Runnable {
    public final int f17857a;
    public final u1 f17858b;

    public t1(u1 u1Var, int i10) {
        this.f17857a = i10;
        this.f17858b = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f17857a) {
            case 0:
                ViewParent parent = this.f17858b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                u1 u1Var = this.f17858b;
                u1Var.a();
                View view = u1Var.d;
                if (view.isEnabled() && !view.isLongClickable() && u1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    u1Var.h = true;
                    return;
                }
                return;
        }
    }
}
