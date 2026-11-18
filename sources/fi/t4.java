package fi;

import android.content.Context;
import android.view.View;
public final class t4 extends View {
    public final int f12577a;
    public final w4 f12578b;

    public t4(w4 w4Var, Context context, int i7) {
        super(context);
        this.f12577a = i7;
        this.f12578b = w4Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f12577a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f12578b.d.f11728e), 1073741824));
                return;
            default:
                a5 a5Var = this.f12578b.d;
                int i11 = a5Var.f11735y.J;
                if (i11 >= a5Var.f11731r.getPaddingTop() && !a5Var.S) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
