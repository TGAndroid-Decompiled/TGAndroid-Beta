package di;

import android.content.Context;
import android.view.View;
public final class d5 extends View {
    public final int f8919a;
    public final g5 f8920b;

    public d5(g5 g5Var, Context context, int i7) {
        super(context);
        this.f8919a = i7;
        this.f8920b = g5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f8919a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f8920b.d.f9302e), 1073741824));
                return;
            default:
                k5 k5Var = this.f8920b.d;
                int i11 = k5Var.f9309y.J;
                if (i11 >= k5Var.f9305r.getPaddingTop() && !k5Var.R) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
