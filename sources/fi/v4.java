package fi;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.y91;
public final class v4 extends nv0 {
    public final int L = 0;
    public final Object M;

    public v4(mk mkVar, Context context, yz yzVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, yzVar, 1, h6Var);
        this.M = mkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                y91 y91Var = (y91) this.M;
                super.e(z10, z11);
                float f10 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ((TextView) y91Var.f54104n.d).animate();
                    if (z10) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                ((TextView) y91Var.f54104n.d).animate().cancel();
                TextView textView = (TextView) y91Var.f54104n.d;
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
                return super.getTranslationY() - ((mk) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.L) {
            case 0:
                a5 a5Var = ((w4) this.M).d;
                super.onMeasure(i7, o10.c(a5Var.f11723e, a5Var.f11725n - a5Var.f11726r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f10 + ((mk) this.M).N);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public v4(int i7, Context context, b bVar, w4 w4Var) {
        super(context, null, i7, bVar);
        this.M = w4Var;
    }

    public v4(y91 y91Var, Context context, yz yzVar) {
        super(context, yzVar, 0, null);
        this.M = y91Var;
    }
}
