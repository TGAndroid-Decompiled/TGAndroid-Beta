package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16075a;
    public float f16076b;
    public final i f16077c;

    public f(i iVar) {
        this.f16077c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16077c;
        if (iVar.f16087f && !iVar.f16088n) {
            l lVar = iVar.f16086c.f16161u;
            if ((f7 / 7.0f) + ((float) lVar.f16167i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16167i = i.a(displayMetrics, f11);
            iVar.d.f16161u.f16167i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16161u.f16167i));
            iVar.f16086c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16077c;
        int i10 = iVar.F;
        if (!iVar.f16088n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16089r);
        }
        if (!iVar.f16087f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16075a = (float) iVar.f16086c.f16161u.f16167i;
            this.f16076b = (float) iVar.d.f16161u.f16167i;
            iVar.f16087f = true;
        }
        if (iVar.f16087f && !iVar.f16088n) {
            iVar.f16086c.f16161u.f16167i = (motionEvent2.getRawX() + this.f16075a) - motionEvent.getRawX();
            iVar.d.f16161u.f16167i = (motionEvent2.getRawY() + this.f16076b) - motionEvent.getRawY();
            iVar.f16086c.h();
            iVar.d.h();
        }
        return iVar.f16087f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16077c;
        if (!iVar.f16088n && !iVar.f16090s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
