package eg;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class p2 extends GestureDetector.SimpleOnGestureListener {
    public float f5429a;
    public boolean f5430b;
    public float f5431c;
    public final r2 d;

    public p2(r2 r2Var) {
        this.d = r2Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f10;
        r2 r2Var = this.d;
        boolean contains = r2Var.f5456e.contains(motionEvent.getX(), motionEvent.getY());
        if (r2Var.f5457f != contains) {
            r2Var.f5457f = contains;
            r2Var.invalidate();
            if (contains) {
                q2 q2Var = r2Var.H;
                if (q2Var != null) {
                    f10 = q2Var.get();
                } else {
                    f10 = r2Var.E.f4526c;
                }
                this.f5429a = f10;
                this.f5430b = false;
            }
        }
        return r2Var.f5457f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        r2 r2Var = this.d;
        if (r2Var.f5457f) {
            if (!this.f5430b) {
                this.f5431c = motionEvent.getY() - motionEvent2.getY();
                this.f5430b = true;
            }
            float f12 = this.f5429a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.f5431c) / r2Var.f5456e.height();
            float f13 = r2Var.D;
            float f14 = r2Var.C;
            float a2 = k7.o.a(e2.c.w(f13, f14, y10, f12), f14, f13);
            q2 q2Var = r2Var.H;
            if (q2Var != null) {
                q2Var.H(a2);
            } else {
                r2Var.E.f4526c = a2;
            }
            r2Var.f5461w.d(a2, true);
            Runnable runnable = r2Var.F;
            if (runnable != null) {
                runnable.run();
            }
            r2Var.invalidate();
        }
        return r2Var.f5457f;
    }
}
