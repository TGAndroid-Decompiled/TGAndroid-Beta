package nh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends View {
    public final int f16028a;
    public final z4 f16029b;

    public w4(z4 z4Var, Context context, int i10) {
        super(context);
        this.f16028a = i10;
        this.f16029b = z4Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f16028a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f16029b.d.e), 1073741824));
                return;
            default:
                d5 d5Var = this.f16029b.d;
                int i12 = d5Var.f15273x.J;
                if (i12 >= d5Var.f15270r.getPaddingTop() && !d5Var.O) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
