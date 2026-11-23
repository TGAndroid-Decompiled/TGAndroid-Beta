package org.telegram.messenger;

import android.view.MotionEvent;
public final class ha {
    public final int f24416a;
    public final ai.l0 f24417b;

    public ha(ai.l0 l0Var, int i7) {
        this.f24416a = i7;
        this.f24417b = l0Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f24416a) {
            case 0:
                return ai.l0.a(this.f24417b, (MotionEvent) obj);
            default:
                return ai.l0.b(this.f24417b, (MotionEvent) obj);
        }
    }
}
