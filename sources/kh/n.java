package kh;

import android.content.Context;
import android.view.MotionEvent;
import lh.bb;
import org.telegram.messenger.AndroidUtilities;
public final class n extends bb {
    public final s f10712j0;

    public n(s sVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f10712j0 = sVar;
    }

    @Override
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        s.U(this.f10712j0);
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
        s.T(this.f10712j0, i10);
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        s.T(this.f10712j0, i10);
    }
}
