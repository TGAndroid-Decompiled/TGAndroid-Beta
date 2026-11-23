package fi;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.w91;
public final class w4 extends mv0 {
    public final int L = 0;
    public final Object M;

    public w4(kk kkVar, Context context, vz vzVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, vzVar, 1, i6Var);
        this.M = kkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                w91 w91Var = (w91) this.M;
                super.e(z10, z11);
                float f10 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ((TextView) w91Var.f53245n.d).animate();
                    if (z10) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                ((TextView) w91Var.f53245n.d).animate().cancel();
                TextView textView = (TextView) w91Var.f53245n.d;
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
                return super.getTranslationY() - ((kk) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.L) {
            case 0:
                b5 b5Var = ((x4) this.M).d;
                super.onMeasure(i7, m10.c(b5Var.f11777e, b5Var.f11779n - b5Var.f11780r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f10 + ((kk) this.M).N);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public w4(int i7, Context context, b bVar, x4 x4Var) {
        super(context, null, i7, bVar);
        this.M = x4Var;
    }

    public w4(w91 w91Var, Context context, vz vzVar) {
        super(context, vzVar, 0, null);
        this.M = w91Var;
    }
}
