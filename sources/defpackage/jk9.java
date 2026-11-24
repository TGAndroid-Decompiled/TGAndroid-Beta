package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class jk9 extends ViewGroup {
    public final int a;
    public final kk9 b;

    public jk9(kk9 kk9Var, Context context) {
        super(context);
        this.b = kk9Var;
        this.a = gm.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mk9 mk9Var = this.b.w;
        int measuredWidth = mk9Var.getMeasuredWidth();
        int measuredHeight = mk9Var.getMeasuredHeight();
        int i5 = this.a;
        mk9Var.layout(-i5, 0, measuredWidth - i5, measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.a;
        int max = Math.max(0, size + i3);
        mk9 mk9Var = this.b.w;
        mk9Var.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i2);
        int measuredWidth = mk9Var.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i3), mk9Var.getMeasuredHeight());
    }
}
