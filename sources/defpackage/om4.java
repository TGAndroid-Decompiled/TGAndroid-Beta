package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class om4 implements Runnable {
    public final byte a;
    public final pm4 b;

    public om4(pm4 pm4Var, byte b) {
        this.a = b;
        this.b = pm4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pm4 pm4Var = this.b;
        switch (b) {
            case 0:
                ViewParent parent = pm4Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                pm4Var.a();
                View view = pm4Var.d;
                if (view.isEnabled() && !view.isLongClickable() && pm4Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    pm4Var.h = true;
                    return;
                }
                return;
        }
    }
}
