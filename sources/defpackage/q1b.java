package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q1b extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final s1b c;

    public q1b(s1b s1bVar, boolean z, byte b) {
        this.a = b;
        this.c = s1bVar;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s1b s1bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    s1bVar.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!z) {
                    s1bVar.y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        s1b s1bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    s1bVar.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (z) {
                    s1bVar.y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
