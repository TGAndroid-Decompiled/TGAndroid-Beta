package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class t9 extends fa {
    public final ba L;

    public t9(ba baVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, o9 o9Var) {
        super(context, f6Var, o9Var);
        this.L = baVar;
    }

    @Override
    public final void setContainerHeight(float f7) {
        int paddingTop;
        super.setContainerHeight(f7);
        ba baVar = this.L;
        org.telegram.ui.Cells.u3 u3Var = baVar.f6994y;
        float y3 = getY();
        FrameLayout frameLayout = baVar.f6987e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = baVar.f6987e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        int paddingTop;
        super.setTranslationY(f7);
        ba baVar = this.L;
        org.telegram.ui.Cells.u3 u3Var = baVar.f6994y;
        float y3 = getY();
        FrameLayout frameLayout = baVar.f6987e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = baVar.f6987e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
