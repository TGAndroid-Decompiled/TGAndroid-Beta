package defpackage;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
public final class fj4 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final hj4 c;

    public fj4(hj4 hj4Var) {
        this.c = hj4Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        DisplayMetrics displayMetrics;
        float f3;
        hj4 hj4Var = this.c;
        if (hj4Var.f && !hj4Var.n) {
            zla zlaVar = hj4Var.c.m;
            if ((f / 7.0f) + ((float) zlaVar.i) >= hj4Var.getWidth() / 2.0f) {
                displayMetrics = hj4Var.getResources().getDisplayMetrics();
                f3 = 2.1474836E9f;
            } else {
                displayMetrics = hj4Var.getResources().getDisplayMetrics();
                f3 = -2.1474836E9f;
            }
            zlaVar.i = hj4.a(displayMetrics, f3);
            hj4Var.d.m.i = hj4.b(hj4Var.getResources().getDisplayMetrics(), (f2 / 10.0f) + ((float) hj4Var.d.m.i));
            hj4Var.c.h();
            hj4Var.d.h();
            hj4Var.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        hj4 hj4Var = this.c;
        int i = hj4Var.G;
        if (!hj4Var.n) {
            gl.r(hj4Var.r);
        }
        if (!hj4Var.f && (Math.abs(f) >= i || Math.abs(f2) >= i)) {
            this.a = (float) hj4Var.c.m.i;
            this.b = (float) hj4Var.d.m.i;
            hj4Var.f = true;
        }
        if (hj4Var.f && !hj4Var.n) {
            hj4Var.c.m.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            hj4Var.d.m.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            hj4Var.c.h();
            hj4Var.d.h();
        }
        return hj4Var.f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        hj4 hj4Var = this.c;
        if (!hj4Var.n && !hj4Var.s) {
            hj4Var.c(true);
            return true;
        }
        return false;
    }
}
