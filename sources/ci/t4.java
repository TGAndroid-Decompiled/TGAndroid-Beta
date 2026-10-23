package ci;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class t4 implements GestureDetector.OnGestureListener {
    public final u5 f5951a;

    public t4(u5 u5Var) {
        this.f5951a = u5Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        u5 u5Var = this.f5951a;
        u5Var.d.abortAnimation();
        ValueAnimator valueAnimator = u5Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            u5Var.M.cancel();
            u5Var.M = null;
        }
        u5Var.L = false;
        u5Var.O.f5185w = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        u5 u5Var = this.f5951a;
        u5Var.d.fling((int) u5Var.e, 0, (int) (-f7), 0, (int) u5Var.f6054f, (int) u5Var.h, 0, 0);
        u5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        u5 u5Var = this.f5951a;
        float f11 = u5Var.e + f7;
        u5Var.e = f11;
        float f12 = u5Var.f6054f;
        if (f11 < f12) {
            u5Var.e = f12;
        }
        float f13 = u5Var.e;
        float f14 = u5Var.h;
        if (f13 > f14) {
            u5Var.e = f14;
        }
        u5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        u5 u5Var = this.f5951a;
        ArrayList arrayList = u5Var.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            v4 v4Var = (v4) arrayList.get(i10);
            if (((v4) arrayList.get(i10)).f6016a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                int i11 = u5Var.K;
                int i12 = v4Var.f6017b;
                if (i11 != i12) {
                    u5Var.c(i12, true, false);
                } else {
                    u5Var.N.n(false);
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
