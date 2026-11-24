package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f8b extends AnimatorListenerAdapter {
    public final byte a;
    public final v7b b;

    public f8b(v7b v7bVar, byte b) {
        this.a = b;
        this.b = v7bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v7b v7bVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                m8b m8bVar = v7bVar.b;
                k2b k2bVar = m8bVar.u1;
                if (k2bVar != null) {
                    k2bVar.b();
                    m8bVar.w.removeView(m8bVar.u1);
                }
                m8bVar.u1 = null;
                m8bVar.U();
                return;
            default:
                super.onAnimationEnd(animator);
                k2b k2bVar2 = v7bVar.b.u1;
                if (k2bVar2 != null) {
                    k2bVar2.a(true);
                    return;
                }
                return;
        }
    }
}
