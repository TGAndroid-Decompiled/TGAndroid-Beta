package defpackage;

import android.view.MotionEvent;
public final class a15 {
    public final byte a;
    public final tt b;

    public a15(tt ttVar, byte b) {
        this.a = b;
        this.b = ttVar;
    }

    public final Boolean a(MotionEvent motionEvent) {
        byte b = this.a;
        tt ttVar = this.b;
        switch (b) {
            case 0:
                return ttVar.c(motionEvent);
            default:
                return ttVar.d(motionEvent);
        }
    }
}
