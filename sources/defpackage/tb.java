package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class tb extends b61 {
    public final byte m0;

    public tb(Context context, boolean z, ylb ylbVar, byte b) {
        super(ylbVar, context, z);
        this.m0 = b;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
            case 1:
                if (!this.e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean j() {
        switch (this.m0) {
            case 0:
            case 3:
                return false;
            default:
                return super.j();
        }
    }
}
