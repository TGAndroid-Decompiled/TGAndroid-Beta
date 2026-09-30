package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r9 extends ca {
    public final y9 L;

    public r9(y9 y9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, m9 m9Var) {
        super(context, d6Var, m9Var);
        this.L = y9Var;
    }

    @Override
    public final void setContainerHeight(float f7) {
        int paddingTop;
        super.setContainerHeight(f7);
        y9 y9Var = this.L;
        org.telegram.ui.Cells.v3 v3Var = y9Var.f5889y;
        float y3 = getY();
        FrameLayout frameLayout = y9Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        v3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = y9Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        int paddingTop;
        super.setTranslationY(f7);
        y9 y9Var = this.L;
        org.telegram.ui.Cells.v3 v3Var = y9Var.f5889y;
        float y3 = getY();
        FrameLayout frameLayout = y9Var.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        v3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = y9Var.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
