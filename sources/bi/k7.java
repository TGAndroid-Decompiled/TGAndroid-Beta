package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class k7 extends FrameLayout {
    public final ad f2991a;

    public k7(ad adVar, Context context) {
        super(context);
        this.f2991a = adVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f2991a.f3523m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
