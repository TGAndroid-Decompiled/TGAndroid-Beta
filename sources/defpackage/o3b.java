package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3b extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final q3b c;

    public o3b(q3b q3bVar, boolean z, byte b) {
        this.a = b;
        this.c = q3bVar;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        q3b q3bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    q3bVar.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!z) {
                    q3bVar.y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        q3b q3bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    q3bVar.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (z) {
                    q3bVar.y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
