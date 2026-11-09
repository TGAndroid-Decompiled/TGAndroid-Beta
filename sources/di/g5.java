package di;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.vj;
import org.telegram.ui.y91;
public final class g5 extends cv0 {
    public final int K = 0;
    public final Object L;

    public g5(vj vjVar, Context context, mz mzVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, mzVar, 1, g6Var);
        this.L = vjVar;
    }

    @Override
    public void e(boolean z9, boolean z10) {
        switch (this.K) {
            case 2:
                y91 y91Var = (y91) this.L;
                super.e(z9, z10);
                float f10 = 1.0f;
                if (z10) {
                    ViewPropertyAnimator animate = ((TextView) y91Var.f52042n.d).animate();
                    if (z9) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                ((TextView) y91Var.f52042n.d).animate().cancel();
                TextView textView = (TextView) y91Var.f52042n.d;
                if (z9) {
                    f10 = 0.0f;
                }
                textView.setAlpha(f10);
                return;
            default:
                super.e(z9, z10);
                return;
        }
    }

    @Override
    public float getTranslationY() {
        switch (this.K) {
            case 1:
                return super.getTranslationY() - ((vj) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.K) {
            case 0:
                l5 l5Var = ((h5) this.L).d;
                super.onMeasure(i7, org.telegram.messenger.camera.q.c(l5Var.f9326e, l5Var.f9328n - l5Var.f9329r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.K) {
            case 1:
                super.setTranslationY(f10 + ((vj) this.L).M);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public g5(int i7, Context context, b bVar, h5 h5Var) {
        super(context, null, i7, bVar);
        this.L = h5Var;
    }

    public g5(y91 y91Var, Context context, mz mzVar) {
        super(context, mzVar, 0, null);
        this.L = y91Var;
    }
}
