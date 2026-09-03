package dg;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class r2 extends GestureDetector.SimpleOnGestureListener {
    public float f4773a;
    public boolean f4774b;
    public float f4775c;
    public final t2 d;

    public r2(t2 t2Var) {
        this.d = t2Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f10;
        t2 t2Var = this.d;
        boolean contains = t2Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (t2Var.f4799f != contains) {
            t2Var.f4799f = contains;
            t2Var.invalidate();
            if (contains) {
                s2 s2Var = t2Var.H;
                if (s2Var != null) {
                    f10 = s2Var.get();
                } else {
                    f10 = t2Var.E.f2386c;
                }
                this.f4773a = f10;
                this.f4774b = false;
            }
        }
        return t2Var.f4799f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        t2 t2Var = this.d;
        if (t2Var.f4799f) {
            if (!this.f4774b) {
                this.f4775c = motionEvent.getY() - motionEvent2.getY();
                this.f4774b = true;
            }
            float f12 = this.f4773a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.f4775c) / t2Var.e.height();
            float f13 = t2Var.D;
            float f14 = t2Var.C;
            float a2 = k7.n.a(e2.c.w(f13, f14, y10, f12), f14, f13);
            s2 s2Var = t2Var.H;
            if (s2Var != null) {
                s2Var.A(a2);
            } else {
                t2Var.E.f2386c = a2;
            }
            t2Var.f4803w.d(a2, true);
            Runnable runnable = t2Var.F;
            if (runnable != null) {
                runnable.run();
            }
            t2Var.invalidate();
        }
        return t2Var.f4799f;
    }
}
