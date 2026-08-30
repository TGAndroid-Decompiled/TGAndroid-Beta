package nh;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.kf1;
public final class y4 extends zw0 {
    public final int H = 0;
    public final Object I;

    public y4(hk hkVar, Context context, t00 t00Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, t00Var, 1, f6Var);
        this.I = hkVar;
    }

    @Override
    public void e(boolean z4, boolean z10) {
        switch (this.H) {
            case 2:
                kf1 kf1Var = (kf1) this.I;
                super.e(z4, z10);
                float f10 = 1.0f;
                if (z10) {
                    ViewPropertyAnimator animate = kf1Var.f35694n.f32575a.animate();
                    if (z4) {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                    return;
                }
                kf1Var.f35694n.f32575a.animate().cancel();
                TextView textView = kf1Var.f35694n.f32575a;
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
                return super.getTranslationY() - ((hk) this.I).J;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.H) {
            case 0:
                d5 d5Var = ((z4) this.I).d;
                super.onMeasure(i10, org.telegram.ui.b.d(d5Var.e, d5Var.f15269n - d5Var.f15270r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f10 + ((hk) this.I).J);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public y4(int i10, Context context, b bVar, z4 z4Var) {
        super(context, null, i10, bVar);
        this.I = z4Var;
    }

    public y4(kf1 kf1Var, Context context, t00 t00Var) {
        super(context, t00Var, 0, null);
        this.I = kf1Var;
    }
}
