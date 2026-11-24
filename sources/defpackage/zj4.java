package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class zj4 extends ImageButton {
    public final ek4 a;

    public zj4(ek4 ek4Var, Context context) {
        super(context);
        this.a = ek4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
