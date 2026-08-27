package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class qa extends AnimatorListenerAdapter {

    public final int f16603a;

    public final int f16604b;

    public final int f16605c;
    public final sb d;

    public qa(sb sbVar, int i10, int i11, int i12) {
        this.f16603a = i12;
        this.d = sbVar;
        this.f16604b = i10;
        this.f16605c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16603a) {
            case 0:
                this.d.N(this.f16604b, this.f16605c);
                break;
            default:
                int i10 = this.f16604b;
                int i11 = this.f16605c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                }
                break;
        }
    }
}
