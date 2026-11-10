package fi;

import android.content.Context;
import android.widget.FrameLayout;
public final class g8 extends p8 {
    public final n8 M;

    public g8(n8 n8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, d8 d8Var) {
        super(context, h6Var, d8Var);
        this.M = n8Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        n8 n8Var = this.M;
        org.telegram.ui.Cells.x3 x3Var = n8Var.D;
        float y10 = getY();
        FrameLayout frameLayout = n8Var.f12492e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        x3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.J) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = n8Var.f12492e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        n8 n8Var = this.M;
        org.telegram.ui.Cells.x3 x3Var = n8Var.D;
        float y10 = getY();
        FrameLayout frameLayout = n8Var.f12492e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        x3Var.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.J) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = n8Var.f12492e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
