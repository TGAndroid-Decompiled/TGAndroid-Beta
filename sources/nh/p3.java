package nh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p3 implements o1.g {
    public final int f18347a = 1;
    public final Runnable f18348b;
    public final float f18349c;
    public final KeyEvent.Callback d;

    public p3(View view, float f9, Runnable runnable) {
        this.f18348b = runnable;
        this.d = view;
        this.f18349c = f9;
    }

    @Override
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.f18347a) {
            case 0:
                r3 r3Var = (r3) this.d;
                q3 q3Var = r3Var.f18508b;
                if (!z10) {
                    q3Var.setTranslationY(this.f18349c);
                    q3Var.G = false;
                    r3Var.d = null;
                    r3Var.f18510e = null;
                    Runnable runnable = this.f18348b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                float f11 = this.f18349c;
                AndroidUtilities.lambda$shakeViewSpring$14(this.f18348b, (View) this.d, f11, iVar, z10, f9, f10);
                return;
        }
    }

    public p3(r3 r3Var, float f9, Runnable runnable) {
        this.d = r3Var;
        this.f18349c = f9;
        this.f18348b = runnable;
    }
}
