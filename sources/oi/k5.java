package oi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class k5 extends ViewGroup {
    public final int f22139a;
    public final l5 f22140b;

    public k5(l5 l5Var, Context context) {
        super(context);
        this.f22140b = l5Var;
        this.f22139a = org.telegram.messenger.g0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        l5 l5Var = this.f22140b;
        int measuredWidth = l5Var.f22168w.getMeasuredWidth();
        int measuredHeight = l5Var.f22168w.getMeasuredHeight();
        n5 n5Var = l5Var.f22168w;
        int i13 = this.f22139a;
        n5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int i11 = this.f22139a;
        int max = Math.max(0, size + i11);
        l5 l5Var = this.f22140b;
        l5Var.f22168w.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i10);
        int measuredWidth = l5Var.f22168w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), l5Var.f22168w.getMeasuredHeight());
    }
}
