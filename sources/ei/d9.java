package ei;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d9 extends o9 {
    public final k9 M;

    public d9(k9 k9Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, a9 a9Var) {
        super(context, g6Var, a9Var);
        this.M = k9Var;
    }

    @Override
    public final void setContainerHeight(float f7) {
        int paddingTop;
        super.setContainerHeight(f7);
        k9 k9Var = this.M;
        org.telegram.ui.Cells.u3 u3Var = k9Var.f9345y;
        float y3 = getY();
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.J) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = k9Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        int paddingTop;
        super.setTranslationY(f7);
        k9 k9Var = this.M;
        org.telegram.ui.Cells.u3 u3Var = k9Var.f9345y;
        float y3 = getY();
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.J) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = k9Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
