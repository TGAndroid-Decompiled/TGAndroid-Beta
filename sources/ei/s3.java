package ei;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s3 implements o1.f {
    public final int f9798a = 1;
    public final Runnable f9799b;
    public final float f9800c;
    public final KeyEvent.Callback d;

    public s3(View view, float f7, Runnable runnable) {
        this.f9799b = runnable;
        this.d = view;
        this.f9800c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f9798a) {
            case 0:
                u3 u3Var = (u3) this.d;
                t3 t3Var = u3Var.f9901b;
                if (!z10) {
                    t3Var.setTranslationY(this.f9800c);
                    t3Var.K = false;
                    u3Var.d = null;
                    u3Var.e = null;
                    Runnable runnable = this.f9799b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f9800c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f9799b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public s3(u3 u3Var, float f7, Runnable runnable) {
        this.d = u3Var;
        this.f9800c = f7;
        this.f9799b = runnable;
    }
}
