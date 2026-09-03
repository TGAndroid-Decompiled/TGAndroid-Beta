package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.i00;
public final class ab extends AnimatorListenerAdapter {
    public final int f12108a;
    public final int f12109b;
    public final float f12110c;
    public final View d;

    public ab(View view, int i10, float f10, int i11) {
        this.f12108a = i11;
        this.d = view;
        this.f12109b = i10;
        this.f12110c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f12108a) {
            case 0:
                bb bbVar = (bb) this.d;
                bbVar.W = this.f12110c;
                if (bbVar.getValue() != this.f12109b) {
                    bbVar.e(bbVar.getValue());
                }
                bbVar.invalidate();
                return;
            case 1:
                i00 i00Var = (i00) this.d;
                int i10 = this.f12109b;
                if (i10 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f12110c;
                }
                i00Var.b(f10, i10 + 1);
                i00Var.f25551y = 0.0f;
                i00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.u1) this.d).c(this.f12109b, this.f12110c, false);
                return;
        }
    }

    public ab(bb bbVar, float f10, int i10) {
        this.f12108a = 0;
        this.d = bbVar;
        this.f12110c = f10;
        this.f12109b = i10;
    }
}
