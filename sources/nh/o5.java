package nh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class o5 extends FrameLayout {
    public final ja f18217a;

    public o5(ja jaVar, Context context) {
        super(context);
        this.f18217a = jaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f18217a.f18639i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
