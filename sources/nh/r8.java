package nh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r8 extends b9 {
    public final y8 H;

    public r8(y8 y8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, o8 o8Var) {
        super(context, c6Var, o8Var);
        this.H = y8Var;
    }

    @Override
    public final void setContainerHeight(float f9) {
        int paddingTop;
        super.setContainerHeight(f9);
        y8 y8Var = this.H;
        org.telegram.ui.Cells.s3 s3Var = y8Var.f18911y;
        float y8 = getY();
        FrameLayout frameLayout = y8Var.f18904e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        s3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (y8 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = y8Var.f18904e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f9) {
        int paddingTop;
        super.setTranslationY(f9);
        y8 y8Var = this.H;
        org.telegram.ui.Cells.s3 s3Var = y8Var.f18911y;
        float y8 = getY();
        FrameLayout frameLayout = y8Var.f18904e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        s3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (y8 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = y8Var.f18904e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
