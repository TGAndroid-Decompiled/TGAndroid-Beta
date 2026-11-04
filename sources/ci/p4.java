package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class p4 extends LinearLayout {
    public final int f5746a;
    public final l6 f5747b;

    public p4(l6 l6Var, Context context, int i3) {
        super(context);
        this.f5746a = i3;
        this.f5747b = l6Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f5746a) {
            case 0:
                if (!this.f5747b.U2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f5747b.U2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f5747b.U2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f5747b.U2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
