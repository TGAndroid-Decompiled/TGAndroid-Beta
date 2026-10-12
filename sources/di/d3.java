package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.mm0;
public final class d3 extends mm0 {
    public final v3 V2;

    public d3(v3 v3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = v3Var;
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
