package fi;

import android.content.Context;
import android.view.View;
public final class u4 extends View {
    public final int f12617a;
    public final x4 f12618b;

    public u4(x4 x4Var, Context context, int i7) {
        super(context);
        this.f12617a = i7;
        this.f12618b = x4Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f12617a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f12618b.d.f11777e), 1073741824));
                return;
            default:
                b5 b5Var = this.f12618b.d;
                int i11 = b5Var.f11784y.J;
                if (i11 >= b5Var.f11780r.getPaddingTop() && !b5Var.S) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
