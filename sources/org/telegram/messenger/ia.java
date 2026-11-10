package org.telegram.messenger;

import android.view.MotionEvent;
public final class ia {
    public final int f23133a;
    public final bi.x5 f23134b;

    public ia(bi.x5 x5Var, int i7) {
        this.f23133a = i7;
        this.f23134b = x5Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f23133a) {
            case 0:
                return bi.x5.a(this.f23134b, (MotionEvent) obj);
            default:
                return bi.x5.b(this.f23134b, (MotionEvent) obj);
        }
    }
}
