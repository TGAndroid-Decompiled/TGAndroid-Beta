package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t9 extends AnimatorListenerAdapter {
    public final int f12863a;
    public final int f12864b;
    public final int f12865c;
    public final va d;

    public t9(va vaVar, int i7, int i10, int i11) {
        this.f12863a = i11;
        this.d = vaVar;
        this.f12864b = i7;
        this.f12865c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12863a) {
            case 0:
                this.d.M(this.f12864b, this.f12865c);
                return;
            default:
                int i7 = this.f12864b;
                int i10 = this.f12865c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    return;
                }
                return;
        }
    }
}
