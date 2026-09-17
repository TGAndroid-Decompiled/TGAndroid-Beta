package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class l6 extends FrameLayout {
    public final rb f7533a;

    public l6(rb rbVar, Context context) {
        super(context);
        this.f7533a = rbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7533a.f7976m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
