package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16422a;
    public float f16423b;
    public final i f16424c;

    public f(i iVar) {
        this.f16424c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16424c;
        if (iVar.f16437f && !iVar.f16438n) {
            l lVar = iVar.f16435c.f16938u;
            if ((f7 / 7.0f) + ((float) lVar.f16945i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16945i = i.a(displayMetrics, f11);
            iVar.d.f16938u.f16945i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16938u.f16945i));
            iVar.f16435c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16424c;
        int i10 = iVar.F;
        if (!iVar.f16438n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16439r);
        }
        if (!iVar.f16437f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16422a = (float) iVar.f16435c.f16938u.f16945i;
            this.f16423b = (float) iVar.d.f16938u.f16945i;
            iVar.f16437f = true;
        }
        if (iVar.f16437f && !iVar.f16438n) {
            iVar.f16435c.f16938u.f16945i = (motionEvent2.getRawX() + this.f16422a) - motionEvent.getRawX();
            iVar.d.f16938u.f16945i = (motionEvent2.getRawY() + this.f16423b) - motionEvent.getRawY();
            iVar.f16435c.h();
            iVar.d.h();
        }
        return iVar.f16437f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16424c;
        if (!iVar.f16438n && !iVar.f16440s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
