package di;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.af1;
public final class n5 extends ey0 {
    public final int K = 0;
    public final Object L;

    public n5(nk nkVar, Context context, c10 c10Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, c10Var, 1, u6Var);
        this.L = nkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                af1 af1Var = (af1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = af1Var.f37759n.f42820a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                af1Var.f37759n.f42820a.animate().cancel();
                TextView textView = af1Var.f37759n.f42820a;
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
                super.onMeasure(i10, vh.x(t5Var.e, t5Var.f9195n - t5Var.f9196r.getPaddingTop(), 1073741824));
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

    public n5(af1 af1Var, Context context, c10 c10Var) {
        super(context, c10Var, 0, null);
        this.L = af1Var;
    }
}
