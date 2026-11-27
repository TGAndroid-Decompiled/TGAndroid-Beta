package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class ox7 extends ju3 {
    public final byte i2;

    public ox7(Context context, byte b) {
        super(context);
        this.i2 = b;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.i2;
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.i2) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
