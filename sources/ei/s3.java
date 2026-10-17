package ei;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s3 implements o1.f {
    public final int f9783a = 1;
    public final Runnable f9784b;
    public final float f9785c;
    public final KeyEvent.Callback d;

    public s3(View view, float f7, Runnable runnable) {
        this.f9784b = runnable;
        this.d = view;
        this.f9785c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f9783a) {
            case 0:
                u3 u3Var = (u3) this.d;
                t3 t3Var = u3Var.f9886b;
                if (!z10) {
                    t3Var.setTranslationY(this.f9785c);
                    t3Var.K = false;
                    u3Var.d = null;
                    u3Var.e = null;
                    Runnable runnable = this.f9784b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f9785c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f9784b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public s3(u3 u3Var, float f7, Runnable runnable) {
        this.d = u3Var;
        this.f9785c = f7;
        this.f9784b = runnable;
    }
}
