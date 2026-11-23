package org.telegram.messenger;

import android.view.MotionEvent;
public final class ha {
    public final int f24380a;
    public final ai.g0 f24381b;

    public ha(ai.g0 g0Var, int i7) {
        this.f24380a = i7;
        this.f24381b = g0Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f24380a) {
            case 0:
                return ai.g0.a(this.f24381b, (MotionEvent) obj);
            default:
                return ai.g0.b(this.f24381b, (MotionEvent) obj);
        }
    }
}
