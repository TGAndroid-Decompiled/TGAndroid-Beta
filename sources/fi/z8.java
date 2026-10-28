package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends k9 {
    public final g9 M;

    public z8(g9 g9Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, w8 w8Var) {
        super(context, u6Var, w8Var);
        this.M = g9Var;
    }

    @Override
    public final void setContainerHeight(float f7) {
        int paddingTop;
        super.setContainerHeight(f7);
        g9 g9Var = this.M;
        org.telegram.ui.Cells.z3 z3Var = g9Var.f10928y;
        float y3 = getY();
        FrameLayout frameLayout = g9Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        z3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.J) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = g9Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        int paddingTop;
        super.setTranslationY(f7);
        g9 g9Var = this.M;
        org.telegram.ui.Cells.z3 z3Var = g9Var.f10928y;
        float y3 = getY();
        FrameLayout frameLayout = g9Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        z3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.J) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = g9Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
