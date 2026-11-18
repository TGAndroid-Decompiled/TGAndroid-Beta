package org.telegram.messenger;

import android.view.MotionEvent;
public final class ga {
    public final int f24185a;
    public final ai.k0 f24186b;

    public ga(ai.k0 k0Var, int i7) {
        this.f24185a = i7;
        this.f24186b = k0Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f24185a) {
            case 0:
                return ai.k0.a(this.f24186b, (MotionEvent) obj);
            default:
                return ai.k0.b(this.f24186b, (MotionEvent) obj);
        }
    }
}
