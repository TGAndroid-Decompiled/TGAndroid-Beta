package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class knc extends hl3 {
    public final lnc M;

    public knc(lnc lncVar, Context context) {
        super(context);
        this.M = lncVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.M.y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
