package bi;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.vl;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.eg1;
public final class m6 extends xw0 {
    public final int K = 0;
    public final Object L;

    public m6(ok okVar, Context context, t00 t00Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, t00Var, 1, f6Var);
        this.L = okVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                eg1 eg1Var = (eg1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = eg1Var.f36054n.f41085a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                eg1Var.f36054n.f41085a.animate().cancel();
                TextView textView = eg1Var.f36054n.f41085a;
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
                s6 s6Var = ((n6) this.L).d;
                super.onMeasure(i10, vl.d(s6Var.f3693e, s6Var.f3695n - s6Var.f3696r.getPaddingTop(), 1073741824));
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

    public m6(int i10, Context context, b bVar, n6 n6Var) {
        super(context, null, i10, bVar);
        this.L = n6Var;
    }

    public m6(eg1 eg1Var, Context context, t00 t00Var) {
        super(context, t00Var, 0, null);
        this.L = eg1Var;
    }
}
