package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o40;
public final class j4 extends FrameLayout {
    public final int[] f12648a;
    public final k4 f12649b;

    public j4(k4 k4Var, Context context) {
        super(context);
        this.f12649b = k4Var;
        this.f12648a = new int[2];
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z4, i10, i11, i12, i13);
        k4 k4Var = this.f12649b;
        o40 o40Var = k4Var.f12693i;
        if (o40Var != null && o40Var.d.getChildCount() >= 2 && k4Var.f12702r != null && (frameLayout = k4Var.f12697m) != null) {
            int[] iArr = this.f12648a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - k4Var.f12697m.getTranslationX();
            float translationY = iArr[1] - k4Var.f12697m.getTranslationY();
            View childAt = o40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ph.f3 f3Var = k4Var.f12702r;
            f3Var.setTranslationY(((translationY2 - translationY) - f3Var.getMeasuredHeight()) - o40Var.getMeasuredHeight());
            k4Var.f12702r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
