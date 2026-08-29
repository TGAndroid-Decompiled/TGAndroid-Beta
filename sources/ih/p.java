package ih;

import android.view.MotionEvent;
public final class p extends nh.d {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.S) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
