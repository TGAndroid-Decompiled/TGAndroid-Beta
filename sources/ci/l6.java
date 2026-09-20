package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class l6 extends FrameLayout {
    public final qb f4940a;

    public l6(qb qbVar, Context context) {
        super(context);
        this.f4940a = qbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4940a.f5433m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
