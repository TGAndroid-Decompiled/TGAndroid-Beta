package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class wjb extends dv3 {
    public final xjb h2;

    public wjb(xjb xjbVar, Context context) {
        super(context);
        this.h2 = xjbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        v44 v44Var = this.h2.J;
        if (v44Var != null && v44Var.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h2.m();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.h2.m();
    }
}
