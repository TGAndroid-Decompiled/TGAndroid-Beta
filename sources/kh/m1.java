package kh;

import android.view.MotionEvent;
import org.telegram.ui.Components.f90;
public final class m1 extends f90 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
