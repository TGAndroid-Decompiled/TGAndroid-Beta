package ci;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z3 implements o1.f {
    public final int f5864a = 1;
    public final Runnable f5865b;
    public final float f5866c;
    public final KeyEvent.Callback d;

    public z3(View view, float f7, Runnable runnable) {
        this.f5865b = runnable;
        this.d = view;
        this.f5866c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f5864a) {
            case 0:
                b4 b4Var = (b4) this.d;
                a4 a4Var = b4Var.f4389b;
                if (!z10) {
                    a4Var.setTranslationY(this.f5866c);
                    a4Var.K = false;
                    b4Var.d = null;
                    b4Var.e = null;
                    Runnable runnable = this.f5865b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f5866c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f5865b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public z3(b4 b4Var, float f7, Runnable runnable) {
        this.d = b4Var;
        this.f5866c = f7;
        this.f5865b = runnable;
    }
}
