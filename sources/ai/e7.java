package ai;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.am;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.uk;
import org.telegram.ui.hg1;
public final class e7 extends gy0 {
    public final int K = 0;
    public final Object L;

    public e7(uk ukVar, Context context, m10 m10Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m10Var, 1, c6Var);
        this.L = ukVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                hg1 hg1Var = (hg1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = hg1Var.f38405n.f43931a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                hg1Var.f38405n.f43931a.animate().cancel();
                TextView textView = hg1Var.f38405n.f43931a;
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
                return super.getTranslationY() - ((uk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                l7 l7Var = ((f7) this.L).d;
                super.onMeasure(i10, am.c(l7Var.f1335e, l7Var.f1337n - l7Var.f1338r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f7 + ((uk) this.L).M);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public e7(int i10, d dVar, f7 f7Var, Context context) {
        super(context, null, i10, dVar);
        this.L = f7Var;
    }

    public e7(hg1 hg1Var, Context context, m10 m10Var) {
        super(context, m10Var, 0, null);
        this.L = hg1Var;
    }
}
