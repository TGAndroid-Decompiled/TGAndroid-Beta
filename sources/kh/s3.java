package kh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s3 implements o1.f {
    public final int f16026a = 1;
    public final Runnable f16027b;
    public final float f16028c;
    public final KeyEvent.Callback d;

    public s3(View view, float f10, Runnable runnable) {
        this.f16027b = runnable;
        this.d = view;
        this.f16028c = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f16026a) {
            case 0:
                u3 u3Var = (u3) this.d;
                t3 t3Var = u3Var.f16138b;
                if (!z10) {
                    t3Var.setTranslationY(this.f16028c);
                    t3Var.G = false;
                    u3Var.d = null;
                    u3Var.f16140e = null;
                    Runnable runnable = this.f16027b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f12 = this.f16028c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f16027b, (View) this.d, f12, hVar, z10, f10, f11);
                return;
        }
    }

    public s3(u3 u3Var, float f10, Runnable runnable) {
        this.d = u3Var;
        this.f16028c = f10;
        this.f16027b = runnable;
    }
}
