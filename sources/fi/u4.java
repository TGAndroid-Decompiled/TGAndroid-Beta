package fi;

import android.content.Context;
import android.view.View;
public final class u4 extends View {
    public final int f12655a;
    public final x4 f12656b;

    public u4(x4 x4Var, Context context, int i7) {
        super(context);
        this.f12655a = i7;
        this.f12656b = x4Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f12655a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f12656b.d.f11815e), 1073741824));
                return;
            default:
                b5 b5Var = this.f12656b.d;
                int i11 = b5Var.f11822y.J;
                if (i11 >= b5Var.f11818r.getPaddingTop() && !b5Var.S) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
