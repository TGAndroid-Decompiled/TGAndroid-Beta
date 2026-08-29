package nh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.jl0;
public final class w2 extends jl0 {
    public final n3 T2;

    public w2(n3 n3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = n3Var;
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
