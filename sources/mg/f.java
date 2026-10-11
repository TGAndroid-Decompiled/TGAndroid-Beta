package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16484a;
    public float f16485b;
    public final i f16486c;

    public f(i iVar) {
        this.f16486c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16486c;
        if (iVar.f16499f && !iVar.f16500n) {
            l lVar = iVar.f16497c.f17024u;
            if ((f7 / 7.0f) + ((float) lVar.f17031i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f17031i = i.a(displayMetrics, f11);
            iVar.d.f17024u.f17031i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f17024u.f17031i));
            iVar.f16497c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16486c;
        int i10 = iVar.F;
        if (!iVar.f16500n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16501r);
        }
        if (!iVar.f16499f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16484a = (float) iVar.f16497c.f17024u.f17031i;
            this.f16485b = (float) iVar.d.f17024u.f17031i;
            iVar.f16499f = true;
        }
        if (iVar.f16499f && !iVar.f16500n) {
            iVar.f16497c.f17024u.f17031i = (motionEvent2.getRawX() + this.f16484a) - motionEvent.getRawX();
            iVar.d.f17024u.f17031i = (motionEvent2.getRawY() + this.f16485b) - motionEvent.getRawY();
            iVar.f16497c.h();
            iVar.d.h();
        }
        return iVar.f16499f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16486c;
        if (!iVar.f16500n && !iVar.f16502s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
