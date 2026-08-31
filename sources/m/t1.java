package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class t1 implements Runnable {
    public final int f13342a;
    public final u1 f13343b;

    public t1(u1 u1Var, int i10) {
        this.f13342a = i10;
        this.f13343b = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f13342a) {
            case 0:
                ViewParent parent = this.f13343b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                u1 u1Var = this.f13343b;
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
