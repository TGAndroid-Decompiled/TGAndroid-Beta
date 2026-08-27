package lh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class r3 implements o1.f {

    public final int f16643a = 1;

    public final Runnable f16644b;

    public final float f16645c;
    public final KeyEvent.Callback d;

    public r3(View view, float f10, Runnable runnable) {
        this.f16644b = runnable;
        this.d = view;
        this.f16645c = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f16643a) {
            case 0:
                t3 t3Var = (t3) this.d;
                s3 s3Var = t3Var.f16844b;
                if (!z10) {
                    s3Var.setTranslationY(this.f16645c);
                    s3Var.G = false;
                    t3Var.d = null;
                    t3Var.f16846e = null;
                    Runnable runnable = this.f16644b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    break;
                }
                break;
            default:
                AndroidUtilities.lambda$shakeViewSpring$14(this.f16644b, (View) this.d, this.f16645c, hVar, z10, f10, f11);
                break;
        }
    }

    public r3(t3 t3Var, float f10, Runnable runnable) {
        this.d = t3Var;
        this.f16645c = f10;
        this.f16644b = runnable;
    }
}
