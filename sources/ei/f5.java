package ei;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.m91;
public final class f5 extends zu0 {
    public final int L = 0;
    public final Object M;

    public f5(uj ujVar, Context context, iz izVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, izVar, 1, e6Var);
        this.M = ujVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                m91 m91Var = (m91) this.M;
                super.e(z10, z11);
                float f10 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ((TextView) m91Var.f47603n.d).animate();
                    if (z10) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                ((TextView) m91Var.f47603n.d).animate().cancel();
                TextView textView = (TextView) m91Var.f47603n.d;
                if (z10) {
                    f10 = 0.0f;
                }
                textView.setAlpha(f10);
                return;
            default:
                super.e(z10, z11);
                return;
        }
    }

    @Override
    public float getTranslationY() {
        switch (this.L) {
            case 1:
                return super.getTranslationY() - ((uj) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.L) {
            case 0:
                k5 k5Var = ((g5) this.M).d;
                super.onMeasure(i3, org.telegram.messenger.camera.q.c(k5Var.f10574e, k5Var.f10576n - k5Var.f10577r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.L) {
            case 1:
                super.setTranslationY(f10 + ((uj) this.M).N);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public f5(int i3, Context context, b bVar, g5 g5Var) {
        super(context, null, i3, bVar);
        this.M = g5Var;
    }

    public f5(m91 m91Var, Context context, iz izVar) {
        super(context, izVar, 0, null);
        this.M = m91Var;
    }
}
