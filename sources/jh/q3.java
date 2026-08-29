package jh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class q3 extends LinearLayout {
    public final int f12657a;
    public final h5 f12658b;

    public q3(h5 h5Var, Context context, int i10) {
        super(context);
        this.f12657a = i10;
        this.f12658b = h5Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f12657a) {
            case 0:
                if (!this.f12658b.U0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f12658b.U0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f12658b.U0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f12658b.U0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
