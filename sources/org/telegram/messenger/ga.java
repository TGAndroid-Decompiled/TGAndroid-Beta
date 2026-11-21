package org.telegram.messenger;

import android.view.MotionEvent;
public final class ga {
    public final int f24213a;
    public final ai.l0 f24214b;

    public ga(ai.l0 l0Var, int i7) {
        this.f24213a = i7;
        this.f24214b = l0Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f24213a) {
            case 0:
                return ai.l0.a(this.f24214b, (MotionEvent) obj);
            default:
                return ai.l0.b(this.f24214b, (MotionEvent) obj);
        }
    }
}
