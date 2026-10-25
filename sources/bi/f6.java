package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w40;
public final class f6 extends FrameLayout {
    public final int[] f4605a;
    public final g6 f4606b;

    public f6(g6 g6Var, Context context) {
        super(context);
        this.f4606b = g6Var;
        this.f4605a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        g6 g6Var = this.f4606b;
        w40 w40Var = g6Var.f4666i;
        if (w40Var != null && w40Var.d.getChildCount() >= 2 && g6Var.f4675r != null && (frameLayout = g6Var.f4670m) != null) {
            int[] iArr = this.f4605a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - g6Var.f4670m.getTranslationX();
            float translationY = iArr[1] - g6Var.f4670m.getTranslationY();
            View childAt = w40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            fi.v3 v3Var = g6Var.f4675r;
            v3Var.setTranslationY(((translationY2 - translationY) - v3Var.getMeasuredHeight()) - w40Var.getMeasuredHeight());
            g6Var.f4675r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
