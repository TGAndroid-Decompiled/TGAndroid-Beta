package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class vy3 extends uy3 {
    public final wy3 P;

    public vy3(wy3 wy3Var, Context context, int i) {
        super(wy3Var.s, context, i);
        this.P = wy3Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
