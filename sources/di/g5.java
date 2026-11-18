package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.m30;
public final class g5 extends FrameLayout {
    public final int[] f8859a;
    public final h5 f8860b;

    public g5(h5 h5Var, Context context) {
        super(context);
        this.f8860b = h5Var;
        this.f8859a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z10, i7, i10, i11, i12);
        h5 h5Var = this.f8860b;
        m30 m30Var = h5Var.f8927i;
        if (m30Var != null && m30Var.d.getChildCount() >= 2 && h5Var.f8938t != null && (frameLayout = h5Var.f8931m) != null) {
            int[] iArr = this.f8859a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - h5Var.f8931m.getTranslationX();
            float translationY = iArr[1] - h5Var.f8931m.getTranslationY();
            View childAt = m30Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            hi.m3 m3Var = h5Var.f8938t;
            m3Var.setTranslationY(((translationY2 - translationY) - m3Var.getMeasuredHeight()) - m30Var.getMeasuredHeight());
            h5Var.f8938t.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - org.telegram.messenger.g0.L(12.0f));
        }
    }
}
