package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yya extends AnimatorListenerAdapter {
    public final byte a;
    public final zya b;

    public yya(zya zyaVar, byte b) {
        this.a = b;
        this.b = zyaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        zya zyaVar = this.b;
        switch (b) {
            case 0:
                zyaVar.s.setVisibility(8);
                return;
            case 1:
                zyaVar.s.setVisibility(8);
                return;
            default:
                zyaVar.s.setVisibility(8);
                return;
        }
    }
}
