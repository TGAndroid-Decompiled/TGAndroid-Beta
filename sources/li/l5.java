package li;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class l5 extends ViewGroup {
    public final int f18694a;
    public final m5 f18695b;

    public l5(m5 m5Var, Context context) {
        super(context);
        this.f18695b = m5Var;
        this.f18694a = org.telegram.messenger.g0.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        m5 m5Var = this.f18695b;
        int measuredWidth = m5Var.f18714w.getMeasuredWidth();
        int measuredHeight = m5Var.f18714w.getMeasuredHeight();
        o5 o5Var = m5Var.f18714w;
        int i13 = this.f18694a;
        o5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int i11 = this.f18694a;
        int max = Math.max(0, size + i11);
        m5 m5Var = this.f18695b;
        m5Var.f18714w.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i10);
        int measuredWidth = m5Var.f18714w.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), m5Var.f18714w.getMeasuredHeight());
    }
}
