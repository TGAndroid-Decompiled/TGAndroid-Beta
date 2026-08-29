package ih;

import android.content.Context;
import android.view.MotionEvent;
import jh.ab;
import org.telegram.messenger.AndroidUtilities;
public final class o extends ab {
    public final t f9305i0;

    public o(t tVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f9305i0 = tVar;
    }

    @Override
    public final boolean d(float f9) {
        if (getProgress() <= 0.99d && f9 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        t.U(this.f9305i0);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void e(int i10) {
        t.T(this.f9305i0, i10);
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        t.T(this.f9305i0, i10);
    }
}
