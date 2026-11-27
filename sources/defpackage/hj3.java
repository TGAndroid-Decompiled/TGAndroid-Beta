package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class hj3 extends rq4 {
    public final byte L;

    public hj3(Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.L = b;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
