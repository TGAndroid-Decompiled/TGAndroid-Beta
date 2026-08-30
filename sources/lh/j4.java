package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n40;
public final class j4 extends FrameLayout {
    public final int[] f12664a;
    public final k4 f12665b;

    public j4(k4 k4Var, Context context) {
        super(context);
        this.f12665b = k4Var;
        this.f12664a = new int[2];
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z4, i10, i11, i12, i13);
        k4 k4Var = this.f12665b;
        n40 n40Var = k4Var.f12709i;
        if (n40Var != null && n40Var.d.getChildCount() >= 2 && k4Var.f12718r != null && (frameLayout = k4Var.f12713m) != null) {
            int[] iArr = this.f12664a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - k4Var.f12713m.getTranslationX();
            float translationY = iArr[1] - k4Var.f12713m.getTranslationY();
            View childAt = n40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            ph.f3 f3Var = k4Var.f12718r;
            f3Var.setTranslationY(((translationY2 - translationY) - f3Var.getMeasuredHeight()) - n40Var.getMeasuredHeight());
            k4Var.f12718r.n(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
