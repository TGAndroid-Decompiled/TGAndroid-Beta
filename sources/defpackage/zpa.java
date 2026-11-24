package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class zpa extends FrameLayout {
    public final int[] a;
    public final aqa b;

    public zpa(aqa aqaVar, Context context) {
        super(context);
        this.b = aqaVar;
        this.a = new int[2];
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout;
        super.onLayout(z, i, i2, i3, i4);
        aqa aqaVar = this.b;
        xf5 xf5Var = aqaVar.i;
        if (xf5Var != null && xf5Var.d.getChildCount() >= 2 && aqaVar.t != null && (frameLayout = aqaVar.m) != null) {
            int[] iArr = this.a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - aqaVar.m.getTranslationX();
            float translationY = iArr[1] - aqaVar.m.getTranslationY();
            View childAt = xf5Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            je5 je5Var = aqaVar.t;
            je5Var.setTranslationY(((translationY2 - translationY) - je5Var.getMeasuredHeight()) - xf5Var.getMeasuredHeight());
            aqaVar.t.o(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - gl.L(12.0f));
        }
    }
}
