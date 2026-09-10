package hi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends ViewGroup {
    public final int f9803a;
    public final r5 f9804b;

    public q5(r5 r5Var, Context context) {
        super(context);
        this.f9804b = r5Var;
        this.f9803a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        r5 r5Var = this.f9804b;
        int measuredWidth = r5Var.v.getMeasuredWidth();
        int measuredHeight = r5Var.v.getMeasuredHeight();
        t5 t5Var = r5Var.v;
        int i14 = this.f9803a;
        t5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f9803a;
        int max = Math.max(0, size + i12);
        r5 r5Var = this.f9804b;
        r5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i11);
        int measuredWidth = r5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), r5Var.v.getMeasuredHeight());
    }
}
