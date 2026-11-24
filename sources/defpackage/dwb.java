package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dwb extends AnimatorListenerAdapter {
    public final byte a;
    public final lwb b;

    public dwb(lwb lwbVar, byte b) {
        this.a = b;
        this.b = lwbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        lwb lwbVar = this.b;
        switch (b) {
            case 0:
                if (lwbVar.b0 == animator) {
                    lwbVar.b0 = null;
                    return;
                }
                return;
            case 1:
                if (lwbVar.k0 == animator) {
                    lwbVar.k0 = null;
                }
                lwbVar.b(1.0f);
                return;
            default:
                if (lwbVar.K == animator) {
                    lwbVar.K = null;
                    return;
                }
                return;
        }
    }
}
