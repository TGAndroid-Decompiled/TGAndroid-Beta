package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class xrc extends zl3 {
    public final yrc M;

    public xrc(yrc yrcVar, Context context) {
        super(context);
        this.M = yrcVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.M.y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
