package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16448a;
    public float f16449b;
    public final i f16450c;

    public f(i iVar) {
        this.f16450c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16450c;
        if (iVar.f16463f && !iVar.f16464n) {
            l lVar = iVar.f16461c.f16988u;
            if ((f7 / 7.0f) + ((float) lVar.f16995i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16995i = i.a(displayMetrics, f11);
            iVar.d.f16988u.f16995i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16988u.f16995i));
            iVar.f16461c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16450c;
        int i10 = iVar.F;
        if (!iVar.f16464n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16465r);
        }
        if (!iVar.f16463f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16448a = (float) iVar.f16461c.f16988u.f16995i;
            this.f16449b = (float) iVar.d.f16988u.f16995i;
            iVar.f16463f = true;
        }
        if (iVar.f16463f && !iVar.f16464n) {
            iVar.f16461c.f16988u.f16995i = (motionEvent2.getRawX() + this.f16448a) - motionEvent.getRawX();
            iVar.d.f16988u.f16995i = (motionEvent2.getRawY() + this.f16449b) - motionEvent.getRawY();
            iVar.f16461c.h();
            iVar.d.h();
        }
        return iVar.f16463f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16450c;
        if (!iVar.f16464n && !iVar.f16466s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
