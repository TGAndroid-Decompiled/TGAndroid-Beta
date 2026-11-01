package jg;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class b2 extends GestureDetector.SimpleOnGestureListener {
    public float f9898a;
    public boolean f9899b;
    public float f9900c;
    public final d2 d;

    public b2(d2 d2Var) {
        this.d = d2Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        d2 d2Var = this.d;
        boolean contains = d2Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (d2Var.f9925f != contains) {
            d2Var.f9925f = contains;
            d2Var.invalidate();
            if (contains) {
                c2 c2Var = d2Var.K;
                if (c2Var != null) {
                    f7 = c2Var.get();
                } else {
                    f7 = d2Var.H.f8435c;
                }
                this.f9898a = f7;
                this.f9899b = false;
            }
        }
        return d2Var.f9925f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        d2 d2Var = this.d;
        if (d2Var.f9925f) {
            if (!this.f9899b) {
                this.f9900c = motionEvent.getY() - motionEvent2.getY();
                this.f9899b = true;
            }
            float f11 = this.f9898a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f9900c) / d2Var.e.height();
            float f12 = d2Var.G;
            float f13 = d2Var.F;
            float a2 = w7.u.a(c3.i0.z(f12, f13, y3, f11), f13, f12);
            c2 c2Var = d2Var.K;
            if (c2Var != null) {
                c2Var.G(a2);
            } else {
                d2Var.H.f8435c = a2;
            }
            d2Var.f9930x.e(true, a2);
            Runnable runnable = d2Var.I;
            if (runnable != null) {
                runnable.run();
            }
            d2Var.invalidate();
        }
        return d2Var.f9925f;
    }
}
