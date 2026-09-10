package bi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r4 implements o1.f {
    public final int f3494a = 1;
    public final Runnable f3495b;
    public final float f3496c;
    public final KeyEvent.Callback d;

    public r4(View view, float f7, Runnable runnable) {
        this.f3495b = runnable;
        this.d = view;
        this.f3496c = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f3494a) {
            case 0:
                t4 t4Var = (t4) this.d;
                s4 s4Var = t4Var.f3674b;
                if (!z10) {
                    s4Var.setTranslationY(this.f3496c);
                    s4Var.K = false;
                    t4Var.d = null;
                    t4Var.e = null;
                    Runnable runnable = this.f3495b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f3496c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f3495b, (View) this.d, f11, hVar, z10, f7, f10);
                return;
        }
    }

    public r4(t4 t4Var, float f7, Runnable runnable) {
        this.d = t4Var;
        this.f3496c = f7;
        this.f3495b = runnable;
    }
}
