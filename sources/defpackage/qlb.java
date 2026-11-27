package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class qlb extends ju3 {
    public final rlb i2;

    public qlb(rlb rlbVar, Context context) {
        super(context);
        this.i2 = rlbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g44 g44Var = this.i2.J;
        if (g44Var != null && g44Var.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.i2.m();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.i2.m();
    }
}
