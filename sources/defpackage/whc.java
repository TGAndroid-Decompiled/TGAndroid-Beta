package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class whc extends AnimatorListenerAdapter {
    public final byte a;
    public final xhc b;

    public whc(xhc xhcVar, byte b) {
        this.a = b;
        this.b = xhcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        xhc xhcVar = this.b;
        switch (b) {
            case 0:
                xhcVar.b.setVisibility(8);
                return;
            default:
                xhcVar.c.setVisibility(8);
                return;
        }
    }
}
