package di;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z3 implements o1.f {
    public final int f8514a = 1;
    public final Runnable f8515b;
    public final float f8516c;
    public final KeyEvent.Callback d;

    public z3(View view, float f7, Runnable runnable) {
        this.f8515b = runnable;
        this.d = view;
        this.f8516c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f8514a) {
            case 0:
                b4 b4Var = (b4) this.d;
                a4 a4Var = b4Var.f6942b;
                if (!z10) {
                    a4Var.setTranslationY(this.f8516c);
                    a4Var.K = false;
                    b4Var.d = null;
                    b4Var.f6944e = null;
                    Runnable runnable = this.f8515b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f8516c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f8515b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public z3(b4 b4Var, float f7, Runnable runnable) {
        this.d = b4Var;
        this.f8516c = f7;
        this.f8515b = runnable;
    }
}
