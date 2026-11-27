package defpackage;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class f3a implements GestureDetector.OnGestureListener {
    public final a4a a;

    public f3a(a4a a4aVar) {
        this.a = a4aVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        a4a a4aVar = this.a;
        a4aVar.d.abortAnimation();
        ValueAnimator valueAnimator = a4aVar.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            a4aVar.N.cancel();
            a4aVar.N = null;
        }
        a4aVar.M = false;
        a4aVar.P.x = false;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        a4a a4aVar = this.a;
        a4aVar.d.fling((int) a4aVar.e, 0, (int) (-f), 0, (int) a4aVar.f, (int) a4aVar.h, 0, 0);
        a4aVar.invalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        a4a a4aVar = this.a;
        float f3 = a4aVar.e + f;
        a4aVar.e = f3;
        float f4 = a4aVar.f;
        if (f3 < f4) {
            a4aVar.e = f4;
            f3 = f4;
        }
        float f5 = a4aVar.h;
        if (f3 > f5) {
            a4aVar.e = f5;
        }
        a4aVar.invalidate();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        a4a a4aVar = this.a;
        ArrayList arrayList = a4aVar.H;
        for (int i = 0; i < arrayList.size(); i++) {
            g3a g3aVar = (g3a) arrayList.get(i);
            if (((g3a) arrayList.get(i)).a.Q0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i2 = a4aVar.L;
                int i3 = g3aVar.b;
                if (i2 != i3) {
                    a4aVar.c(i3, true, false);
                } else {
                    a4aVar.O.k(false);
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
