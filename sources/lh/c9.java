package lh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class c9 extends n9 {
    public final k9 H;

    public c9(k9 k9Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, z8 z8Var) {
        super(context, c6Var, z8Var);
        this.H = k9Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        k9 k9Var = this.H;
        org.telegram.ui.Cells.s3 s3Var = k9Var.f16259y;
        float y10 = getY();
        FrameLayout frameLayout = k9Var.f16252e;
        s3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (y10 - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout2 = k9Var.f16252e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        k9 k9Var = this.H;
        org.telegram.ui.Cells.s3 s3Var = k9Var.f16259y;
        float y10 = getY();
        FrameLayout frameLayout = k9Var.f16252e;
        s3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (y10 - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout2 = k9Var.f16252e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
