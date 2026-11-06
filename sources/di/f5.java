package di;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.vj;
import org.telegram.ui.v91;
public final class f5 extends av0 {
    public final int K = 0;
    public final Object L;

    public f5(vj vjVar, Context context, lz lzVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, lzVar, 1, f6Var);
        this.L = vjVar;
    }

    @Override
    public void e(boolean z9, boolean z10) {
        switch (this.K) {
            case 2:
                v91 v91Var = (v91) this.L;
                super.e(z9, z10);
                float f10 = 1.0f;
                if (z10) {
                    ViewPropertyAnimator animate = ((TextView) v91Var.f50657n.d).animate();
                    if (z9) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                ((TextView) v91Var.f50657n.d).animate().cancel();
                TextView textView = (TextView) v91Var.f50657n.d;
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
                k5 k5Var = ((g5) this.L).d;
                super.onMeasure(i7, org.telegram.messenger.camera.q.c(k5Var.f9302e, k5Var.f9304n - k5Var.f9305r.getPaddingTop(), 1073741824));
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

    public f5(int i7, Context context, b bVar, g5 g5Var) {
        super(context, null, i7, bVar);
        this.L = g5Var;
    }

    public f5(v91 v91Var, Context context, lz lzVar) {
        super(context, lzVar, 0, null);
        this.L = v91Var;
    }
}
