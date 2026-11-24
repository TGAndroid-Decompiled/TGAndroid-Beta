package defpackage;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class z65 extends y95 {
    public final c75 h0;

    public z65(c75 c75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.h0 = c75Var;
    }

    @Override
    public final void d(y95 y95Var) {
        h75 h75Var = this.h0.N;
        h75 h75Var2 = h75.s5;
        h75Var.A1(y95Var);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (gl.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(420.0f), View.MeasureSpec.getSize(i)), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
