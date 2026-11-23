package fi;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class c4 implements GestureDetector.OnGestureListener {
    public final c5 f11855a;

    public c4(c5 c5Var) {
        this.f11855a = c5Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        c5 c5Var = this.f11855a;
        c5Var.d.abortAnimation();
        ValueAnimator valueAnimator = c5Var.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            c5Var.N.cancel();
            c5Var.N = null;
        }
        c5Var.M = false;
        c5Var.P.f12196x = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        c5 c5Var = this.f11855a;
        c5Var.d.fling((int) c5Var.f11977e, 0, (int) (-f10), 0, (int) c5Var.f11978f, (int) c5Var.h, 0, 0);
        c5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        c5 c5Var = this.f11855a;
        float f12 = c5Var.f11977e + f10;
        c5Var.f11977e = f12;
        float f13 = c5Var.f11978f;
        if (f12 < f13) {
            c5Var.f11977e = f13;
        }
        float f14 = c5Var.f11977e;
        float f15 = c5Var.h;
        if (f14 > f15) {
            c5Var.f11977e = f15;
        }
        c5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        c5 c5Var = this.f11855a;
        ArrayList arrayList = c5Var.H;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            e4 e4Var = (e4) arrayList.get(i7);
            if (((e4) arrayList.get(i7)).f11925a.Q0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i10 = c5Var.L;
                int i11 = e4Var.f11926b;
                if (i10 != i11) {
                    c5Var.c(i11, true, false);
                } else {
                    c5Var.O.o(false);
                }
            }
        }
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
