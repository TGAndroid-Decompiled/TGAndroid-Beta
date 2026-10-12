package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16364a;
    public float f16365b;
    public final i f16366c;

    public f(i iVar) {
        this.f16366c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16366c;
        if (iVar.f16376f && !iVar.f16377n) {
            l lVar = iVar.f16375c.f16468u;
            if ((f7 / 7.0f) + ((float) lVar.f16474i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16474i = i.a(displayMetrics, f11);
            iVar.d.f16468u.f16474i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16468u.f16474i));
            iVar.f16375c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16366c;
        int i10 = iVar.F;
        if (!iVar.f16377n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16378r);
        }
        if (!iVar.f16376f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16364a = (float) iVar.f16375c.f16468u.f16474i;
            this.f16365b = (float) iVar.d.f16468u.f16474i;
            iVar.f16376f = true;
        }
        if (iVar.f16376f && !iVar.f16377n) {
            iVar.f16375c.f16468u.f16474i = (motionEvent2.getRawX() + this.f16364a) - motionEvent.getRawX();
            iVar.d.f16468u.f16474i = (motionEvent2.getRawY() + this.f16365b) - motionEvent.getRawY();
            iVar.f16375c.h();
            iVar.d.h();
        }
        return iVar.f16376f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16366c;
        if (!iVar.f16377n && !iVar.f16379s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
