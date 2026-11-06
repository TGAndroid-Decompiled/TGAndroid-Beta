package di;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class l4 implements GestureDetector.OnGestureListener {
    public final l5 f9335a;

    public l4(l5 l5Var) {
        this.f9335a = l5Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        l5 l5Var = this.f9335a;
        l5Var.d.abortAnimation();
        ValueAnimator valueAnimator = l5Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            l5Var.M.cancel();
            l5Var.M = null;
        }
        l5Var.L = false;
        l5Var.O.f9764x = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l5 l5Var = this.f9335a;
        l5Var.d.fling((int) l5Var.f9457e, 0, (int) (-f10), 0, (int) l5Var.f9458f, (int) l5Var.h, 0, 0);
        l5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l5 l5Var = this.f9335a;
        float f12 = l5Var.f9457e + f10;
        l5Var.f9457e = f12;
        float f13 = l5Var.f9458f;
        if (f12 < f13) {
            l5Var.f9457e = f13;
        }
        float f14 = l5Var.f9457e;
        float f15 = l5Var.h;
        if (f14 > f15) {
            l5Var.f9457e = f15;
        }
        l5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l5 l5Var = this.f9335a;
        ArrayList arrayList = l5Var.G;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            n4 n4Var = (n4) arrayList.get(i7);
            if (((n4) arrayList.get(i7)).f9399a.P0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i10 = l5Var.K;
                int i11 = n4Var.f9400b;
                if (i10 != i11) {
                    l5Var.c(i11, true, false);
                } else {
                    l5Var.N.o(false);
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
