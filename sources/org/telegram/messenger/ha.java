package org.telegram.messenger;

import android.view.MotionEvent;
public final class ha {
    public final int f24076a;
    public final ai.k0 f24077b;

    public ha(ai.k0 k0Var, int i7) {
        this.f24076a = i7;
        this.f24077b = k0Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f24076a) {
            case 0:
                return ai.k0.a(this.f24077b, (MotionEvent) obj);
            default:
                return ai.k0.b(this.f24077b, (MotionEvent) obj);
        }
    }
}
