package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class db extends ob {
    public final kb L;

    public db(kb kbVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, sa saVar) {
        super(context, f6Var, saVar);
        this.L = kbVar;
    }

    @Override
    public final void setContainerHeight(float f7) {
        int paddingTop;
        super.setContainerHeight(f7);
        kb kbVar = this.L;
        org.telegram.ui.Cells.u3 u3Var = kbVar.f3015y;
        float y3 = getY();
        FrameLayout frameLayout = kbVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = kbVar.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        int paddingTop;
        super.setTranslationY(f7);
        kb kbVar = this.L;
        org.telegram.ui.Cells.u3 u3Var = kbVar.f3015y;
        float y3 = getY();
        FrameLayout frameLayout = kbVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        u3Var.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (y3 - paddingTop)) - 1.0f);
        FrameLayout frameLayout2 = kbVar.e;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }
}
