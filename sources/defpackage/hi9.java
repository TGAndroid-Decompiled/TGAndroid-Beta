package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class hi9 extends ViewGroup {
    public final int a;
    public final ii9 b;

    public hi9(ii9 ii9Var, Context context) {
        super(context);
        this.b = ii9Var;
        this.a = gl.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ki9 ki9Var = this.b.w;
        int measuredWidth = ki9Var.getMeasuredWidth();
        int measuredHeight = ki9Var.getMeasuredHeight();
        int i5 = this.a;
        ki9Var.layout(-i5, 0, measuredWidth - i5, measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.a;
        int max = Math.max(0, size + i3);
        ki9 ki9Var = this.b.w;
        ki9Var.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i2);
        int measuredWidth = ki9Var.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i3), ki9Var.getMeasuredHeight());
    }
}
