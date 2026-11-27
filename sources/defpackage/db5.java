package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class db5 extends FrameLayout {
    public final h85 a;

    public db5(h85 h85Var, Context context) {
        super(context);
        this.a = h85Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.E0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2)) {
            z = true;
        } else {
            z = false;
        }
        h85 h85Var = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h85Var.m1.getLayoutParams();
        if (z) {
            int L = hl.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = hl.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int D = ik8.D(200.0f, View.MeasureSpec.getSize(i), 2);
        h85Var.l1.setPadding(D, 0, D, 0);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(370.0f), 1073741824));
        measureChildWithMargins(h85Var.n1, 0, 0, View.MeasureSpec.makeMeasureSpec(hl.L(64.0f), 1073741824), 0);
    }
}
