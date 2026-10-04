package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class k6 extends FrameLayout {
    public final mb f5307a;

    public k6(mb mbVar, Context context) {
        super(context);
        this.f5307a = mbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f5307a.f5769m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
