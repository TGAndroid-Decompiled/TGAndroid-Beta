package lh;

import android.view.MotionEvent;
import org.telegram.ui.Components.g90;
public final class l1 extends g90 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
