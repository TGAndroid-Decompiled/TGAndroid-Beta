package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pza extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final rza c;

    public pza(rza rzaVar, boolean z, byte b) {
        this.a = b;
        this.c = rzaVar;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rza rzaVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    rzaVar.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!z) {
                    rzaVar.y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        rza rzaVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    rzaVar.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (z) {
                    rzaVar.y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
