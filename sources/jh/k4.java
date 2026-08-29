package jh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j40;
public final class k4 extends FrameLayout {
    public final int[] f12363a;
    public final l4 f12364b;

    public k4(l4 l4Var, Context context) {
        super(context);
        this.f12364b = l4Var;
        this.f12363a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        l4 l4Var = this.f12364b;
        j40 j40Var = l4Var.f12419i;
        if (j40Var != null && j40Var.d.getChildCount() >= 2 && l4Var.f12428r != null && (frameLayout = l4Var.f12423m) != null) {
            int[] iArr = this.f12363a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - l4Var.f12423m.getTranslationX();
            float translationY = iArr[1] - l4Var.f12423m.getTranslationY();
            View childAt = j40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            nh.t3 t3Var = l4Var.f12428r;
            t3Var.setTranslationY(((translationY2 - translationY) - t3Var.getMeasuredHeight()) - j40Var.getMeasuredHeight());
            l4Var.f12428r.n(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
