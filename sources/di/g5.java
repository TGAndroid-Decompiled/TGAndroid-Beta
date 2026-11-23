package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.p30;
public final class g5 extends FrameLayout {
    public final int[] f8892a;
    public final h5 f8893b;

    public g5(h5 h5Var, Context context) {
        super(context);
        this.f8893b = h5Var;
        this.f8892a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout;
        super.onLayout(z10, i7, i10, i11, i12);
        h5 h5Var = this.f8893b;
        p30 p30Var = h5Var.f8961i;
        if (p30Var != null && p30Var.d.getChildCount() >= 2 && h5Var.f8972t != null && (frameLayout = h5Var.f8965m) != null) {
            int[] iArr = this.f8892a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - h5Var.f8965m.getTranslationX();
            float translationY = iArr[1] - h5Var.f8965m.getTranslationY();
            View childAt = p30Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            hi.l3 l3Var = h5Var.f8972t;
            l3Var.setTranslationY(((translationY2 - translationY) - l3Var.getMeasuredHeight()) - p30Var.getMeasuredHeight());
            h5Var.f8972t.p(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - org.telegram.messenger.g0.L(12.0f));
        }
    }
}
