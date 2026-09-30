package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class k6 extends FrameLayout {
    public final nb f4899a;

    public k6(nb nbVar, Context context) {
        super(context);
        this.f4899a = nbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4899a.f5354m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
