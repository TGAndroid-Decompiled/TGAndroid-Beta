package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class j4 extends LinearLayout {
    public final int f9062a;
    public final f6 f9063b;

    public j4(f6 f6Var, Context context, int i7) {
        super(context);
        this.f9062a = i7;
        this.f9063b = f6Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f9062a) {
            case 0:
                if (!this.f9063b.X2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f9063b.X2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f9063b.X2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f9063b.X2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
