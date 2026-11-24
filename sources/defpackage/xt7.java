package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class xt7 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final zt7 d;

    public xt7(zt7 zt7Var) {
        this.d = zt7Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f;
        zt7 zt7Var = this.d;
        boolean contains = zt7Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (zt7Var.f != contains) {
            zt7Var.f = contains;
            zt7Var.invalidate();
            if (contains) {
                yt7 yt7Var = zt7Var.L;
                if (yt7Var != null) {
                    f = yt7Var.get();
                } else {
                    f = zt7Var.I.c;
                }
                this.a = f;
                this.b = false;
            }
        }
        return zt7Var.f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        zt7 zt7Var = this.d;
        if (zt7Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f3 = this.a;
            float y = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / zt7Var.e.height();
            float f4 = zt7Var.H;
            float f5 = zt7Var.G;
            float a = moe.a(tb4.A(f4, f5, y, f3), f5, f4);
            yt7 yt7Var = zt7Var.L;
            if (yt7Var != null) {
                yt7Var.M(a);
            } else {
                zt7Var.I.c = a;
            }
            zt7Var.x.e(true, a);
            Runnable runnable = zt7Var.J;
            if (runnable != null) {
                runnable.run();
            }
            zt7Var.invalidate();
        }
        return zt7Var.f;
    }
}
