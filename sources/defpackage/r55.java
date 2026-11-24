package defpackage;

import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class r55 extends FrameLayout {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
