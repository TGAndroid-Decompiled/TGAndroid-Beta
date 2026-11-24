package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class qi3 extends he4 {
    public final cj3 H0;

    public qi3(cj3 cj3Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.H0 = cj3Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.H0.p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
