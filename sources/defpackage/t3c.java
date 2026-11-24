package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class t3c extends r59 {
    public final a4c f3;
    public final d4c g3;

    public t3c(d4c d4cVar, Context context, a4c a4cVar) {
        super(context, null);
        this.g3 = d4cVar;
        this.f3 = a4cVar;
    }

    @Override
    public final boolean F0(float f) {
        if (f >= gm.L(58.0f) + this.g3.F) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.g3.I) {
            super.requestLayout();
        }
    }
}
