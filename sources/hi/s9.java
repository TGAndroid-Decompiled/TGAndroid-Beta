package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s9 extends AnimatorListenerAdapter {
    public final int f15338a;
    public final int f15339b;
    public final int f15340c;
    public final ta d;

    public s9(ta taVar, int i7, int i10, int i11) {
        this.f15338a = i11;
        this.d = taVar;
        this.f15339b = i7;
        this.f15340c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15338a) {
            case 0:
                this.d.M(this.f15339b, this.f15340c);
                return;
            default:
                int i7 = this.f15339b;
                int i10 = this.f15340c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    return;
                }
                return;
        }
    }
}
