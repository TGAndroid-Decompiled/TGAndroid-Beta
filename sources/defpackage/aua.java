package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class aua extends FrameLayout {
    public final int[] a;
    public final bua b;

    public aua(bua buaVar, Context context) {
        super(context);
        this.b = buaVar;
        this.a = new int[2];
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout;
        super.onLayout(z, i, i2, i3, i4);
        bua buaVar = this.b;
        zh5 zh5Var = buaVar.i;
        if (zh5Var != null && zh5Var.d.getChildCount() >= 2 && buaVar.u != null && (frameLayout = buaVar.n) != null) {
            int[] iArr = this.a;
            frameLayout.getLocationInWindow(iArr);
            float translationX = iArr[0] - buaVar.n.getTranslationX();
            float translationY = iArr[1] - buaVar.n.getTranslationY();
            View childAt = zh5Var.d.getChildAt(1);
            childAt.getLocationInWindow(iArr);
            float translationY2 = iArr[1] - childAt.getTranslationY();
            kg5 kg5Var = buaVar.u;
            kg5Var.setTranslationY(((translationY2 - translationY) - kg5Var.getMeasuredHeight()) - zh5Var.getMeasuredHeight());
            buaVar.u.o(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + ((iArr[0] - childAt.getTranslationX()) - translationX)) - hl.L(12.0f));
        }
    }
}
