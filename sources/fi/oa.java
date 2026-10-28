package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oa extends AnimatorListenerAdapter {
    public final int f11422a;
    public final int f11423b;
    public final int f11424c;
    public final sb d;

    public oa(sb sbVar, int i10, int i11, int i12) {
        this.f11422a = i12;
        this.d = sbVar;
        this.f11423b = i10;
        this.f11424c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11422a) {
            case 0:
                this.d.M(this.f11423b, this.f11424c);
                return;
            default:
                int i10 = this.f11423b;
                int i11 = this.f11424c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
