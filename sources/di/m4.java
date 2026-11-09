package di;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class m4 implements GestureDetector.OnGestureListener {
    public final m5 f9360a;

    public m4(m5 m5Var) {
        this.f9360a = m5Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m5 m5Var = this.f9360a;
        m5Var.d.abortAnimation();
        ValueAnimator valueAnimator = m5Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            m5Var.M.cancel();
            m5Var.M = null;
        }
        m5Var.L = false;
        m5Var.O.f9793x = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        m5 m5Var = this.f9360a;
        m5Var.d.fling((int) m5Var.f9501e, 0, (int) (-f10), 0, (int) m5Var.f9502f, (int) m5Var.h, 0, 0);
        m5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        m5 m5Var = this.f9360a;
        float f12 = m5Var.f9501e + f10;
        m5Var.f9501e = f12;
        float f13 = m5Var.f9502f;
        if (f12 < f13) {
            m5Var.f9501e = f13;
        }
        float f14 = m5Var.f9501e;
        float f15 = m5Var.h;
        if (f14 > f15) {
            m5Var.f9501e = f15;
        }
        m5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m5 m5Var = this.f9360a;
        ArrayList arrayList = m5Var.G;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            o4 o4Var = (o4) arrayList.get(i7);
            if (((o4) arrayList.get(i7)).f9432a.P0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i10 = m5Var.K;
                int i11 = o4Var.f9433b;
                if (i10 != i11) {
                    m5Var.c(i11, true, false);
                } else {
                    m5Var.N.o(false);
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
