package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y7b extends AnimatorListenerAdapter {
    public final byte a;
    public final a8b b;

    public y7b(a8b a8bVar, byte b) {
        this.a = b;
        this.b = a8bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a8b a8bVar = this.b;
        switch (b) {
            case 0:
                m8b m8bVar = a8bVar.y0;
                m8bVar.Y = 0.0f;
                m8bVar.V();
                return;
            default:
                m8b m8bVar2 = a8bVar.y0;
                m8bVar2.X = 0.0f;
                m8bVar2.a0 = 0.0f;
                m8bVar2.V();
                return;
        }
    }
}
