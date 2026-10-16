package ji;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class t5 extends ViewGroup {
    public final int f13536a;
    public final u5 f13537b;

    public t5(u5 u5Var, Context context) {
        super(context);
        this.f13537b = u5Var;
        this.f13536a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        u5 u5Var = this.f13537b;
        int measuredWidth = u5Var.v.getMeasuredWidth();
        int measuredHeight = u5Var.v.getMeasuredHeight();
        w5 w5Var = u5Var.v;
        int i14 = this.f13536a;
        w5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f13536a;
        int max = Math.max(0, size + i12);
        u5 u5Var = this.f13537b;
        u5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i11);
        int measuredWidth = u5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), u5Var.v.getMeasuredHeight());
    }
}
