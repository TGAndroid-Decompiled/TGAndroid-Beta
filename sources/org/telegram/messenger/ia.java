package org.telegram.messenger;

import android.view.MotionEvent;
public final class ia {
    public final int f23139a;
    public final bi.x5 f23140b;

    public ia(bi.x5 x5Var, int i7) {
        this.f23139a = i7;
        this.f23140b = x5Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f23139a) {
            case 0:
                return bi.x5.a(this.f23140b, (MotionEvent) obj);
            default:
                return bi.x5.b(this.f23140b, (MotionEvent) obj);
        }
    }
}
