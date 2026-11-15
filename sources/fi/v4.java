package fi;

import android.content.Context;
import android.view.View;
public final class v4 extends View {
    public final int f12415a;
    public final y4 f12416b;

    public v4(y4 y4Var, Context context, int i7) {
        super(context);
        this.f12415a = i7;
        this.f12416b = y4Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f12415a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f12416b.d.f11600e), 1073741824));
                return;
            default:
                c5 c5Var = this.f12416b.d;
                int i11 = c5Var.f11607y.J;
                if (i11 >= c5Var.f11603r.getPaddingTop() && !c5Var.S) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
