package di;

import android.content.Context;
import android.view.View;
public final class e5 extends View {
    public final int f8952a;
    public final h5 f8953b;

    public e5(h5 h5Var, Context context, int i7) {
        super(context);
        this.f8952a = i7;
        this.f8953b = h5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f8952a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f8953b.d.f9331e), 1073741824));
                return;
            default:
                l5 l5Var = this.f8953b.d;
                int i11 = l5Var.f9338y.J;
                if (i11 >= l5Var.f9334r.getPaddingTop() && !l5Var.R) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
