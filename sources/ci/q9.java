package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q9 extends ba {
    public final x9 L;

    public q9(x9 x9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, l9 l9Var) {
        super(context, d6Var, l9Var);
        this.L = x9Var;
    }

    @Override
    public final void setContainerHeight(float f7) {
        int paddingTop;
        super.setContainerHeight(f7);
        x9 x9Var = this.L;
        org.telegram.ui.Cells.v3 v3Var = x9Var.f6313y;
        float y3 = getY();
        FrameLayout frameLayout = x9Var.f6306e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        v3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = x9Var.f6306e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        int paddingTop;
        super.setTranslationY(f7);
        x9 x9Var = this.L;
        org.telegram.ui.Cells.v3 v3Var = x9Var.f6313y;
        float y3 = getY();
        FrameLayout frameLayout = x9Var.f6306e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        v3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = x9Var.f6306e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
