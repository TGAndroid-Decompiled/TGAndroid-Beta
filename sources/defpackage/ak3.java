package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class ak3 extends ig4 {
    public final nk3 H0;

    public ak3(nk3 nk3Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.H0 = nk3Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.H0.p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
