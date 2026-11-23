package fi;

import android.content.Context;
import android.view.View;
public final class t4 extends View {
    public final int f12572a;
    public final w4 f12573b;

    public t4(w4 w4Var, Context context, int i7) {
        super(context);
        this.f12572a = i7;
        this.f12573b = w4Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f12572a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f12573b.d.f11723e), 1073741824));
                return;
            default:
                a5 a5Var = this.f12573b.d;
                int i11 = a5Var.f11730y.J;
                if (i11 >= a5Var.f11726r.getPaddingTop() && !a5Var.S) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
