package ci;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class u4 implements GestureDetector.OnGestureListener {
    public final v5 f6045a;

    public u4(v5 v5Var) {
        this.f6045a = v5Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        v5 v5Var = this.f6045a;
        v5Var.d.abortAnimation();
        ValueAnimator valueAnimator = v5Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            v5Var.M.cancel();
            v5Var.M = null;
        }
        v5Var.L = false;
        v5Var.O.f5284w = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        v5 v5Var = this.f6045a;
        v5Var.d.fling((int) v5Var.e, 0, (int) (-f7), 0, (int) v5Var.f6159f, (int) v5Var.h, 0, 0);
        v5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        v5 v5Var = this.f6045a;
        float f11 = v5Var.e + f7;
        v5Var.e = f11;
        float f12 = v5Var.f6159f;
        if (f11 < f12) {
            v5Var.e = f12;
        }
        float f13 = v5Var.e;
        float f14 = v5Var.h;
        if (f13 > f14) {
            v5Var.e = f14;
        }
        v5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        v5 v5Var = this.f6045a;
        ArrayList arrayList = v5Var.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w4 w4Var = (w4) arrayList.get(i10);
            if (((w4) arrayList.get(i10)).f6111a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                int i11 = v5Var.K;
                int i12 = w4Var.f6112b;
                if (i11 != i12) {
                    v5Var.c(i12, true, false);
                } else {
                    v5Var.N.n(false);
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
