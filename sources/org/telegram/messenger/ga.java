package org.telegram.messenger;

import android.view.MotionEvent;
public final class ga {
    public final int f24188a;
    public final ai.k0 f24189b;

    public ga(ai.k0 k0Var, int i7) {
        this.f24188a = i7;
        this.f24189b = k0Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f24188a) {
            case 0:
                return ai.k0.a(this.f24189b, (MotionEvent) obj);
            default:
                return ai.k0.b(this.f24189b, (MotionEvent) obj);
        }
    }
}
