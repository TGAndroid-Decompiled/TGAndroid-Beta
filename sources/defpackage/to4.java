package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class to4 implements Runnable {
    public final byte a;
    public final uo4 b;

    public to4(uo4 uo4Var, byte b) {
        this.a = b;
        this.b = uo4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uo4 uo4Var = this.b;
        switch (b) {
            case 0:
                ViewParent parent = uo4Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                uo4Var.a();
                View view = uo4Var.d;
                if (view.isEnabled() && !view.isLongClickable() && uo4Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    uo4Var.h = true;
                    return;
                }
                return;
        }
    }
}
