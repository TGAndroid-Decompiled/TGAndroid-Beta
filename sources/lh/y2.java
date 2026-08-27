package lh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.zk0;

public final class y2 extends zk0 {
    public final p3 T2;

    public y2(p3 p3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = p3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.T2.G) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.T2.G) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
