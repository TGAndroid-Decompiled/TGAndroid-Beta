package fi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class z5 extends FrameLayout {
    public final ta f12069a;

    public z5(ta taVar, Context context) {
        super(context);
        this.f12069a = taVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f12069a.f10781b2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
