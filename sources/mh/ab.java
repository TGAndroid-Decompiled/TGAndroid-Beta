package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.j00;
public final class ab extends AnimatorListenerAdapter {
    public final int f13713a;
    public final int f13714b;
    public final float f13715c;
    public final View d;

    public ab(View view, int i10, float f10, int i11) {
        this.f13713a = i11;
        this.d = view;
        this.f13714b = i10;
        this.f13715c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f13713a) {
            case 0:
                bb bbVar = (bb) this.d;
                bbVar.W = this.f13715c;
                if (bbVar.getValue() != this.f13714b) {
                    bbVar.e(bbVar.getValue());
                }
                bbVar.invalidate();
                return;
            case 1:
                j00 j00Var = (j00) this.d;
                int i10 = this.f13714b;
                if (i10 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f13715c;
                }
                j00Var.b(f10, i10 + 1);
                j00Var.f27962y = 0.0f;
                j00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.t1) this.d).c(this.f13714b, this.f13715c, false);
                return;
        }
    }

    public ab(bb bbVar, float f10, int i10) {
        this.f13713a = 0;
        this.d = bbVar;
        this.f13715c = f10;
        this.f13714b = i10;
    }
}
