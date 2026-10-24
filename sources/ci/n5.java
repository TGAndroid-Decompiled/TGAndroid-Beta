package ci;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.tl;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.xe1;
public final class n5 extends vx0 {
    public final int K = 0;
    public final Object L;

    public n5(lk lkVar, Context context, z00 z00Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, z00Var, 1, g6Var);
        this.L = lkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                xe1 xe1Var = (xe1) this.L;
                super.e(z10, z11);
                float f7 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = xe1Var.f43573n.f39576a.animate();
                    if (z10) {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                    return;
                }
                xe1Var.f43573n.f39576a.animate().cancel();
                TextView textView = xe1Var.f43573n.f39576a;
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
                return super.getTranslationY() - ((lk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                t5 t5Var = ((o5) this.L).d;
                super.onMeasure(i10, tl.c(t5Var.e, t5Var.f5957n - t5Var.f5958r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f7 + ((lk) this.L).M);
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

    public n5(xe1 xe1Var, Context context, z00 z00Var) {
        super(context, z00Var, 0, null);
        this.L = xe1Var;
    }
}
