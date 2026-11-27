package defpackage;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class b95 extends zb5 {
    public final e95 h0;

    public b95(e95 e95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.h0 = e95Var;
    }

    @Override
    public final void d(zb5 zb5Var) {
        j95 j95Var = this.h0.N;
        j95 j95Var2 = j95.s5;
        j95Var.B1(zb5Var);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (hl.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(420.0f), View.MeasureSpec.getSize(i)), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
