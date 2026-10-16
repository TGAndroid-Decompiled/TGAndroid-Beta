package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eb extends AnimatorListenerAdapter {
    public final int f3005a;
    public final gb f3006b;

    public eb(gb gbVar, int i10) {
        this.f3005a = i10;
        this.f3006b = gbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3005a) {
            case 0:
                sb sbVar = this.f3006b.I0;
                sbVar.X = 0.0f;
                sb.k(sbVar);
                return;
            default:
                sb sbVar2 = this.f3006b.I0;
                sbVar2.W = 0.0f;
                sbVar2.Z = 0.0f;
                sb.k(sbVar2);
                return;
        }
    }
}
