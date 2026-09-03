package mh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class p3 extends LinearLayout {
    public final int f14582a;
    public final g5 f14583b;

    public p3(g5 g5Var, Context context, int i10) {
        super(context);
        this.f14582a = i10;
        this.f14583b = g5Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f14582a) {
            case 0:
                if (!this.f14583b.V0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f14583b.V0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f14583b.V0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f14583b.V0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
