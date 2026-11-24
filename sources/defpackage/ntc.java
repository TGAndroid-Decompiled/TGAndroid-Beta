package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ntc extends AnimatorListenerAdapter {
    public final byte a;
    public final otc b;

    public ntc(otc otcVar, byte b) {
        this.a = b;
        this.b = otcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        otc otcVar = this.b;
        switch (b) {
            case 0:
                otcVar.E = null;
                return;
            default:
                otcVar.E = null;
                return;
        }
    }
}
