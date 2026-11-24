package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class am extends AnimatorListenerAdapter {
    public final byte a;
    public final gm b;

    public am(gm gmVar, byte b) {
        this.a = b;
        this.b = gmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gm gmVar = this.b;
        switch (b) {
            case 0:
                gm.access$002(gmVar, null);
                gm.access$102(false);
                return;
            case 1:
                gm.access$002(gmVar, null);
                if (gm.access$200(gmVar) != null) {
                    gm.access$200(gmVar).run();
                    gm.access$202(gmVar, null);
                    return;
                }
                return;
            default:
                gm.access$302(gmVar, null);
                return;
        }
    }
}
