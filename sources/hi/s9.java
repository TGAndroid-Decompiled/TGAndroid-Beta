package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s9 extends AnimatorListenerAdapter {
    public final int f15391a;
    public final int f15392b;
    public final int f15393c;
    public final ta d;

    public s9(ta taVar, int i7, int i10, int i11) {
        this.f15391a = i11;
        this.d = taVar;
        this.f15392b = i7;
        this.f15393c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15391a) {
            case 0:
                this.d.M(this.f15392b, this.f15393c);
                return;
            default:
                int i7 = this.f15392b;
                int i10 = this.f15393c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    return;
                }
                return;
        }
    }
}
