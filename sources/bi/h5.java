package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class h5 extends LinearLayout {
    public final int f3992a;
    public final k7 f3993b;

    public h5(k7 k7Var, Context context, int i7) {
        super(context);
        this.f3992a = i7;
        this.f3993b = k7Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3992a) {
            case 0:
                if (!this.f3993b.W2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f3993b.W2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f3993b.W2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f3993b.W2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
