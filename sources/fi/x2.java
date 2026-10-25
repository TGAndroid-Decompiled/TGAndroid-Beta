package fi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.mm0;
public final class x2 extends mm0 {
    public final o3 f11953f3;

    public x2(o3 o3Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f11953f3 = o3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f11953f3.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f11953f3.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
