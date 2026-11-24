package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class br1 extends yu1 {
    public final mu1 d;

    public br1(mu1 mu1Var, Context context) {
        super(context);
        this.d = mu1Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        mu1 mu1Var = this.d;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            ar1Var.invalidate();
        }
        if (getVisibility() != 8) {
            mu1Var.z7(true);
            FrameLayout frameLayout = mu1Var.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f);
            }
            mu1Var.G7();
            mu1Var.I7();
            View view = mu1Var.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i) {
        FrameLayout frameLayout;
        super.setVisibility(i);
        if (i == 8 && (frameLayout = this.d.R) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
