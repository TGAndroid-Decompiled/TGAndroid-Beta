package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.im0;
public final class z2 extends im0 {
    public final q3 V2;

    public z2(q3 q3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.V2 = q3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V2.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.V2.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
