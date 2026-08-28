package gh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v30;
public final class n4 extends FrameLayout {
    public final int[] f8601a;
    public final o4 f8602b;

    public n4(o4 o4Var, Context context) {
        super(context);
        this.f8602b = o4Var;
        this.f8601a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z10, i9, i10, i11, i12);
        o4 o4Var = this.f8602b;
        v30 v30Var = o4Var.f8674i;
        if (v30Var != null && v30Var.d.getChildCount() >= 2 && o4Var.f8683r != null && (frameLayout = o4Var.f8678m) != null) {
            int[] iArr = this.f8601a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - o4Var.f8678m.getTranslationX();
            float translationY = iArr[1] - o4Var.f8678m.getTranslationY();
            View childAt = v30Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            kh.x3 x3Var = o4Var.f8683r;
            x3Var.setTranslationY(((translationY2 - translationY) - x3Var.getMeasuredHeight()) - v30Var.getMeasuredHeight());
            o4Var.f8683r.n(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
