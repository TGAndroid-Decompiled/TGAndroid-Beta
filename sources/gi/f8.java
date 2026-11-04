package gi;

import android.content.Context;
import android.widget.FrameLayout;
public final class f8 extends q8 {
    public final o8 N;

    public f8(o8 o8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, c8 c8Var) {
        super(context, e6Var, c8Var);
        this.N = o8Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        o8 o8Var = this.N;
        org.telegram.ui.Cells.x3 x3Var = o8Var.E;
        float y9 = getY();
        FrameLayout frameLayout = o8Var.f13343e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        x3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (y9 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = o8Var.f13343e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        o8 o8Var = this.N;
        org.telegram.ui.Cells.x3 x3Var = o8Var.E;
        float y9 = getY();
        FrameLayout frameLayout = o8Var.f13343e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        x3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (y9 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = o8Var.f13343e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
