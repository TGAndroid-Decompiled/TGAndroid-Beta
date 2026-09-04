package ji;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class r5 extends ViewGroup {
    public final int f14151a;
    public final s5 f14152b;

    public r5(s5 s5Var, Context context) {
        super(context);
        this.f14152b = s5Var;
        this.f14151a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        s5 s5Var = this.f14152b;
        int measuredWidth = s5Var.v.getMeasuredWidth();
        int measuredHeight = s5Var.v.getMeasuredHeight();
        u5 u5Var = s5Var.v;
        int i14 = this.f14151a;
        u5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f14151a;
        int max = Math.max(0, size + i12);
        s5 s5Var = this.f14152b;
        s5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i11);
        int measuredWidth = s5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), s5Var.v.getMeasuredHeight());
    }
}
