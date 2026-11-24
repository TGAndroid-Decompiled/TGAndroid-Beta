package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
public final class by0 extends a {
    public final cja G1;
    public final fy0 H1;

    public by0(fy0 fy0Var, Context context, cja cjaVar) {
        super(context, null);
        this.H1 = fy0Var;
        this.G1 = cjaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        fy0 fy0Var = this.H1;
        if (fy0Var.F1 && fy0Var.G1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.G1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.H1.V0();
    }
}
