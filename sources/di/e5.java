package di;

import android.content.Context;
import android.view.View;
public final class e5 extends View {
    public final int f8947a;
    public final h5 f8948b;

    public e5(h5 h5Var, Context context, int i7) {
        super(context);
        this.f8947a = i7;
        this.f8948b = h5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f8947a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f8948b.d.f9326e), 1073741824));
                return;
            default:
                l5 l5Var = this.f8948b.d;
                int i11 = l5Var.f9333y.J;
                if (i11 >= l5Var.f9329r.getPaddingTop() && !l5Var.R) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
