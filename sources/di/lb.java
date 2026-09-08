package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lb extends AnimatorListenerAdapter {
    public final int f7607a;
    public final int f7608b;
    public final int f7609c;
    public final pc d;

    public lb(pc pcVar, int i10, int i11, int i12) {
        this.f7607a = i12;
        this.d = pcVar;
        this.f7608b = i10;
        this.f7609c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7607a) {
            case 0:
                this.d.N(this.f7608b, this.f7609c);
                return;
            default:
                int i10 = this.f7608b;
                int i11 = this.f7609c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
