package hh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a40;

public final class l4 extends FrameLayout {

    public final int[] f9668a;

    public final m4 f9669b;

    public l4(m4 m4Var, Context context) {
        super(context);
        this.f9669b = m4Var;
        this.f9668a = new int[2];
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        m4 m4Var = this.f9669b;
        a40 a40Var = m4Var.f9720i;
        if (a40Var == null || a40Var.d.getChildCount() < 2 || m4Var.f9729r == null || (frameLayout = m4Var.f9724m) == null) {
            return;
        }
        int[] iArr = this.f9668a;
        frameLayout.getLocationInWindow(iArr);
        float translationX = iArr[0] - m4Var.f9724m.getTranslationX();
        float translationY = iArr[1] - m4Var.f9724m.getTranslationY();
        View childAt = a40Var.d.getChildAt(1);
        childAt.getLocationInWindow(iArr);
        float translationX2 = iArr[0] - childAt.getTranslationX();
        float translationY2 = iArr[1] - childAt.getTranslationY();
        lh.w3 w3Var = m4Var.f9729r;
        w3Var.setTranslationY(((translationY2 - translationY) - w3Var.getMeasuredHeight()) - a40Var.getMeasuredHeight());
        m4Var.f9729r.n(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
    }
}
