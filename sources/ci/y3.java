package ci;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y3 implements o1.f {
    public final int f6333a = 1;
    public final Runnable f6334b;
    public final float f6335c;
    public final KeyEvent.Callback d;

    public y3(View view, float f7, Runnable runnable) {
        this.f6334b = runnable;
        this.d = view;
        this.f6335c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f6333a) {
            case 0:
                a4 a4Var = (a4) this.d;
                z3 z3Var = a4Var.f4691b;
                if (!z10) {
                    z3Var.setTranslationY(this.f6335c);
                    z3Var.K = false;
                    a4Var.d = null;
                    a4Var.f4693e = null;
                    Runnable runnable = this.f6334b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f6335c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f6334b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public y3(a4 a4Var, float f7, Runnable runnable) {
        this.d = a4Var;
        this.f6335c = f7;
        this.f6334b = runnable;
    }
}
