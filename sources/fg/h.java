package fg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.i0;
public final class h extends GestureDetector.SimpleOnGestureListener {
    public float f7074a;
    public float f7075b;
    public final l f7076c;

    public h(l lVar) {
        this.f7076c = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        l lVar = this.f7076c;
        if (lVar.f7089f && !lVar.f7090n) {
            o1.k kVar = lVar.f7088c.f13958m;
            if ((f7 / 7.0f) + ((float) kVar.f13965i) >= lVar.getWidth() / 2.0f) {
                displayMetrics = lVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = lVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            kVar.f13965i = l.a(displayMetrics, f11);
            lVar.d.f13958m.f13965i = l.b(lVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) lVar.d.f13958m.f13965i));
            lVar.f7088c.h();
            lVar.d.h();
            lVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        l lVar = this.f7076c;
        int i10 = lVar.F;
        if (!lVar.f7090n) {
            i0.r(lVar.f7091r);
        }
        if (!lVar.f7089f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f7074a = (float) lVar.f7088c.f13958m.f13965i;
            this.f7075b = (float) lVar.d.f13958m.f13965i;
            lVar.f7089f = true;
        }
        if (lVar.f7089f && !lVar.f7090n) {
            lVar.f7088c.f13958m.f13965i = (motionEvent2.getRawX() + this.f7074a) - motionEvent.getRawX();
            lVar.d.f13958m.f13965i = (motionEvent2.getRawY() + this.f7075b) - motionEvent.getRawY();
            lVar.f7088c.h();
            lVar.d.h();
        }
        return lVar.f7089f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f7076c;
        if (!lVar.f7090n && !lVar.f7092s) {
            lVar.c(true);
            return true;
        }
        return false;
    }
}
