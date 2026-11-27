package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dmc extends AnimatorListenerAdapter {
    public final byte a;
    public final emc b;

    public dmc(emc emcVar, byte b) {
        this.a = b;
        this.b = emcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        emc emcVar = this.b;
        switch (b) {
            case 0:
                emcVar.b.setVisibility(8);
                return;
            default:
                emcVar.c.setVisibility(8);
                return;
        }
    }
}
