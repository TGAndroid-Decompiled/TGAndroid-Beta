package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class ii3 extends pg3 {
    public final uj3 P0;

    public ii3(uj3 uj3Var, Context context, uj3 uj3Var2, int i, int i2) {
        super(context, uj3Var2, i, i2);
        this.P0 = uj3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!uj3.s2(this.P0).z() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
