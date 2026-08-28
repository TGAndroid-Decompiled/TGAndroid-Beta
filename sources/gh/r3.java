package gh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class r3 extends LinearLayout {
    public final int f8799a;
    public final k5 f8800b;

    public r3(k5 k5Var, Context context, int i9) {
        super(context);
        this.f8799a = i9;
        this.f8800b = k5Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f8799a) {
            case 0:
                if (!this.f8800b.U0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f8800b.U0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f8800b.U0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f8800b.U0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
