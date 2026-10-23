package ci;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.sl;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.ye1;
public final class n5 extends wx0 {
    public final int K = 0;
    public final Object L;

    public n5(nk nkVar, Context context, b10 b10Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, b10Var, 1, g6Var);
        this.L = nkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                ye1 ye1Var = (ye1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ye1Var.f43820n.f39858a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                ye1Var.f43820n.f39858a.animate().cancel();
                TextView textView = ye1Var.f43820n.f39858a;
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
                t5 t5Var = ((o5) this.L).d;
                super.onMeasure(i10, sl.c(t5Var.e, t5Var.f5957n - t5Var.f5958r.getPaddingTop(), 1073741824));
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

    public n5(int i10, Context context, b bVar, o5 o5Var) {
        super(context, null, i10, bVar);
        this.L = o5Var;
    }

    public n5(ye1 ye1Var, Context context, b10 b10Var) {
        super(context, b10Var, 0, null);
        this.L = ye1Var;
    }
}
