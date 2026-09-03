package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
public final class q implements o1.f {
    public final int f18147a = 0;
    public final float f18148b;
    public final Runnable f18149c;
    public final KeyEvent.Callback d;

    public q(View view, float f10, Runnable runnable) {
        this.f18149c = runnable;
        this.d = view;
        this.f18148b = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f18147a) {
            case 0:
                float f12 = this.f18148b;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f18149c, (View) this.d, f12, hVar, z4, f10, f11);
                return;
            default:
                ph.d3 d3Var = (ph.d3) this.d;
                ph.c3 c3Var = d3Var.f41487b;
                if (!z4) {
                    c3Var.setTranslationY(this.f18148b);
                    c3Var.H = false;
                    d3Var.d = null;
                    d3Var.e = null;
                    Runnable runnable = this.f18149c;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public q(ph.d3 d3Var, float f10, Runnable runnable) {
        this.d = d3Var;
        this.f18148b = f10;
        this.f18149c = runnable;
    }
}
