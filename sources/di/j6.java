package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class j6 extends FrameLayout {
    public final mb f7121a;

    public j6(mb mbVar, Context context) {
        super(context);
        this.f7121a = mbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7121a.f7538m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
