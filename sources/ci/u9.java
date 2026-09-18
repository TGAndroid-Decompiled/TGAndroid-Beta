package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u9 extends fa {
    public final ba L;

    public u9(ba baVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, p9 p9Var) {
        super(context, e6Var, p9Var);
        this.L = baVar;
    }

    @Override
    public final void setContainerHeight(float f7) {
        int paddingTop;
        super.setContainerHeight(f7);
        ba baVar = this.L;
        org.telegram.ui.Cells.v3 v3Var = baVar.f4410y;
        float y3 = getY();
        FrameLayout frameLayout = baVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        v3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = baVar.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        int paddingTop;
        super.setTranslationY(f7);
        ba baVar = this.L;
        org.telegram.ui.Cells.v3 v3Var = baVar.f4410y;
        float y3 = getY();
        FrameLayout frameLayout = baVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        v3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = baVar.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
