package hi;

import android.content.Context;
import android.widget.FrameLayout;
public final class e8 extends n8 {
    public final l8 N;

    public e8(l8 l8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, b8 b8Var) {
        super(context, i6Var, b8Var);
        this.N = l8Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        l8 l8Var = this.N;
        org.telegram.ui.Cells.x3 x3Var = l8Var.E;
        float y10 = getY();
        FrameLayout frameLayout = l8Var.f14958e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        x3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = l8Var.f14958e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        l8 l8Var = this.N;
        org.telegram.ui.Cells.x3 x3Var = l8Var.E;
        float y10 = getY();
        FrameLayout frameLayout = l8Var.f14958e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        x3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = l8Var.f14958e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
