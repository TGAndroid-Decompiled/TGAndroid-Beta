package ei;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d9 extends o9 {
    public final k9 L;

    public d9(k9 k9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, a9 a9Var) {
        super(context, d6Var, a9Var);
        this.L = k9Var;
    }

    @Override
    public final void setContainerHeight(float f7) {
        int paddingTop;
        super.setContainerHeight(f7);
        k9 k9Var = this.L;
        org.telegram.ui.Cells.u3 u3Var = k9Var.f9335y;
        float y3 = getY();
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = k9Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        int paddingTop;
        super.setTranslationY(f7);
        k9 k9Var = this.L;
        org.telegram.ui.Cells.u3 u3Var = k9Var.f9335y;
        float y3 = getY();
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = k9Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
