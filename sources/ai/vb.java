package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vb extends AnimatorListenerAdapter {
    public final int f1638a;
    public final xb f1639b;

    public vb(xb xbVar, int i10) {
        this.f1638a = i10;
        this.f1639b = xbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1638a) {
            case 0:
                jc jcVar = this.f1639b.I0;
                jcVar.X = 0.0f;
                jc.k(jcVar);
                return;
            default:
                jc jcVar2 = this.f1639b.I0;
                jcVar2.W = 0.0f;
                jcVar2.Z = 0.0f;
                jc.k(jcVar2);
                return;
        }
    }
}
