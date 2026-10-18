package ei;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s3 implements o1.f {
    public final int f9785a = 1;
    public final Runnable f9786b;
    public final float f9787c;
    public final KeyEvent.Callback d;

    public s3(View view, float f7, Runnable runnable) {
        this.f9786b = runnable;
        this.d = view;
        this.f9787c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f9785a) {
            case 0:
                u3 u3Var = (u3) this.d;
                t3 t3Var = u3Var.f9888b;
                if (!z10) {
                    t3Var.setTranslationY(this.f9787c);
                    t3Var.K = false;
                    u3Var.d = null;
                    u3Var.e = null;
                    Runnable runnable = this.f9786b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f9787c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f9786b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public s3(u3 u3Var, float f7, Runnable runnable) {
        this.d = u3Var;
        this.f9787c = f7;
        this.f9786b = runnable;
    }
}
