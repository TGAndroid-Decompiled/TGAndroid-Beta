package lh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v4 extends View {
    public final int f16311a;
    public final y4 f16312b;

    public v4(y4 y4Var, Context context, int i10) {
        super(context);
        this.f16311a = i10;
        this.f16312b = y4Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f16311a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f16312b.d.f15435e), 1073741824));
                return;
            default:
                c5 c5Var = this.f16312b.d;
                int i12 = c5Var.f15441x.J;
                if (i12 >= c5Var.f15438r.getPaddingTop() && !c5Var.N) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
