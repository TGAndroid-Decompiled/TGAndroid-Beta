package kh;

import android.view.MotionEvent;
import org.telegram.ui.Components.e90;
public final class l1 extends e90 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
