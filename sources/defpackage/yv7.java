package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class yv7 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final aw7 d;

    public yv7(aw7 aw7Var) {
        this.d = aw7Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f;
        aw7 aw7Var = this.d;
        boolean contains = aw7Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (aw7Var.f != contains) {
            aw7Var.f = contains;
            aw7Var.invalidate();
            if (contains) {
                zv7 zv7Var = aw7Var.L;
                if (zv7Var != null) {
                    f = zv7Var.get();
                } else {
                    f = aw7Var.I.c;
                }
                this.a = f;
                this.b = false;
            }
        }
        return aw7Var.f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        aw7 aw7Var = this.d;
        if (aw7Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f3 = this.a;
            float y = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / aw7Var.e.height();
            float f4 = aw7Var.H;
            float f5 = aw7Var.G;
            float a = pqe.a(td4.A(f4, f5, y, f3), f5, f4);
            zv7 zv7Var = aw7Var.L;
            if (zv7Var != null) {
                zv7Var.O(a);
            } else {
                aw7Var.I.c = a;
            }
            aw7Var.x.e(true, a);
            Runnable runnable = aw7Var.J;
            if (runnable != null) {
                runnable.run();
            }
            aw7Var.invalidate();
        }
        return aw7Var.f;
    }
}
