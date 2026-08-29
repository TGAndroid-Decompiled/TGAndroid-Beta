package bg;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class u2 extends GestureDetector.SimpleOnGestureListener {
    public float f2546a;
    public boolean f2547b;
    public float f2548c;
    public final w2 d;

    public u2(w2 w2Var) {
        this.d = w2Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f9;
        w2 w2Var = this.d;
        boolean contains = w2Var.f2593e.contains(motionEvent.getX(), motionEvent.getY());
        if (w2Var.f2594f != contains) {
            w2Var.f2594f = contains;
            w2Var.invalidate();
            if (contains) {
                v2 v2Var = w2Var.G;
                if (v2Var != null) {
                    f9 = v2Var.get();
                } else {
                    f9 = w2Var.D.f573c;
                }
                this.f2546a = f9;
                this.f2547b = false;
            }
        }
        return w2Var.f2594f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        w2 w2Var = this.d;
        if (w2Var.f2594f) {
            if (!this.f2547b) {
                this.f2548c = motionEvent.getY() - motionEvent2.getY();
                this.f2547b = true;
            }
            float f11 = this.f2546a;
            float y8 = ((motionEvent.getY() - motionEvent2.getY()) - this.f2548c) / w2Var.f2593e.height();
            float f12 = w2Var.C;
            float f13 = w2Var.B;
            float a2 = i7.w.a(com.google.android.recaptcha.internal.a.z(f12, f13, y8, f11), f13, f12);
            v2 v2Var = w2Var.G;
            if (v2Var != null) {
                v2Var.K(a2);
            } else {
                w2Var.D.f573c = a2;
            }
            w2Var.f2598w.d(a2, true);
            Runnable runnable = w2Var.E;
            if (runnable != null) {
                runnable.run();
            }
            w2Var.invalidate();
        }
        return w2Var.f2594f;
    }
}
