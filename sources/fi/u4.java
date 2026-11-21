package fi;

import android.content.Context;
import android.view.View;
public final class u4 extends View {
    public final int f12652a;
    public final x4 f12653b;

    public u4(x4 x4Var, Context context, int i7) {
        super(context);
        this.f12652a = i7;
        this.f12653b = x4Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f12652a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f12653b.d.f11812e), 1073741824));
                return;
            default:
                b5 b5Var = this.f12653b.d;
                int i11 = b5Var.f11819y.J;
                if (i11 >= b5Var.f11815r.getPaddingTop() && !b5Var.S) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
