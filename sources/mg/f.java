package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16426a;
    public float f16427b;
    public final i f16428c;

    public f(i iVar) {
        this.f16428c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16428c;
        if (iVar.f16441f && !iVar.f16442n) {
            l lVar = iVar.f16439c.f16942u;
            if ((f7 / 7.0f) + ((float) lVar.f16949i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16949i = i.a(displayMetrics, f11);
            iVar.d.f16942u.f16949i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16942u.f16949i));
            iVar.f16439c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16428c;
        int i10 = iVar.F;
        if (!iVar.f16442n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16443r);
        }
        if (!iVar.f16441f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16426a = (float) iVar.f16439c.f16942u.f16949i;
            this.f16427b = (float) iVar.d.f16942u.f16949i;
            iVar.f16441f = true;
        }
        if (iVar.f16441f && !iVar.f16442n) {
            iVar.f16439c.f16942u.f16949i = (motionEvent2.getRawX() + this.f16426a) - motionEvent.getRawX();
            iVar.d.f16942u.f16949i = (motionEvent2.getRawY() + this.f16427b) - motionEvent.getRawY();
            iVar.f16439c.h();
            iVar.d.h();
        }
        return iVar.f16441f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16428c;
        if (!iVar.f16442n && !iVar.f16444s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
