package ci;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y3 implements o1.f {
    public final int f6334a = 1;
    public final Runnable f6335b;
    public final float f6336c;
    public final KeyEvent.Callback d;

    public y3(View view, float f7, Runnable runnable) {
        this.f6335b = runnable;
        this.d = view;
        this.f6336c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f6334a) {
            case 0:
                a4 a4Var = (a4) this.d;
                z3 z3Var = a4Var.f4692b;
                if (!z10) {
                    z3Var.setTranslationY(this.f6336c);
                    z3Var.K = false;
                    a4Var.d = null;
                    a4Var.f4694e = null;
                    Runnable runnable = this.f6335b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f6336c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f6335b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public y3(a4 a4Var, float f7, Runnable runnable) {
        this.d = a4Var;
        this.f6336c = f7;
        this.f6335b = runnable;
    }
}
