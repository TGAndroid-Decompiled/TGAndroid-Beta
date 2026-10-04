package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.zl0;
public final class e3 extends zl0 {
    public final w3 f4980e3;

    public e3(w3 w3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f4980e3 = w3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4980e3.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4980e3.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
