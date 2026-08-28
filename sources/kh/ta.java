package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ta extends AnimatorListenerAdapter {
    public final int f16107a;
    public final int f16108b;
    public final int f16109c;
    public final wb d;

    public ta(wb wbVar, int i9, int i10, int i11) {
        this.f16107a = i11;
        this.d = wbVar;
        this.f16108b = i9;
        this.f16109c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16107a) {
            case 0:
                this.d.N(this.f16108b, this.f16109c);
                return;
            default:
                int i9 = this.f16108b;
                int i10 = this.f16109c;
                if (i9 != i10) {
                    this.d.Q(i9, i10);
                    return;
                }
                return;
        }
    }
}
