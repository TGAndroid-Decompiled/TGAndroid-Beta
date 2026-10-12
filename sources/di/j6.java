package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class j6 extends FrameLayout {
    public final mb f7118a;

    public j6(mb mbVar, Context context) {
        super(context);
        this.f7118a = mbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7118a.f7535m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
