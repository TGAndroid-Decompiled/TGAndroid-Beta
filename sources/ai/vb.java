package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vb extends AnimatorListenerAdapter {
    public final int f1783a;
    public final xb f1784b;

    public vb(xb xbVar, int i10) {
        this.f1783a = i10;
        this.f1784b = xbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1783a) {
            case 0:
                jc jcVar = this.f1784b.I0;
                jcVar.X = 0.0f;
                jc.k(jcVar);
                return;
            default:
                jc jcVar2 = this.f1784b.I0;
                jcVar2.W = 0.0f;
                jcVar2.Z = 0.0f;
                jc.k(jcVar2);
                return;
        }
    }
}
