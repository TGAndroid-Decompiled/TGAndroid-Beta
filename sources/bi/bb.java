package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bb extends AnimatorListenerAdapter {
    public final int f2806a;
    public final db f2807b;

    public bb(db dbVar, int i10) {
        this.f2806a = i10;
        this.f2807b = dbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2806a) {
            case 0:
                pb pbVar = this.f2807b.I0;
                pbVar.X = 0.0f;
                pb.k(pbVar);
                return;
            default:
                pb pbVar2 = this.f2807b.I0;
                pbVar2.W = 0.0f;
                pbVar2.Z = 0.0f;
                pb.k(pbVar2);
                return;
        }
    }
}
