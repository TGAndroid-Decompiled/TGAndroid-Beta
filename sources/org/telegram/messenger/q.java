package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
public final class q implements o1.f {
    public final int f19733a = 0;
    public final float f19734b;
    public final Runnable f19735c;
    public final KeyEvent.Callback d;

    public q(View view, float f10, Runnable runnable) {
        this.f19735c = runnable;
        this.d = view;
        this.f19734b = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f19733a) {
            case 0:
                float f12 = this.f19734b;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f19735c, (View) this.d, f12, hVar, z4, f10, f11);
                return;
            default:
                qh.c3 c3Var = (qh.c3) this.d;
                qh.b3 b3Var = c3Var.f45164b;
                if (!z4) {
                    b3Var.setTranslationY(this.f19734b);
                    b3Var.H = false;
                    c3Var.d = null;
                    c3Var.f45166e = null;
                    Runnable runnable = this.f19735c;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public q(qh.c3 c3Var, float f10, Runnable runnable) {
        this.d = c3Var;
        this.f19734b = f10;
        this.f19735c = runnable;
    }
}
