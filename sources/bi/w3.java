package bi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.vl0;
public final class w3 extends vl0 {
    public final p4 X2;

    public w3(p4 p4Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = p4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.X2.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.X2.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
