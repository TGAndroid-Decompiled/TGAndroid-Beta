package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class f5 extends LinearLayout {
    public final int f4603a;
    public final h7 f4604b;

    public f5(h7 h7Var, Context context, int i10) {
        super(context);
        this.f4603a = i10;
        this.f4604b = h7Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f4603a) {
            case 0:
                if (!this.f4604b.f4730b1.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f4604b.f4730b1.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f4604b.f4730b1.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f4604b.f4730b1.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
