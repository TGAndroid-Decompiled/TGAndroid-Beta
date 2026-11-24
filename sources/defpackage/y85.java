package defpackage;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class y85 extends wb5 {
    public final b95 h0;

    public y85(b95 b95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.h0 = b95Var;
    }

    @Override
    public final void d(wb5 wb5Var) {
        g95 g95Var = this.h0.N;
        g95 g95Var2 = g95.s5;
        g95Var.A1(wb5Var);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (gm.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(420.0f), View.MeasureSpec.getSize(i)), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
