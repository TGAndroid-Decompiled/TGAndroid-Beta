package org.telegram.messenger;

import android.view.MotionEvent;
public final class ia {
    public final int f23132a;
    public final bi.x5 f23133b;

    public ia(bi.x5 x5Var, int i7) {
        this.f23132a = i7;
        this.f23133b = x5Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f23132a) {
            case 0:
                return bi.x5.a(this.f23133b, (MotionEvent) obj);
            default:
                return bi.x5.b(this.f23133b, (MotionEvent) obj);
        }
    }
}
