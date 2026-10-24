package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.lm0;
public final class z2 extends lm0 {
    public final q3 Y2;

    public z2(q3 q3Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Y2 = q3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.Y2.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.Y2.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
