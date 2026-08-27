package gh;

import android.content.Context;
import android.view.MotionEvent;
import hh.gb;
import org.telegram.messenger.AndroidUtilities;

public final class p extends gb {

    public final v f7487i0;

    public p(v vVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f7487i0 = vVar;
    }

    @Override
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        v.U(this.f7487i0);
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
        v.T(this.f7487i0, i10);
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        v.T(this.f7487i0, i10);
    }
}
