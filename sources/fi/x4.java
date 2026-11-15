package fi;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.pz;
import org.telegram.ui.u91;
public final class x4 extends cv0 {
    public final int L = 0;
    public final Object M;

    public x4(dk dkVar, Context context, pz pzVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, pzVar, 1, e6Var);
        this.M = dkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                u91 u91Var = (u91) this.M;
                super.e(z10, z11);
                float f10 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ((TextView) u91Var.f51864n.d).animate();
                    if (z10) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                ((TextView) u91Var.f51864n.d).animate().cancel();
                TextView textView = (TextView) u91Var.f51864n.d;
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
                return super.getTranslationY() - ((dk) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.L) {
            case 0:
                c5 c5Var = ((y4) this.M).d;
                super.onMeasure(i7, i20.c(c5Var.f11600e, c5Var.f11602n - c5Var.f11603r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.L) {
            case 1:
                super.setTranslationY(f10 + ((dk) this.M).N);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public x4(int i7, Context context, b bVar, y4 y4Var) {
        super(context, null, i7, bVar);
        this.M = y4Var;
    }

    public x4(u91 u91Var, Context context, pz pzVar) {
        super(context, pzVar, 0, null);
        this.M = u91Var;
    }
}
