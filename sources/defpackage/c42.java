package defpackage;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class c42 extends a1b {
    public final byte L = 1;
    public final Object M;

    public c42(sxb sxbVar, Context context, tk4 tk4Var) {
        super(context, tk4Var, 0, null);
        this.M = sxbVar;
    }

    @Override
    public final void e(boolean z, boolean z2) {
        switch (this.L) {
            case 2:
                super.e(z, z2);
                sxb sxbVar = (sxb) this.M;
                uvb uvbVar = sxbVar.n;
                float f = 1.0f;
                if (z2) {
                    ViewPropertyAnimator animate = ((TextView) uvbVar.d).animate();
                    if (z) {
                        f = 0.0f;
                    }
                    animate.alpha(f).start();
                    return;
                }
                ((TextView) uvbVar.d).animate().cancel();
                TextView textView = (TextView) sxbVar.n.d;
                if (z) {
                    f = 0.0f;
                }
                textView.setAlpha(f);
                return;
            default:
                super.e(z, z2);
                return;
        }
    }

    @Override
    public final float getTranslationY() {
        switch (this.L) {
            case 0:
                return super.getTranslationY() - ((p42) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.L) {
            case 1:
                i2a i2aVar = ((e2a) this.M).d;
                super.onMeasure(i, wi8.f(i2aVar.e, i2aVar.n - i2aVar.r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.L) {
            case 0:
                super.setTranslationY(f + ((p42) this.M).N);
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public c42(int i, r63 r63Var, e2a e2aVar, Context context) {
        super(context, null, i, r63Var);
        this.M = e2aVar;
    }

    public c42(p42 p42Var, Context context, tk4 tk4Var, ylb ylbVar) {
        super(context, tk4Var, 1, ylbVar);
        this.M = p42Var;
    }
}
