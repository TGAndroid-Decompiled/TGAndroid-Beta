package gh;

import android.view.MotionEvent;
import org.telegram.ui.Components.p80;

public final class p1 extends p80 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
