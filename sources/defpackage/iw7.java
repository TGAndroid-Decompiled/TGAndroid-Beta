package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class iw7 extends dv3 {
    public final byte h2;

    public iw7(Context context, byte b) {
        super(context);
        this.h2 = b;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.h2;
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.h2) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
