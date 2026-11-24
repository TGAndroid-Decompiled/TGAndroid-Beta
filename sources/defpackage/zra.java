package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class zra extends FrameLayout {
    public final int[] a;
    public final asa b;

    public zra(asa asaVar, Context context) {
        super(context);
        this.b = asaVar;
        this.a = new int[2];
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout;
        super.onLayout(z, i, i2, i3, i4);
        asa asaVar = this.b;
        wh5 wh5Var = asaVar.i;
        if (wh5Var != null && wh5Var.d.getChildCount() >= 2 && asaVar.t != null && (frameLayout = asaVar.m) != null) {
            int[] iArr = this.a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - asaVar.m.getTranslationX();
            float translationY = iArr[1] - asaVar.m.getTranslationY();
            View childAt = wh5Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            hg5 hg5Var = asaVar.t;
            hg5Var.setTranslationY(((translationY2 - translationY) - hg5Var.getMeasuredHeight()) - wh5Var.getMeasuredHeight());
            asaVar.t.o(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - gm.L(12.0f));
        }
    }
}
