package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.c30;
public final class j6 extends FrameLayout {
    public final int[] f4094a;
    public final k6 f4095b;

    public j6(k6 k6Var, Context context) {
        super(context);
        this.f4095b = k6Var;
        this.f4094a = new int[2];
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z9, i7, i10, i11, i12);
        k6 k6Var = this.f4095b;
        c30 c30Var = k6Var.f4153i;
        if (c30Var != null && c30Var.d.getChildCount() >= 2 && k6Var.f4162r != null && (frameLayout = k6Var.f4157m) != null) {
            int[] iArr = this.f4094a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - k6Var.f4157m.getTranslationX();
            float translationY = iArr[1] - k6Var.f4157m.getTranslationY();
            View childAt = c30Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            fi.m3 m3Var = k6Var.f4162r;
            m3Var.setTranslationY(((translationY2 - translationY) - m3Var.getMeasuredHeight()) - c30Var.getMeasuredHeight());
            k6Var.f4162r.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - org.telegram.messenger.g0.L(12.0f));
        }
    }
}
