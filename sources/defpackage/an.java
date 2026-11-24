package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class an extends AnimatorListenerAdapter {
    public final byte a;
    public final gn b;

    public an(gn gnVar, byte b) {
        this.a = b;
        this.b = gnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gn gnVar = this.b;
        switch (b) {
            case 0:
                gn.access$002(gnVar, null);
                gn.access$102(false);
                return;
            case 1:
                gn.access$002(gnVar, null);
                if (gn.access$200(gnVar) != null) {
                    gn.access$200(gnVar).run();
                    gn.access$202(gnVar, null);
                    return;
                }
                return;
            default:
                gn.access$302(gnVar, null);
                return;
        }
    }
}
