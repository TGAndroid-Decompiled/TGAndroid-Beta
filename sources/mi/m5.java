package mi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class m5 extends ViewGroup {
    public final int f19751a;
    public final n5 f19752b;

    public m5(n5 n5Var, Context context) {
        super(context);
        this.f19752b = n5Var;
        this.f19751a = org.telegram.messenger.g0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        n5 n5Var = this.f19752b;
        int measuredWidth = n5Var.f19771w.getMeasuredWidth();
        int measuredHeight = n5Var.f19771w.getMeasuredHeight();
        p5 p5Var = n5Var.f19771w;
        int i13 = this.f19751a;
        p5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int i11 = this.f19751a;
        int max = Math.max(0, size + i11);
        n5 n5Var = this.f19752b;
        n5Var.f19771w.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i10);
        int measuredWidth = n5Var.f19771w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), n5Var.f19771w.getMeasuredHeight());
    }
}
