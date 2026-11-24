package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wjc extends AnimatorListenerAdapter {
    public final byte a;
    public final xjc b;

    public wjc(xjc xjcVar, byte b) {
        this.a = b;
        this.b = xjcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        xjc xjcVar = this.b;
        switch (b) {
            case 0:
                xjcVar.b.setVisibility(8);
                return;
            default:
                xjcVar.c.setVisibility(8);
                return;
        }
    }
}
