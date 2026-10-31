package fg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.i0;
public final class h extends GestureDetector.SimpleOnGestureListener {
    public float f7073a;
    public float f7074b;
    public final l f7075c;

    public h(l lVar) {
        this.f7075c = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        l lVar = this.f7075c;
        if (lVar.f7088f && !lVar.f7089n) {
            o1.k kVar = lVar.f7087c.f13957m;
            if ((f7 / 7.0f) + ((float) kVar.f13964i) >= lVar.getWidth() / 2.0f) {
                displayMetrics = lVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = lVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            kVar.f13964i = l.a(displayMetrics, f11);
            lVar.d.f13957m.f13964i = l.b(lVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) lVar.d.f13957m.f13964i));
            lVar.f7087c.h();
            lVar.d.h();
            lVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        l lVar = this.f7075c;
        int i10 = lVar.F;
        if (!lVar.f7089n) {
            i0.r(lVar.f7090r);
        }
        if (!lVar.f7088f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f7073a = (float) lVar.f7087c.f13957m.f13964i;
            this.f7074b = (float) lVar.d.f13957m.f13964i;
            lVar.f7088f = true;
        }
        if (lVar.f7088f && !lVar.f7089n) {
            lVar.f7087c.f13957m.f13964i = (motionEvent2.getRawX() + this.f7073a) - motionEvent.getRawX();
            lVar.d.f13957m.f13964i = (motionEvent2.getRawY() + this.f7074b) - motionEvent.getRawY();
            lVar.f7087c.h();
            lVar.d.h();
        }
        return lVar.f7088f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.f7075c;
        if (!lVar.f7089n && !lVar.f7091s) {
            lVar.c(true);
            return true;
        }
        return false;
    }
}
