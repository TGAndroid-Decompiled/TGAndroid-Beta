package lh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public final class a6 extends FrameLayout {

    public final va f15645a;

    public a6(va vaVar, Context context) {
        super(context);
        this.f15645a = vaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15645a.f15974i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
