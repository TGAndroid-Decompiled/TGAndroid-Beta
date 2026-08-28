package kh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class b6 extends FrameLayout {
    public final ya f15003a;

    public b6(ya yaVar, Context context) {
        super(context);
        this.f15003a = yaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15003a.f15284i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
