package og;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f19399a;
    public float f19400b;
    public final i f19401c;

    public f(i iVar) {
        this.f19401c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f19401c;
        if (iVar.f19411f && !iVar.f19412n) {
            k kVar = iVar.f19410c.f18969u;
            if ((f7 / 7.0f) + ((float) kVar.f18975i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            kVar.f18975i = i.a(displayMetrics, f11);
            iVar.d.f18969u.f18975i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f18969u.f18975i));
            iVar.f19410c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f19401c;
        int i10 = iVar.F;
        if (!iVar.f19412n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f19413r);
        }
        if (!iVar.f19411f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f19399a = (float) iVar.f19410c.f18969u.f18975i;
            this.f19400b = (float) iVar.d.f18969u.f18975i;
            iVar.f19411f = true;
        }
        if (iVar.f19411f && !iVar.f19412n) {
            iVar.f19410c.f18969u.f18975i = (motionEvent2.getRawX() + this.f19399a) - motionEvent.getRawX();
            iVar.d.f18969u.f18975i = (motionEvent2.getRawY() + this.f19400b) - motionEvent.getRawY();
            iVar.f19410c.h();
            iVar.d.h();
        }
        return iVar.f19411f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f19401c;
        if (!iVar.f19412n && !iVar.f19414s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
