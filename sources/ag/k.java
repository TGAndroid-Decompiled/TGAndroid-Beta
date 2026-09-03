package ag;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public float f208a;
    public float f209b;
    public final o f210c;

    public k(o oVar) {
        this.f210c = oVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        o oVar = this.f210c;
        if (oVar.f226f && !oVar.f227n) {
            o1.k kVar = oVar.f224c.f16338u;
            if ((f10 / 7.0f) + ((float) kVar.f16345i) >= oVar.getWidth() / 2.0f) {
                displayMetrics = oVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = oVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            kVar.f16345i = o.a(displayMetrics, f12);
            oVar.d.f16338u.f16345i = o.b(oVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) oVar.d.f16338u.f16345i));
            oVar.f224c.f();
            oVar.d.f();
            oVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        o oVar = this.f210c;
        int i10 = oVar.C;
        if (!oVar.f227n) {
            AndroidUtilities.cancelRunOnUIThread(oVar.f228r);
        }
        if (!oVar.f226f && (Math.abs(f10) >= i10 || Math.abs(f11) >= i10)) {
            this.f208a = (float) oVar.f224c.f16338u.f16345i;
            this.f209b = (float) oVar.d.f16338u.f16345i;
            oVar.f226f = true;
        }
        if (oVar.f226f && !oVar.f227n) {
            oVar.f224c.f16338u.f16345i = (motionEvent2.getRawX() + this.f208a) - motionEvent.getRawX();
            oVar.d.f16338u.f16345i = (motionEvent2.getRawY() + this.f209b) - motionEvent.getRawY();
            oVar.f224c.f();
            oVar.d.f();
        }
        return oVar.f226f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o oVar = this.f210c;
        if (!oVar.f227n && !oVar.f229s) {
            oVar.c(true);
            return true;
        }
        return false;
    }
}
