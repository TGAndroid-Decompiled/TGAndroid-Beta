package ei;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class a6 extends FrameLayout {
    public final xa f8700a;

    public a6(xa xaVar, Context context) {
        super(context);
        this.f8700a = xaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f8700a.f9033m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
