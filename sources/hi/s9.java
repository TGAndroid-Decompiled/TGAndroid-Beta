package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s9 extends AnimatorListenerAdapter {
    public final int f15388a;
    public final int f15389b;
    public final int f15390c;
    public final ta d;

    public s9(ta taVar, int i7, int i10, int i11) {
        this.f15388a = i11;
        this.d = taVar;
        this.f15389b = i7;
        this.f15390c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15388a) {
            case 0:
                this.d.M(this.f15389b, this.f15390c);
                return;
            default:
                int i7 = this.f15389b;
                int i10 = this.f15390c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    return;
                }
                return;
        }
    }
}
