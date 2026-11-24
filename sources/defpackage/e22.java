package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class e22 extends oq4 {
    public final i22 K;

    public e22(i22 i22Var, ylb ylbVar, Context context) {
        super(context, ylbVar);
        this.K = i22Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.c1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
