package oh;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.u00;
import org.telegram.ui.mf1;
public final class z4 extends ax0 {
    public final int H = 0;
    public final Object I;

    public z4(jk jkVar, Context context, u00 u00Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, u00Var, 1, g6Var);
        this.I = jkVar;
    }

    @Override
    public void e(boolean z4, boolean z10) {
        switch (this.H) {
            case 2:
                mf1 mf1Var = (mf1) this.I;
                super.e(z4, z10);
                float f10 = 1.0f;
                if (z10) {
                    ViewPropertyAnimator animate = mf1Var.f39129n.f35795a.animate();
                    if (z4) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                mf1Var.f39129n.f35795a.animate().cancel();
                TextView textView = mf1Var.f39129n.f35795a;
                if (z4) {
                    f10 = 0.0f;
                }
                textView.setAlpha(f10);
                return;
            default:
                super.e(z4, z10);
                return;
        }
    }

    @Override
    public float getTranslationY() {
        switch (this.H) {
            case 1:
                return super.getTranslationY() - ((jk) this.I).J;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.H) {
            case 0:
                e5 e5Var = ((a5) this.I).d;
                super.onMeasure(i10, org.telegram.ui.b.d(e5Var.f17028e, e5Var.f17030n - e5Var.f17031r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.H) {
            case 1:
                super.setTranslationY(f10 + ((jk) this.I).J);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public z4(int i10, Context context, b bVar, a5 a5Var) {
        super(context, null, i10, bVar);
        this.I = a5Var;
    }

    public z4(mf1 mf1Var, Context context, u00 u00Var) {
        super(context, u00Var, 0, null);
        this.I = mf1Var;
    }
}
