package oi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class j5 extends ViewGroup {
    public final int f21764a;
    public final k5 f21765b;

    public j5(k5 k5Var, Context context) {
        super(context);
        this.f21765b = k5Var;
        this.f21764a = org.telegram.messenger.g0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        k5 k5Var = this.f21765b;
        int measuredWidth = k5Var.f21778w.getMeasuredWidth();
        int measuredHeight = k5Var.f21778w.getMeasuredHeight();
        m5 m5Var = k5Var.f21778w;
        int i13 = this.f21764a;
        m5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int i11 = this.f21764a;
        int max = Math.max(0, size + i11);
        k5 k5Var = this.f21765b;
        k5Var.f21778w.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i10);
        int measuredWidth = k5Var.f21778w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), k5Var.f21778w.getMeasuredHeight());
    }
}
