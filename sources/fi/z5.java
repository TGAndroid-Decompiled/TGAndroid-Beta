package fi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class z5 extends FrameLayout {
    public final ta f12068a;

    public z5(ta taVar, Context context) {
        super(context);
        this.f12068a = taVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f12068a.f10780b2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
