package di;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class m4 implements GestureDetector.OnGestureListener {
    public final m5 f9365a;

    public m4(m5 m5Var) {
        this.f9365a = m5Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m5 m5Var = this.f9365a;
        m5Var.d.abortAnimation();
        ValueAnimator valueAnimator = m5Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            m5Var.M.cancel();
            m5Var.M = null;
        }
        m5Var.L = false;
        m5Var.O.f9798x = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        m5 m5Var = this.f9365a;
        m5Var.d.fling((int) m5Var.f9506e, 0, (int) (-f10), 0, (int) m5Var.f9507f, (int) m5Var.h, 0, 0);
        m5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        m5 m5Var = this.f9365a;
        float f12 = m5Var.f9506e + f10;
        m5Var.f9506e = f12;
        float f13 = m5Var.f9507f;
        if (f12 < f13) {
            m5Var.f9506e = f13;
        }
        float f14 = m5Var.f9506e;
        float f15 = m5Var.h;
        if (f14 > f15) {
            m5Var.f9506e = f15;
        }
        m5Var.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m5 m5Var = this.f9365a;
        ArrayList arrayList = m5Var.G;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            o4 o4Var = (o4) arrayList.get(i7);
            if (((o4) arrayList.get(i7)).f9437a.P0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i10 = m5Var.K;
                int i11 = o4Var.f9438b;
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
