package ii;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class n5 extends ViewGroup {
    public final int f11519a;
    public final o5 f11520b;

    public n5(o5 o5Var, Context context) {
        super(context);
        this.f11520b = o5Var;
        this.f11519a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o5 o5Var = this.f11520b;
        int measuredWidth = o5Var.v.getMeasuredWidth();
        int measuredHeight = o5Var.v.getMeasuredHeight();
        q5 q5Var = o5Var.v;
        int i14 = this.f11519a;
        q5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f11519a;
        int max = Math.max(0, size + i12);
        o5 o5Var = this.f11520b;
        o5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i11);
        int measuredWidth = o5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), o5Var.v.getMeasuredHeight());
    }
}
