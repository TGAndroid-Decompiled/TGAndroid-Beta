package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16170a;
    public float f16171b;
    public final i f16172c;

    public f(i iVar) {
        this.f16172c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16172c;
        if (iVar.f16185f && !iVar.f16186n) {
            l lVar = iVar.f16183c.f16690u;
            if ((f7 / 7.0f) + ((float) lVar.f16697i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16697i = i.a(displayMetrics, f11);
            iVar.d.f16690u.f16697i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16690u.f16697i));
            iVar.f16183c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16172c;
        int i10 = iVar.F;
        if (!iVar.f16186n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16187r);
        }
        if (!iVar.f16185f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16170a = (float) iVar.f16183c.f16690u.f16697i;
            this.f16171b = (float) iVar.d.f16690u.f16697i;
            iVar.f16185f = true;
        }
        if (iVar.f16185f && !iVar.f16186n) {
            iVar.f16183c.f16690u.f16697i = (motionEvent2.getRawX() + this.f16170a) - motionEvent.getRawX();
            iVar.d.f16690u.f16697i = (motionEvent2.getRawY() + this.f16171b) - motionEvent.getRawY();
            iVar.f16183c.h();
            iVar.d.h();
        }
        return iVar.f16185f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16172c;
        if (!iVar.f16186n && !iVar.f16188s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
