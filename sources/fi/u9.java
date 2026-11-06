package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u9 extends AnimatorListenerAdapter {
    public final int f12898a;
    public final int f12899b;
    public final int f12900c;
    public final va d;

    public u9(va vaVar, int i7, int i10, int i11) {
        this.f12898a = i11;
        this.d = vaVar;
        this.f12899b = i7;
        this.f12900c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12898a) {
            case 0:
                this.d.M(this.f12899b, this.f12900c);
                return;
            default:
                int i7 = this.f12899b;
                int i10 = this.f12900c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    return;
                }
                return;
        }
    }
}
