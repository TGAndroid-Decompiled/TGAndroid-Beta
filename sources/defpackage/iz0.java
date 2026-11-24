package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
public final class iz0 extends a {
    public final ela G1;
    public final mz0 H1;

    public iz0(mz0 mz0Var, Context context, ela elaVar) {
        super(context, null);
        this.H1 = mz0Var;
        this.G1 = elaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mz0 mz0Var = this.H1;
        if (mz0Var.F1 && mz0Var.G1) {
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
