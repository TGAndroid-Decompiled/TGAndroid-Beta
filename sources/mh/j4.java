package mh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p40;
public final class j4 extends FrameLayout {
    public final int[] f14296a;
    public final k4 f14297b;

    public j4(k4 k4Var, Context context) {
        super(context);
        this.f14297b = k4Var;
        this.f14296a = new int[2];
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z4, i10, i11, i12, i13);
        k4 k4Var = this.f14297b;
        p40 p40Var = k4Var.f14341i;
        if (p40Var != null && p40Var.d.getChildCount() >= 2 && k4Var.f14350r != null && (frameLayout = k4Var.f14345m) != null) {
            int[] iArr = this.f14296a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - k4Var.f14345m.getTranslationX();
            float translationY = iArr[1] - k4Var.f14345m.getTranslationY();
            View childAt = p40Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            qh.e3 e3Var = k4Var.f14350r;
            e3Var.setTranslationY(((translationY2 - translationY) - e3Var.getMeasuredHeight()) - p40Var.getMeasuredHeight());
            k4Var.f14350r.m(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - AndroidUtilities.dp(12.0f));
        }
    }
}
