package org.telegram.messenger;

import android.view.MotionEvent;
public final class ha {
    public final int f24073a;
    public final ai.j0 f24074b;

    public ha(ai.j0 j0Var, int i7) {
        this.f24073a = i7;
        this.f24074b = j0Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f24073a) {
            case 0:
                return ai.j0.a(this.f24074b, (MotionEvent) obj);
            default:
                return ai.j0.b(this.f24074b, (MotionEvent) obj);
        }
    }
}
