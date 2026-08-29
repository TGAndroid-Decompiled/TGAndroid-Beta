package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.d00;
public final class za extends AnimatorListenerAdapter {
    public final int f13191a;
    public final int f13192b;
    public final float f13193c;
    public final View d;

    public za(View view, int i10, float f9, int i11) {
        this.f13191a = i11;
        this.d = view;
        this.f13192b = i10;
        this.f13193c = f9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        switch (this.f13191a) {
            case 0:
                ab abVar = (ab) this.d;
                abVar.V = this.f13193c;
                if (abVar.getValue() != this.f13192b) {
                    abVar.e(abVar.getValue());
                }
                abVar.invalidate();
                return;
            case 1:
                d00 d00Var = (d00) this.d;
                int i10 = this.f13192b;
                if (i10 == 5) {
                    f9 = 0.0f;
                } else {
                    f9 = -this.f13193c;
                }
                d00Var.b(f9, i10 + 1);
                d00Var.f27625y = 0.0f;
                d00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.r1) this.d).c(this.f13192b, this.f13193c, false);
                return;
        }
    }

    public za(ab abVar, float f9, int i10) {
        this.f13191a = 0;
        this.d = abVar;
        this.f13193c = f9;
        this.f13192b = i10;
    }
}
