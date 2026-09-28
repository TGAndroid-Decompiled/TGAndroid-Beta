package ii;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class o5 extends ViewGroup {
    public final int f11532a;
    public final p5 f11533b;

    public o5(p5 p5Var, Context context) {
        super(context);
        this.f11533b = p5Var;
        this.f11532a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p5 p5Var = this.f11533b;
        int measuredWidth = p5Var.v.getMeasuredWidth();
        int measuredHeight = p5Var.v.getMeasuredHeight();
        r5 r5Var = p5Var.v;
        int i14 = this.f11532a;
        r5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f11532a;
        int max = Math.max(0, size + i12);
        p5 p5Var = this.f11533b;
        p5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i11);
        int measuredWidth = p5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), p5Var.v.getMeasuredHeight());
    }
}
