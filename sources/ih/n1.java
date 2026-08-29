package ih;

import android.view.MotionEvent;
import org.telegram.ui.Components.y80;
public final class n1 extends y80 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
