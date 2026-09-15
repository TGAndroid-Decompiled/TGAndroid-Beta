package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vb extends AnimatorListenerAdapter {
    public final int f1632a;
    public final xb f1633b;

    public vb(xb xbVar, int i10) {
        this.f1632a = i10;
        this.f1633b = xbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1632a) {
            case 0:
                jc jcVar = this.f1633b.I0;
                jcVar.X = 0.0f;
                jc.k(jcVar);
                return;
            default:
                jc jcVar2 = this.f1633b.I0;
                jcVar2.W = 0.0f;
                jcVar2.Z = 0.0f;
                jc.k(jcVar2);
                return;
        }
    }
}
