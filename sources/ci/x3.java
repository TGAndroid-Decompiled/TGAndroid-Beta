package ci;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x3 implements o1.f {
    public final int f6292a = 1;
    public final Runnable f6293b;
    public final float f6294c;
    public final KeyEvent.Callback d;

    public x3(View view, float f7, Runnable runnable) {
        this.f6293b = runnable;
        this.d = view;
        this.f6294c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f6292a) {
            case 0:
                z3 z3Var = (z3) this.d;
                y3 y3Var = z3Var.f6414b;
                if (!z10) {
                    y3Var.setTranslationY(this.f6294c);
                    y3Var.K = false;
                    z3Var.d = null;
                    z3Var.f6416e = null;
                    Runnable runnable = this.f6293b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f6294c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f6293b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public x3(z3 z3Var, float f7, Runnable runnable) {
        this.d = z3Var;
        this.f6294c = f7;
        this.f6293b = runnable;
    }
}
