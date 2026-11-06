package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class h5 extends LinearLayout {
    public final int f3995a;
    public final k7 f3996b;

    public h5(k7 k7Var, Context context, int i7) {
        super(context);
        this.f3995a = i7;
        this.f3996b = k7Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3995a) {
            case 0:
                if (!this.f3996b.T2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f3996b.T2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f3996b.T2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f3996b.T2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
