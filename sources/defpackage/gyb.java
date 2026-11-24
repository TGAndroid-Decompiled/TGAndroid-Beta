package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gyb extends AnimatorListenerAdapter {
    public final byte a;
    public final oyb b;

    public gyb(oyb oybVar, byte b) {
        this.a = b;
        this.b = oybVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        oyb oybVar = this.b;
        switch (b) {
            case 0:
                if (oybVar.b0 == animator) {
                    oybVar.b0 = null;
                    return;
                }
                return;
            case 1:
                if (oybVar.k0 == animator) {
                    oybVar.k0 = null;
                }
                oybVar.b(1.0f);
                return;
            default:
                if (oybVar.K == animator) {
                    oybVar.K = null;
                    return;
                }
                return;
        }
    }
}
