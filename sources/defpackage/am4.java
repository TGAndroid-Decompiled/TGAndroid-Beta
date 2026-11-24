package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class am4 extends ImageButton {
    public final fm4 a;

    public am4(fm4 fm4Var, Context context) {
        super(context);
        this.a = fm4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
