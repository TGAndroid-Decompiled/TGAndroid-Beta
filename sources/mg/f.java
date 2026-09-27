package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f15067a;
    public float f15068b;
    public final i f15069c;

    public f(i iVar) {
        this.f15069c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f15069c;
        if (iVar.f15079f && !iVar.f15080n) {
            l lVar = iVar.f15078c.f15572u;
            if ((f7 / 7.0f) + ((float) lVar.f15578i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15578i = i.a(displayMetrics, f11);
            iVar.d.f15572u.f15578i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15572u.f15578i));
            iVar.f15078c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f15069c;
        int i10 = iVar.F;
        if (!iVar.f15080n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f15081r);
        }
        if (!iVar.f15079f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f15067a = (float) iVar.f15078c.f15572u.f15578i;
            this.f15068b = (float) iVar.d.f15572u.f15578i;
            iVar.f15079f = true;
        }
        if (iVar.f15079f && !iVar.f15080n) {
            iVar.f15078c.f15572u.f15578i = (motionEvent2.getRawX() + this.f15067a) - motionEvent.getRawX();
            iVar.d.f15572u.f15578i = (motionEvent2.getRawY() + this.f15068b) - motionEvent.getRawY();
            iVar.f15078c.f();
            iVar.d.f();
        }
        return iVar.f15079f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f15069c;
        if (!iVar.f15080n && !iVar.f15082s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
