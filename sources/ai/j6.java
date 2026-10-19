package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u40;
public final class j6 extends FrameLayout {
    public final int[] f1558a;
    public final k6 f1559b;

    public j6(k6 k6Var, Context context) {
        super(context);
        this.f1559b = k6Var;
        this.f1558a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        k6 k6Var = this.f1559b;
        u40 u40Var = k6Var.f1637i;
        if (u40Var != null && u40Var.d.getChildCount() >= 2 && k6Var.f1646r != null && (frameLayout = k6Var.f1641m) != null) {
            int[] iArr = this.f1558a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - k6Var.f1641m.getTranslationX();
            float translationY = iArr[1] - k6Var.f1641m.getTranslationY();
            View childAt = u40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ei.x3 x3Var = k6Var.f1646r;
            x3Var.setTranslationY(((translationY2 - translationY) - x3Var.getMeasuredHeight()) - u40Var.getMeasuredHeight());
            k6Var.f1646r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
