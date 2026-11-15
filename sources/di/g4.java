package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class g4 extends LinearLayout {
    public final int f8595a;
    public final c6 f8596b;

    public g4(c6 c6Var, Context context, int i7) {
        super(context);
        this.f8595a = i7;
        this.f8596b = c6Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f8595a) {
            case 0:
                if (!this.f8596b.X2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f8596b.X2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f8596b.X2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f8596b.X2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
