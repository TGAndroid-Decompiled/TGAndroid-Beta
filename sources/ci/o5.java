package ci;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.re1;
public final class o5 extends sx0 {
    public final int K = 0;
    public final Object L;

    public o5(nk nkVar, Context context, b10 b10Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, b10Var, 1, d6Var);
        this.L = nkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                re1 re1Var = (re1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = re1Var.f41170n.f37580a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                re1Var.f41170n.f37580a.animate().cancel();
                TextView textView = re1Var.f41170n.f37580a;
                if (z10) {
                    f7 = 0.0f;
                }
                textView.setAlpha(f7);
                return;
            default:
                super.e(z10, z11);
                return;
        }
    }

    @Override
    public float getTranslationY() {
        switch (this.K) {
            case 1:
                return super.getTranslationY() - ((nk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                u5 u5Var = ((p5) this.L).d;
                super.onMeasure(i10, kk.c(u5Var.e, u5Var.f6050n - u5Var.f6051r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.K) {
            case 1:
                super.setTranslationY(f7 + ((nk) this.L).M);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public o5(int i10, Context context, b bVar, p5 p5Var) {
        super(context, null, i10, bVar);
        this.L = p5Var;
    }

    public o5(re1 re1Var, Context context, b10 b10Var) {
        super(context, b10Var, 0, null);
        this.L = re1Var;
    }
}
