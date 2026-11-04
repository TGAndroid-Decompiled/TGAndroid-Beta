package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.x20;
public final class m5 extends FrameLayout {
    public final int[] f5540a;
    public final n5 f5541b;

    public m5(n5 n5Var, Context context) {
        super(context);
        this.f5541b = n5Var;
        this.f5540a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z10, i3, i10, i11, i12);
        n5 n5Var = this.f5541b;
        x20 x20Var = n5Var.f5599i;
        if (x20Var != null && x20Var.d.getChildCount() >= 2 && n5Var.f5608r != null && (frameLayout = n5Var.f5603m) != null) {
            int[] iArr = this.f5540a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - n5Var.f5603m.getTranslationX();
            float translationY = iArr[1] - n5Var.f5603m.getTranslationY();
            View childAt = x20Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            gi.l3 l3Var = n5Var.f5608r;
            l3Var.setTranslationY(((translationY2 - translationY) - l3Var.getMeasuredHeight()) - x20Var.getMeasuredHeight());
            n5Var.f5608r.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - org.telegram.messenger.g0.L(12.0f));
        }
    }
}
