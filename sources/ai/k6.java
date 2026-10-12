package ai;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class k6 implements GestureDetector.OnGestureListener {
    public final m7 f1224a;

    public k6(m7 m7Var) {
        this.f1224a = m7Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m7 m7Var = this.f1224a;
        m7Var.d.abortAnimation();
        ValueAnimator valueAnimator = m7Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            m7Var.M.cancel();
            m7Var.M = null;
        }
        m7Var.L = false;
        m7Var.O.f1744w = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m7 m7Var = this.f1224a;
        m7Var.d.fling((int) m7Var.f1467e, 0, (int) (-f7), 0, (int) m7Var.f1468f, (int) m7Var.h, 0, 0);
        m7Var.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m7 m7Var = this.f1224a;
        float f11 = m7Var.f1467e + f7;
        m7Var.f1467e = f11;
        float f12 = m7Var.f1468f;
        if (f11 < f12) {
            m7Var.f1467e = f12;
        }
        float f13 = m7Var.f1467e;
        float f14 = m7Var.h;
        if (f13 > f14) {
            m7Var.f1467e = f14;
        }
        m7Var.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m7 m7Var = this.f1224a;
        ArrayList arrayList = m7Var.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m6 m6Var = (m6) arrayList.get(i10);
            if (((m6) arrayList.get(i10)).f1394a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                int i11 = m7Var.K;
                int i12 = m6Var.f1395b;
                if (i11 != i12) {
                    m7Var.c(i12, true, false);
                } else {
                    m7Var.N.n(false);
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
