package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class j12 extends rq4 {
    public final n12 L;

    public j12(n12 n12Var, vnb vnbVar, Context context) {
        super(context, vnbVar);
        this.L = n12Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.d1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
