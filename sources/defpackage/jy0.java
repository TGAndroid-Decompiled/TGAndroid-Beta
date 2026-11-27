package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
public final class jy0 extends a {
    public final wma G1;
    public final ny0 H1;

    public jy0(ny0 ny0Var, Context context, wma wmaVar) {
        super(context, null);
        this.H1 = ny0Var;
        this.G1 = wmaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ny0 ny0Var = this.H1;
        if (ny0Var.F1 && ny0Var.G1) {
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
        this.H1.W0();
    }
}
