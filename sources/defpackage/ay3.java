package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class ay3 extends zx3 {
    public final by3 P;

    public ay3(by3 by3Var, Context context, int i) {
        super(by3Var.s, context, i);
        this.P = by3Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
