package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u40;
public final class k6 extends FrameLayout {
    public final int[] f1640a;
    public final l6 f1641b;

    public k6(l6 l6Var, Context context) {
        super(context);
        this.f1641b = l6Var;
        this.f1640a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        l6 l6Var = this.f1641b;
        u40 u40Var = l6Var.f1708i;
        if (u40Var != null && u40Var.d.getChildCount() >= 2 && l6Var.f1717r != null && (frameLayout = l6Var.f1712m) != null) {
            int[] iArr = this.f1640a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - l6Var.f1712m.getTranslationX();
            float translationY = iArr[1] - l6Var.f1712m.getTranslationY();
            View childAt = u40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ei.x3 x3Var = l6Var.f1717r;
            x3Var.setTranslationY(((translationY2 - translationY) - x3Var.getMeasuredHeight()) - u40Var.getMeasuredHeight());
            l6Var.f1717r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
