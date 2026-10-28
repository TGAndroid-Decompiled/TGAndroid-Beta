package og;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f19398a;
    public float f19399b;
    public final i f19400c;

    public f(i iVar) {
        this.f19400c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f19400c;
        if (iVar.f19410f && !iVar.f19411n) {
            k kVar = iVar.f19409c.f18968u;
            if ((f7 / 7.0f) + ((float) kVar.f18974i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            kVar.f18974i = i.a(displayMetrics, f11);
            iVar.d.f18968u.f18974i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f18968u.f18974i));
            iVar.f19409c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f19400c;
        int i10 = iVar.F;
        if (!iVar.f19411n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f19412r);
        }
        if (!iVar.f19410f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f19398a = (float) iVar.f19409c.f18968u.f18974i;
            this.f19399b = (float) iVar.d.f18968u.f18974i;
            iVar.f19410f = true;
        }
        if (iVar.f19410f && !iVar.f19411n) {
            iVar.f19409c.f18968u.f18974i = (motionEvent2.getRawX() + this.f19398a) - motionEvent.getRawX();
            iVar.d.f18968u.f18974i = (motionEvent2.getRawY() + this.f19399b) - motionEvent.getRawY();
            iVar.f19409c.h();
            iVar.d.h();
        }
        return iVar.f19410f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f19400c;
        if (!iVar.f19411n && !iVar.f19413s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
