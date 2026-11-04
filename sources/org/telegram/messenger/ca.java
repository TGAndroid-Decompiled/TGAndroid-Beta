package org.telegram.messenger;

import android.view.MotionEvent;
public final class ca {
    public final int f21952a;
    public final ai.c0 f21953b;

    public ca(ai.c0 c0Var, int i3) {
        this.f21952a = i3;
        this.f21953b = c0Var;
    }

    public final Boolean a(Object obj) {
        switch (this.f21952a) {
            case 0:
                return ai.c0.a(this.f21953b, (MotionEvent) obj);
            default:
                return ai.c0.b(this.f21953b, (MotionEvent) obj);
        }
    }
}
