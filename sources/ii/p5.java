package ii;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class p5 extends ViewGroup {
    public final int f12625a;
    public final q5 f12626b;

    public p5(q5 q5Var, Context context) {
        super(context);
        this.f12626b = q5Var;
        this.f12625a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        q5 q5Var = this.f12626b;
        int measuredWidth = q5Var.v.getMeasuredWidth();
        int measuredHeight = q5Var.v.getMeasuredHeight();
        s5 s5Var = q5Var.v;
        int i14 = this.f12625a;
        s5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f12625a;
        int max = Math.max(0, size + i12);
        q5 q5Var = this.f12626b;
        q5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i11);
        int measuredWidth = q5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), q5Var.v.getMeasuredHeight());
    }
}
