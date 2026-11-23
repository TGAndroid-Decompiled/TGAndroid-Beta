package hi;

import android.content.Context;
import android.widget.FrameLayout;
public final class d8 extends m8 {
    public final k8 N;

    public d8(k8 k8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, a8 a8Var) {
        super(context, h6Var, a8Var);
        this.N = k8Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        k8 k8Var = this.N;
        org.telegram.ui.Cells.y3 y3Var = k8Var.E;
        float y10 = getY();
        FrameLayout frameLayout = k8Var.f14933e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        y3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = k8Var.f14933e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        k8 k8Var = this.N;
        org.telegram.ui.Cells.y3 y3Var = k8Var.E;
        float y10 = getY();
        FrameLayout frameLayout = k8Var.f14933e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        y3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = k8Var.f14933e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
