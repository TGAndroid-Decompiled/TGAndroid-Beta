package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class aj3 extends ih3 {
    public final nk3 P0;

    public aj3(nk3 nk3Var, Context context, nk3 nk3Var2, int i, int i2) {
        super(context, nk3Var2, i, i2);
        this.P0 = nk3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!nk3.d1(this.P0).y() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
