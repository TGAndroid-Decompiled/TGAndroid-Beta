package lh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class p3 extends LinearLayout {
    public final int f12899a;
    public final g5 f12900b;

    public p3(g5 g5Var, Context context, int i10) {
        super(context);
        this.f12899a = i10;
        this.f12900b = g5Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f12899a) {
            case 0:
                if (!this.f12900b.V0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f12900b.V0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f12900b.V0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f12900b.V0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
