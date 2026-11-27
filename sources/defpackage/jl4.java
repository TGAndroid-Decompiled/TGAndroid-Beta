package defpackage;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
public final class jl4 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final ll4 c;

    public jl4(ll4 ll4Var) {
        this.c = ll4Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        DisplayMetrics displayMetrics;
        float f3;
        ll4 ll4Var = this.c;
        if (ll4Var.f && !ll4Var.n) {
            wpa wpaVar = ll4Var.c.m;
            if ((f / 7.0f) + ((float) wpaVar.i) >= ll4Var.getWidth() / 2.0f) {
                displayMetrics = ll4Var.getResources().getDisplayMetrics();
                f3 = 2.1474836E9f;
            } else {
                displayMetrics = ll4Var.getResources().getDisplayMetrics();
                f3 = -2.1474836E9f;
            }
            wpaVar.i = ll4.a(displayMetrics, f3);
            ll4Var.d.m.i = ll4.b(ll4Var.getResources().getDisplayMetrics(), (f2 / 10.0f) + ((float) ll4Var.d.m.i));
            ll4Var.c.h();
            ll4Var.d.h();
            ll4Var.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ll4 ll4Var = this.c;
        int i = ll4Var.G;
        if (!ll4Var.n) {
            hl.r(ll4Var.r);
        }
        if (!ll4Var.f && (Math.abs(f) >= i || Math.abs(f2) >= i)) {
            this.a = (float) ll4Var.c.m.i;
            this.b = (float) ll4Var.d.m.i;
            ll4Var.f = true;
        }
        if (ll4Var.f && !ll4Var.n) {
            ll4Var.c.m.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            ll4Var.d.m.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            ll4Var.c.h();
            ll4Var.d.h();
        }
        return ll4Var.f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ll4 ll4Var = this.c;
        if (!ll4Var.n && !ll4Var.s) {
            ll4Var.c(true);
            return true;
        }
        return false;
    }
}
