package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e30;
public final class d5 extends FrameLayout {
    public final int[] f8403a;
    public final e5 f8404b;

    public d5(e5 e5Var, Context context) {
        super(context);
        this.f8404b = e5Var;
        this.f8403a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z10, i7, i10, i11, i12);
        e5 e5Var = this.f8404b;
        e30 e30Var = e5Var.f8459i;
        if (e30Var != null && e30Var.d.getChildCount() >= 2 && e5Var.f8468r != null && (frameLayout = e5Var.f8463m) != null) {
            int[] iArr = this.f8403a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - e5Var.f8463m.getTranslationX();
            float translationY = iArr[1] - e5Var.f8463m.getTranslationY();
            View childAt = e30Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            hi.l3 l3Var = e5Var.f8468r;
            l3Var.setTranslationY(((translationY2 - translationY) - l3Var.getMeasuredHeight()) - e30Var.getMeasuredHeight());
            e5Var.f8468r.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - org.telegram.messenger.g0.L(12.0f));
        }
    }
}
