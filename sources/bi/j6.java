package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.b30;
public final class j6 extends FrameLayout {
    public final int[] f4091a;
    public final k6 f4092b;

    public j6(k6 k6Var, Context context) {
        super(context);
        this.f4092b = k6Var;
        this.f4091a = new int[2];
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z9, i7, i10, i11, i12);
        k6 k6Var = this.f4092b;
        b30 b30Var = k6Var.f4150i;
        if (b30Var != null && b30Var.d.getChildCount() >= 2 && k6Var.f4159r != null && (frameLayout = k6Var.f4154m) != null) {
            int[] iArr = this.f4091a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - k6Var.f4154m.getTranslationX();
            float translationY = iArr[1] - k6Var.f4154m.getTranslationY();
            View childAt = b30Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            fi.m3 m3Var = k6Var.f4159r;
            m3Var.setTranslationY(((translationY2 - translationY) - m3Var.getMeasuredHeight()) - b30Var.getMeasuredHeight());
            k6Var.f4159r.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - org.telegram.messenger.g0.L(12.0f));
        }
    }
}
