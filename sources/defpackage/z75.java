package defpackage;

import android.widget.LinearLayout;
import org.telegram.ui.LaunchActivity;
public final class z75 extends LinearLayout {
    public boolean a;
    public final hq7 b;
    public final v75 c;
    public final w75 d;

    public z75(LaunchActivity launchActivity, hq7 hq7Var, v75 v75Var, w75 w75Var) {
        super(launchActivity);
        this.b = hq7Var;
        this.c = v75Var;
        this.d = w75Var;
        this.a = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.a = true;
        hq7 hq7Var = this.b;
        hq7Var.setItemCount(5);
        v75 v75Var = this.c;
        v75Var.setItemCount(5);
        w75 w75Var = this.d;
        w75Var.setItemCount(5);
        hq7Var.getLayoutParams().height = hl.L(54.0f) * 5;
        v75Var.getLayoutParams().height = hl.L(54.0f) * 5;
        w75Var.getLayoutParams().height = hl.L(54.0f) * 5;
        this.a = false;
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
