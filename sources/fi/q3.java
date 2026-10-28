package fi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q3 implements o1.f {
    public final int f11480a = 1;
    public final Runnable f11481b;
    public final float f11482c;
    public final KeyEvent.Callback d;

    public q3(View view, float f7, Runnable runnable) {
        this.f11481b = runnable;
        this.d = view;
        this.f11482c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f11480a) {
            case 0:
                s3 s3Var = (s3) this.d;
                r3 r3Var = s3Var.f11580b;
                if (!z10) {
                    r3Var.setTranslationY(this.f11482c);
                    r3Var.K = false;
                    s3Var.d = null;
                    s3Var.e = null;
                    Runnable runnable = this.f11481b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f11482c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f11481b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public q3(s3 s3Var, float f7, Runnable runnable) {
        this.d = s3Var;
        this.f11482c = f7;
        this.f11481b = runnable;
    }
}
