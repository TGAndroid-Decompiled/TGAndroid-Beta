package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.j00;
public final class ab extends AnimatorListenerAdapter {
    public final int f13715a;
    public final int f13716b;
    public final float f13717c;
    public final View d;

    public ab(View view, int i10, float f10, int i11) {
        this.f13715a = i11;
        this.d = view;
        this.f13716b = i10;
        this.f13717c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f13715a) {
            case 0:
                bb bbVar = (bb) this.d;
                bbVar.W = this.f13717c;
                if (bbVar.getValue() != this.f13716b) {
                    bbVar.e(bbVar.getValue());
                }
                bbVar.invalidate();
                return;
            case 1:
                j00 j00Var = (j00) this.d;
                int i10 = this.f13716b;
                if (i10 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f13717c;
                }
                j00Var.b(f10, i10 + 1);
                j00Var.f27948y = 0.0f;
                j00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.t1) this.d).c(this.f13716b, this.f13717c, false);
                return;
        }
    }

    public ab(bb bbVar, float f10, int i10) {
        this.f13715a = 0;
        this.d = bbVar;
        this.f13717c = f10;
        this.f13716b = i10;
    }
}
