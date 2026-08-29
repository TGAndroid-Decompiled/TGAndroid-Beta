package lh;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.ze1;
public final class x4 extends qw0 {
    public final int G = 0;
    public final Object H;

    public x4(jk jkVar, Context context, p00 p00Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, p00Var, 1, c6Var);
        this.H = jkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.G) {
            case 2:
                ze1 ze1Var = (ze1) this.H;
                super.e(z10, z11);
                float f9 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ze1Var.f45181n.f41104a.animate();
                    if (z10) {
                        f9 = 0.0f;
                    }
                    animate.alpha(f9).start();
                    return;
                }
                ze1Var.f45181n.f41104a.animate().cancel();
                TextView textView = ze1Var.f45181n.f41104a;
                if (z10) {
                    f9 = 0.0f;
                }
                textView.setAlpha(f9);
                return;
            default:
                super.e(z10, z11);
                return;
        }
    }

    @Override
    public float getTranslationY() {
        switch (this.G) {
            case 1:
                return super.getTranslationY() - ((jk) this.H).I;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
                c5 c5Var = ((y4) this.H).d;
                super.onMeasure(i10, org.telegram.ui.b.d(c5Var.f15435e, c5Var.f15437n - c5Var.f15438r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.G) {
            case 1:
                super.setTranslationY(f9 + ((jk) this.H).I);
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    public x4(int i10, Context context, b bVar, y4 y4Var) {
        super(context, null, i10, bVar);
        this.H = y4Var;
    }

    public x4(ze1 ze1Var, Context context, p00 p00Var) {
        super(context, p00Var, 0, null);
        this.H = ze1Var;
    }
}
