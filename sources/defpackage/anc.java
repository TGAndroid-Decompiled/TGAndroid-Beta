package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class anc extends AnimatorListenerAdapter {
    public final byte a;
    public final cnc b;

    public anc(cnc cncVar, byte b) {
        this.a = b;
        this.b = cncVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        cnc cncVar = this.b;
        switch (b) {
            case 0:
                cncVar.r = 0;
                cncVar.invalidate();
                return;
            default:
                cncVar.s = 0;
                cncVar.invalidate();
                return;
        }
    }
}
