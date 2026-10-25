package fi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q3 implements o1.f {
    public final int f11481a = 1;
    public final Runnable f11482b;
    public final float f11483c;
    public final KeyEvent.Callback d;

    public q3(View view, float f7, Runnable runnable) {
        this.f11482b = runnable;
        this.d = view;
        this.f11483c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f11481a) {
            case 0:
                s3 s3Var = (s3) this.d;
                r3 r3Var = s3Var.f11581b;
                if (!z10) {
                    r3Var.setTranslationY(this.f11483c);
                    r3Var.K = false;
                    s3Var.d = null;
                    s3Var.e = null;
                    Runnable runnable = this.f11482b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f11483c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f11482b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public q3(s3 s3Var, float f7, Runnable runnable) {
        this.d = s3Var;
        this.f11483c = f7;
        this.f11482b = runnable;
    }
}
