package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class kz3 extends jz3 {
    public final lz3 P;

    public kz3(lz3 lz3Var, Context context, int i) {
        super(lz3Var.s, context, i);
        this.P = lz3Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
