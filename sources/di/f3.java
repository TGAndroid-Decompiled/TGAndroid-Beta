package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ll0;
public final class f3 extends ll0 {
    public final x3 X2;

    public f3(x3 x3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = x3Var;
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
