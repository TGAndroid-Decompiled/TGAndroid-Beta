package ai;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.wf1;
public final class d7 extends ux0 {
    public final int K = 0;
    public final Object L;

    public d7(rk rkVar, Context context, w00 w00Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, w00Var, 1, d6Var);
        this.L = rkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                wf1 wf1Var = (wf1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = wf1Var.f42496n.f38621a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                wf1Var.f42496n.f38621a.animate().cancel();
                TextView textView = wf1Var.f42496n.f38621a;
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
                return super.getTranslationY() - ((rk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                k7 k7Var = ((e7) this.L).d;
                super.onMeasure(i10, bi.c(k7Var.f1218e, k7Var.f1220n - k7Var.f1221r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f7 + ((rk) this.L).M);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public d7(int i10, d dVar, e7 e7Var, Context context) {
        super(context, null, i10, dVar);
        this.L = e7Var;
    }

    public d7(wf1 wf1Var, Context context, w00 w00Var) {
        super(context, w00Var, 0, null);
        this.L = wf1Var;
    }
}
