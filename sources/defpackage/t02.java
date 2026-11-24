package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class t02 extends no4 {
    public final x02 K;

    public t02(x02 x02Var, wjb wjbVar, Context context) {
        super(context, wjbVar);
        this.K = x02Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.c1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
