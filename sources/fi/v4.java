package fi;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.y91;
public final class v4 extends kv0 {
    public final int L = 0;
    public final Object M;

    public v4(kk kkVar, Context context, wz wzVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, wzVar, 1, i6Var);
        this.M = kkVar;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                y91 y91Var = (y91) this.M;
                super.e(z10, z11);
                float f10 = 1.0f;
                if (z11) {
                    ViewPropertyAnimator animate = ((TextView) y91Var.f54079n.d).animate();
                    if (z10) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                ((TextView) y91Var.f54079n.d).animate().cancel();
                TextView textView = (TextView) y91Var.f54079n.d;
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
                a5 a5Var = ((w4) this.M).d;
                super.onMeasure(i7, n10.c(a5Var.f11728e, a5Var.f11730n - a5Var.f11731r.getPaddingTop(), 1073741824));
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

    public v4(int i7, Context context, b bVar, w4 w4Var) {
        super(context, null, i7, bVar);
        this.M = w4Var;
    }

    public v4(y91 y91Var, Context context, wz wzVar) {
        super(context, wzVar, 0, null);
        this.M = y91Var;
    }
}
