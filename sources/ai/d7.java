package ai;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.t00;
import org.telegram.ui.dg1;
public final class d7 extends kx0 {
    public final int K = 0;
    public final Object L;

    public d7(ok okVar, Context context, t00 t00Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, t00Var, 1, e6Var);
        this.L = okVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                dg1 dg1Var = (dg1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = dg1Var.f32998n.f37715a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                dg1Var.f32998n.f37715a.animate().cancel();
                TextView textView = dg1Var.f32998n.f37715a;
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
                return super.getTranslationY() - ((ok) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                j7 j7Var = ((e7) this.L).d;
                super.onMeasure(i10, wh.y(j7Var.e, j7Var.f1051n - j7Var.f1052r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f7 + ((ok) this.L).M);
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

    public d7(dg1 dg1Var, Context context, t00 t00Var) {
        super(context, t00Var, 0, null);
        this.L = dg1Var;
    }
}
