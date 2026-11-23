package hi;

import android.content.Context;
import android.widget.FrameLayout;
public final class y8 extends h9 {
    public final f9 N;

    public y8(f9 f9Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, v8 v8Var) {
        super(context, i6Var, v8Var);
        this.N = f9Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        f9 f9Var = this.N;
        org.telegram.ui.Cells.y3 y3Var = f9Var.E;
        float y10 = getY();
        FrameLayout frameLayout = f9Var.f14498e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        y3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = f9Var.f14498e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        f9 f9Var = this.N;
        org.telegram.ui.Cells.y3 y3Var = f9Var.E;
        float y10 = getY();
        FrameLayout frameLayout = f9Var.f14498e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        y3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = f9Var.f14498e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
