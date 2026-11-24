package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hab extends AnimatorListenerAdapter {
    public final byte a;
    public final x9b b;

    public hab(x9b x9bVar, byte b) {
        this.a = b;
        this.b = x9bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        x9b x9bVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                oab oabVar = x9bVar.b;
                l4b l4bVar = oabVar.u1;
                if (l4bVar != null) {
                    l4bVar.b();
                    oabVar.w.removeView(oabVar.u1);
                }
                oabVar.u1 = null;
                oabVar.U();
                return;
            default:
                super.onAnimationEnd(animator);
                l4b l4bVar2 = x9bVar.b.u1;
                if (l4bVar2 != null) {
                    l4bVar2.a(true);
                    return;
                }
                return;
        }
    }
}
