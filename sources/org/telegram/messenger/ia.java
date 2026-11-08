package org.telegram.messenger;

import android.view.MotionEvent;
public final class ia {
    public final int f23129a;
    public final bi.x5 f23130b;

    public ia(bi.x5 x5Var, int i7) {
        this.f23129a = i7;
        this.f23130b = x5Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f23129a) {
            case 0:
                return bi.x5.a(this.f23130b, (MotionEvent) obj);
            default:
                return bi.x5.b(this.f23130b, (MotionEvent) obj);
        }
    }
}
