package defpackage;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class lz9 implements GestureDetector.OnGestureListener {
    public final h0a a;

    public lz9(h0a h0aVar) {
        this.a = h0aVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        h0a h0aVar = this.a;
        h0aVar.d.abortAnimation();
        ValueAnimator valueAnimator = h0aVar.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            h0aVar.N.cancel();
            h0aVar.N = null;
        }
        h0aVar.M = false;
        h0aVar.P.x = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        h0a h0aVar = this.a;
        h0aVar.d.fling((int) h0aVar.e, 0, (int) (-f), 0, (int) h0aVar.f, (int) h0aVar.h, 0, 0);
        h0aVar.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        h0a h0aVar = this.a;
        float f3 = h0aVar.e + f;
        h0aVar.e = f3;
        float f4 = h0aVar.f;
        if (f3 < f4) {
            h0aVar.e = f4;
            f3 = f4;
        }
        float f5 = h0aVar.h;
        if (f3 > f5) {
            h0aVar.e = f5;
        }
        h0aVar.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h0a h0aVar = this.a;
        ArrayList arrayList = h0aVar.H;
        for (int i = 0; i < arrayList.size(); i++) {
            mz9 mz9Var = (mz9) arrayList.get(i);
            if (((mz9) arrayList.get(i)).a.Q0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i2 = h0aVar.L;
                int i3 = mz9Var.b;
                if (i2 != i3) {
                    h0aVar.c(i3, true, false);
                } else {
                    h0aVar.O.k(false);
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
