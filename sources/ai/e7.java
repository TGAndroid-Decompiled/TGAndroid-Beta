package ai;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.ai;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.sk;
import org.telegram.ui.eg1;
public final class e7 extends by0 {
    public final int K = 0;
    public final Object L;

    public e7(sk skVar, Context context, k10 k10Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, k10Var, 1, d6Var);
        this.L = skVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                eg1 eg1Var = (eg1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = eg1Var.f37374n.f42580a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                eg1Var.f37374n.f42580a.animate().cancel();
                TextView textView = eg1Var.f37374n.f42580a;
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
                return super.getTranslationY() - ((sk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                l7 l7Var = ((f7) this.L).d;
                super.onMeasure(i10, ai.c(l7Var.f1337e, l7Var.f1339n - l7Var.f1340r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f7 + ((sk) this.L).M);
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

    public e7(eg1 eg1Var, Context context, k10 k10Var) {
        super(context, k10Var, 0, null);
        this.L = eg1Var;
    }
}
