package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3b extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final p3b c;

    public n3b(p3b p3bVar, boolean z, byte b) {
        this.a = b;
        this.c = p3bVar;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        p3b p3bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    p3bVar.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!z) {
                    p3bVar.y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        p3b p3bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    p3bVar.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (z) {
                    p3bVar.y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
