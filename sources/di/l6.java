package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class l6 extends FrameLayout {
    public final rb f7561a;

    public l6(rb rbVar, Context context) {
        super(context);
        this.f7561a = rbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7561a.f8004m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
