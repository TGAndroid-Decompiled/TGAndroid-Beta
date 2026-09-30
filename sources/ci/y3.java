package ci;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y3 implements o1.f {
    public final int f5879a = 1;
    public final Runnable f5880b;
    public final float f5881c;
    public final KeyEvent.Callback d;

    public y3(View view, float f7, Runnable runnable) {
        this.f5880b = runnable;
        this.d = view;
        this.f5881c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f5879a) {
            case 0:
                a4 a4Var = (a4) this.d;
                z3 z3Var = a4Var.f4346b;
                if (!z10) {
                    z3Var.setTranslationY(this.f5881c);
                    z3Var.K = false;
                    a4Var.d = null;
                    a4Var.e = null;
                    Runnable runnable = this.f5880b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f5881c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f5880b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public y3(a4 a4Var, float f7, Runnable runnable) {
        this.d = a4Var;
        this.f5881c = f7;
        this.f5880b = runnable;
    }
}
