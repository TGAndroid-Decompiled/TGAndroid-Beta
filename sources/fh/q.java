package fh;

import android.content.Context;
import android.view.MotionEvent;
import gh.gb;
import org.telegram.messenger.AndroidUtilities;
public final class q extends gb {
    public final x f6722i0;

    public q(x xVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.f6722i0 = xVar;
    }

    @Override
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        x.T(this.f6722i0);
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
    public final void e(int i9) {
        x.S(this.f6722i0, i9);
    }

    @Override
    public final void setValue(int i9) {
        super.setValue(i9);
        x.S(this.f6722i0, i9);
    }
}
