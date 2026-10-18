package ai;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class j5 extends LinearLayout {
    public final int f1564a;
    public final k7 f1565b;

    public j5(k7 k7Var, Context context, int i10) {
        super(context);
        this.f1564a = i10;
        this.f1565b = k7Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f1564a) {
            case 0:
                if (!this.f1565b.f1660b1.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f1565b.f1660b1.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f1565b.f1660b1.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f1565b.f1660b1.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
