package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class v4 extends View {

    public final int f14046a;

    public final y4 f14047b;

    public v4(y4 y4Var, Context context, int i10) {
        super(context);
        this.f14046a = i10;
        this.f14047b = y4Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f14046a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f14047b.d.f13153e), 1073741824));
                break;
            default:
                c5 c5Var = this.f14047b.d;
                int i12 = c5Var.f13159x.J;
                if (i12 >= c5Var.f13156r.getPaddingTop() && !c5Var.N) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                break;
        }
    }
}
