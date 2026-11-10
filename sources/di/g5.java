package di;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.uj;
import org.telegram.ui.z91;
public final class g5 extends bv0 {
    public final int K = 0;
    public final Object L;

    public g5(uj ujVar, Context context, lz lzVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, lzVar, 1, h6Var);
        this.L = ujVar;
    }

    @Override
    public void e(boolean z9, boolean z10) {
        switch (this.K) {
            case 2:
                z91 z91Var = (z91) this.L;
                super.e(z9, z10);
                float f10 = 1.0f;
                if (z10) {
                    ViewPropertyAnimator animate = ((TextView) z91Var.f52372n.d).animate();
                    if (z9) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                ((TextView) z91Var.f52372n.d).animate().cancel();
                TextView textView = (TextView) z91Var.f52372n.d;
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
                return super.getTranslationY() - ((uj) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.K) {
            case 0:
                l5 l5Var = ((h5) this.L).d;
                super.onMeasure(i7, org.telegram.messenger.camera.q.c(l5Var.f9331e, l5Var.f9333n - l5Var.f9334r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f10 + ((uj) this.L).M);
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

    public g5(z91 z91Var, Context context, lz lzVar) {
        super(context, lzVar, 0, null);
        this.L = z91Var;
    }
}
