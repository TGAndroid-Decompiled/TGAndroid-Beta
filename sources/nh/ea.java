package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ea extends AnimatorListenerAdapter {
    public final int f17613a;
    public final int f17614b;
    public final int f17615c;
    public final gb d;

    public ea(gb gbVar, int i10, int i11, int i12) {
        this.f17613a = i12;
        this.d = gbVar;
        this.f17614b = i10;
        this.f17615c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17613a) {
            case 0:
                this.d.N(this.f17614b, this.f17615c);
                return;
            default:
                int i10 = this.f17614b;
                int i11 = this.f17615c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
