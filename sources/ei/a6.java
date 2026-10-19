package ei;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class a6 extends FrameLayout {
    public final xa f8691a;

    public a6(xa xaVar, Context context) {
        super(context);
        this.f8691a = xaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f8691a.f9022m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
