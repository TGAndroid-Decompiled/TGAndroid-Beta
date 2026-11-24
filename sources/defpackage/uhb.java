package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class uhb extends st3 {
    public final vhb h2;

    public uhb(vhb vhbVar, Context context) {
        super(context);
        this.h2 = vhbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k34 k34Var = this.h2.J;
        if (k34Var != null && k34Var.getVisibility() == 0) {
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
