package org.telegram.messenger;

import android.view.MotionEvent;
public final class ga {
    public final int f24286a;
    public final ai.h0 f24287b;

    public ga(ai.h0 h0Var, int i7) {
        this.f24286a = i7;
        this.f24287b = h0Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f24286a) {
            case 0:
                return ai.h0.a(this.f24287b, (MotionEvent) obj);
            default:
                return ai.h0.b(this.f24287b, (MotionEvent) obj);
        }
    }
}
