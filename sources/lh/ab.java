package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.h00;
public final class ab extends AnimatorListenerAdapter {
    public final int f12124a;
    public final int f12125b;
    public final float f12126c;
    public final View d;

    public ab(View view, int i10, float f10, int i11) {
        this.f12124a = i11;
        this.d = view;
        this.f12125b = i10;
        this.f12126c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f12124a) {
            case 0:
                bb bbVar = (bb) this.d;
                bbVar.W = this.f12126c;
                if (bbVar.getValue() != this.f12125b) {
                    bbVar.e(bbVar.getValue());
                }
                bbVar.invalidate();
                return;
            case 1:
                h00 h00Var = (h00) this.d;
                int i10 = this.f12125b;
                if (i10 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f12126c;
                }
                h00Var.b(f10, i10 + 1);
                h00Var.f25303y = 0.0f;
                h00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.s1) this.d).c(this.f12125b, this.f12126c, false);
                return;
        }
    }

    public ab(bb bbVar, float f10, int i10) {
        this.f12124a = 0;
        this.d = bbVar;
        this.f12126c = f10;
        this.f12125b = i10;
    }
}
