package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16413a;
    public float f16414b;
    public final i f16415c;

    public f(i iVar) {
        this.f16415c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16415c;
        if (iVar.f16428f && !iVar.f16429n) {
            l lVar = iVar.f16426c.f16988u;
            if ((f7 / 7.0f) + ((float) lVar.f16995i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16995i = i.a(displayMetrics, f11);
            iVar.d.f16988u.f16995i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16988u.f16995i));
            iVar.f16426c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16415c;
        int i10 = iVar.F;
        if (!iVar.f16429n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16430r);
        }
        if (!iVar.f16428f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16413a = (float) iVar.f16426c.f16988u.f16995i;
            this.f16414b = (float) iVar.d.f16988u.f16995i;
            iVar.f16428f = true;
        }
        if (iVar.f16428f && !iVar.f16429n) {
            iVar.f16426c.f16988u.f16995i = (motionEvent2.getRawX() + this.f16413a) - motionEvent.getRawX();
            iVar.d.f16988u.f16995i = (motionEvent2.getRawY() + this.f16414b) - motionEvent.getRawY();
            iVar.f16426c.f();
            iVar.d.f();
        }
        return iVar.f16428f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16415c;
        if (!iVar.f16429n && !iVar.f16431s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
