package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
public final class q implements o1.f {
    public final int f19731a = 0;
    public final float f19732b;
    public final Runnable f19733c;
    public final KeyEvent.Callback d;

    public q(View view, float f10, Runnable runnable) {
        this.f19733c = runnable;
        this.d = view;
        this.f19732b = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f19731a) {
            case 0:
                float f12 = this.f19732b;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f19733c, (View) this.d, f12, hVar, z4, f10, f11);
                return;
            default:
                qh.d3 d3Var = (qh.d3) this.d;
                qh.c3 c3Var = d3Var.f45198b;
                if (!z4) {
                    c3Var.setTranslationY(this.f19732b);
                    c3Var.H = false;
                    d3Var.d = null;
                    d3Var.f45200e = null;
                    Runnable runnable = this.f19733c;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public q(qh.d3 d3Var, float f10, Runnable runnable) {
        this.d = d3Var;
        this.f19732b = f10;
        this.f19733c = runnable;
    }
}
