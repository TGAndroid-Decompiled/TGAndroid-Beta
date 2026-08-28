package kh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f9 extends q9 {
    public final n9 H;

    public f9(n9 n9Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, c9 c9Var) {
        super(context, b6Var, c9Var);
        this.H = n9Var;
    }

    @Override
    public final void setContainerHeight(float f10) {
        int paddingTop;
        super.setContainerHeight(f10);
        n9 n9Var = this.H;
        org.telegram.ui.Cells.v3 v3Var = n9Var.f15777y;
        float y10 = getY();
        FrameLayout frameLayout = n9Var.f15770e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        v3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = n9Var.f15770e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        int paddingTop;
        super.setTranslationY(f10);
        n9 n9Var = this.H;
        org.telegram.ui.Cells.v3 v3Var = n9Var.f15777y;
        float y10 = getY();
        FrameLayout frameLayout = n9Var.f15770e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        v3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (y10 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = n9Var.f15770e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
