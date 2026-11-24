package defpackage;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class n1a implements GestureDetector.OnGestureListener {
    public final j2a a;

    public n1a(j2a j2aVar) {
        this.a = j2aVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        j2a j2aVar = this.a;
        j2aVar.d.abortAnimation();
        ValueAnimator valueAnimator = j2aVar.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            j2aVar.N.cancel();
            j2aVar.N = null;
        }
        j2aVar.M = false;
        j2aVar.P.x = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        j2a j2aVar = this.a;
        j2aVar.d.fling((int) j2aVar.e, 0, (int) (-f), 0, (int) j2aVar.f, (int) j2aVar.h, 0, 0);
        j2aVar.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        j2a j2aVar = this.a;
        float f3 = j2aVar.e + f;
        j2aVar.e = f3;
        float f4 = j2aVar.f;
        if (f3 < f4) {
            j2aVar.e = f4;
            f3 = f4;
        }
        float f5 = j2aVar.h;
        if (f3 > f5) {
            j2aVar.e = f5;
        }
        j2aVar.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j2a j2aVar = this.a;
        ArrayList arrayList = j2aVar.H;
        for (int i = 0; i < arrayList.size(); i++) {
            o1a o1aVar = (o1a) arrayList.get(i);
            if (((o1a) arrayList.get(i)).a.Q0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i2 = j2aVar.L;
                int i3 = o1aVar.b;
                if (i2 != i3) {
                    j2aVar.c(i3, true, false);
                } else {
                    j2aVar.O.k(false);
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
