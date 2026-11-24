package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uub extends AnimatorListenerAdapter {
    public final byte a;
    public final vub b;

    public uub(vub vubVar, byte b) {
        this.a = b;
        this.b = vubVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        vub vubVar = this.b;
        switch (b) {
            case 0:
                vubVar.b.s.setVisibility(8);
                return;
            default:
                vubVar.b.a.setVisibility(8);
                return;
        }
    }
}
