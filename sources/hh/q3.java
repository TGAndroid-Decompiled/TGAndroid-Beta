package hh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public final class q3 extends LinearLayout {

    public final int f9900a;

    public final i5 f9901b;

    public q3(i5 i5Var, Context context, int i10) {
        super(context);
        this.f9900a = i10;
        this.f9901b = i5Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f9900a) {
            case 0:
                if (this.f9901b.U0.c(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 1:
                if (this.f9901b.U0.c(1)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 2:
                if (this.f9901b.U0.c(2)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                if (this.f9901b.U0.c(3)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
