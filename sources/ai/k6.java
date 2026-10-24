package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.s40;
public final class k6 extends FrameLayout {
    public final int[] f1619a;
    public final l6 f1620b;

    public k6(l6 l6Var, Context context) {
        super(context);
        this.f1620b = l6Var;
        this.f1619a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        l6 l6Var = this.f1620b;
        s40 s40Var = l6Var.f1700i;
        if (s40Var != null && s40Var.d.getChildCount() >= 2 && l6Var.f1709r != null && (frameLayout = l6Var.f1704m) != null) {
            int[] iArr = this.f1619a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - l6Var.f1704m.getTranslationX();
            float translationY = iArr[1] - l6Var.f1704m.getTranslationY();
            View childAt = s40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ei.x3 x3Var = l6Var.f1709r;
            x3Var.setTranslationY(((translationY2 - translationY) - x3Var.getMeasuredHeight()) - s40Var.getMeasuredHeight());
            l6Var.f1709r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
