package ei;

import android.content.Context;
import android.view.View;
public final class d5 extends View {
    public final int f10197a;
    public final g5 f10198b;

    public d5(g5 g5Var, Context context, int i3) {
        super(context);
        this.f10197a = i3;
        this.f10198b = g5Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f10197a) {
            case 0:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f10198b.d.f10574e), 1073741824));
                return;
            default:
                k5 k5Var = this.f10198b.d;
                int i11 = k5Var.f10581y.J;
                if (i11 >= k5Var.f10577r.getPaddingTop() && !k5Var.S) {
                    i11 = 0;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
