package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class em4 extends ImageButton {
    public final jm4 a;

    public em4(jm4 jm4Var, Context context) {
        super(context);
        this.a = jm4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
