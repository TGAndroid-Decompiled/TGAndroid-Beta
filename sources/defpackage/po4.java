package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class po4 implements Runnable {
    public final byte a;
    public final qo4 b;

    public po4(qo4 qo4Var, byte b) {
        this.a = b;
        this.b = qo4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qo4 qo4Var = this.b;
        switch (b) {
            case 0:
                ViewParent parent = qo4Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                qo4Var.a();
                View view = qo4Var.d;
                if (view.isEnabled() && !view.isLongClickable() && qo4Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    qo4Var.h = true;
                    return;
                }
                return;
        }
    }
}
