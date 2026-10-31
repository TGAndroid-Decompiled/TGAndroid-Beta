package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class y5 extends ViewGroup {
    public final int f3472a;
    public final z5 f3473b;

    public y5(z5 z5Var, Context context) {
        super(context);
        this.f3473b = z5Var;
        this.f3472a = org.telegram.messenger.i0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        z5 z5Var = this.f3473b;
        int measuredWidth = z5Var.f3483w.getMeasuredWidth();
        int measuredHeight = z5Var.f3483w.getMeasuredHeight();
        b6 b6Var = z5Var.f3483w;
        int i14 = this.f3472a;
        b6Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f3472a;
        int max = Math.max(0, size + i12);
        z5 z5Var = this.f3473b;
        z5Var.f3483w.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i11);
        int measuredWidth = z5Var.f3483w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), z5Var.f3483w.getMeasuredHeight());
    }
}
