package ai;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class k5 extends LinearLayout {
    public final int f1617a;
    public final l7 f1618b;

    public k5(l7 l7Var, Context context, int i10) {
        super(context);
        this.f1617a = i10;
        this.f1618b = l7Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f1617a) {
            case 0:
                if (!this.f1618b.f1713b1.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f1618b.f1713b1.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f1618b.f1713b1.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f1618b.f1713b1.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
