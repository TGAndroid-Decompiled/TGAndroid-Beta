package fh;

import android.view.MotionEvent;
import org.telegram.ui.Components.l80;
public final class t1 extends l80 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
