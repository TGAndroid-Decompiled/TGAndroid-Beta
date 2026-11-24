package defpackage;

import android.view.MotionEvent;
public final class v05 {
    public final byte a;
    public final su b;

    public v05(su suVar, byte b) {
        this.a = b;
        this.b = suVar;
    }

    public final Boolean a(MotionEvent motionEvent) {
        byte b = this.a;
        su suVar = this.b;
        switch (b) {
            case 0:
                return suVar.c(motionEvent);
            default:
                return suVar.d(motionEvent);
        }
    }
}
