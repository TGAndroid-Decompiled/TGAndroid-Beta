package defpackage;

import android.view.MotionEvent;
public final class wy4 {
    public final byte a;
    public final st b;

    public wy4(st stVar, byte b) {
        this.a = b;
        this.b = stVar;
    }

    public final Boolean a(MotionEvent motionEvent) {
        byte b = this.a;
        st stVar = this.b;
        switch (b) {
            case 0:
                return stVar.c(motionEvent);
            default:
                return stVar.d(motionEvent);
        }
    }
}
