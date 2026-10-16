package bi;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.kg1;
public final class p6 extends wx0 {
    public final int K = 0;
    public final Object L;

    public p6(pk pkVar, Context context, f10 f10Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, f10Var, 1, c6Var);
        this.L = pkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                kg1 kg1Var = (kg1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = kg1Var.f37408n.f33899a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                kg1Var.f37408n.f33899a.animate().cancel();
                TextView textView = kg1Var.f37408n.f33899a;
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
                return super.getTranslationY() - ((pk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                w6 w6Var = ((q6) this.L).d;
                super.onMeasure(i10, sk.c(w6Var.e, w6Var.f3908n - w6Var.f3909r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f7 + ((pk) this.L).M);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public p6(int i10, Context context, b bVar, q6 q6Var) {
        super(context, null, i10, bVar);
        this.L = q6Var;
    }

    public p6(kg1 kg1Var, Context context, f10 f10Var) {
        super(context, f10Var, 0, null);
        this.L = kg1Var;
    }
}
