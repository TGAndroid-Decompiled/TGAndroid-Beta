package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class j4 extends LinearLayout {
    public final int f9075a;
    public final f6 f9076b;

    public j4(f6 f6Var, Context context, int i7) {
        super(context);
        this.f9075a = i7;
        this.f9076b = f6Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f9075a) {
            case 0:
                if (!this.f9076b.X2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f9076b.X2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f9076b.X2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f9076b.X2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
