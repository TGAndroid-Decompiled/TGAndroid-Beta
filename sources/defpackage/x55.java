package defpackage;

import android.widget.LinearLayout;
import org.telegram.ui.LaunchActivity;
public final class x55 extends LinearLayout {
    public boolean a;
    public final hn7 b;
    public final t55 c;
    public final u55 d;

    public x55(LaunchActivity launchActivity, hn7 hn7Var, t55 t55Var, u55 u55Var) {
        super(launchActivity);
        this.b = hn7Var;
        this.c = t55Var;
        this.d = u55Var;
        this.a = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.a = true;
        hn7 hn7Var = this.b;
        hn7Var.setItemCount(5);
        t55 t55Var = this.c;
        t55Var.setItemCount(5);
        u55 u55Var = this.d;
        u55Var.setItemCount(5);
        hn7Var.getLayoutParams().height = gl.L(54.0f) * 5;
        t55Var.getLayoutParams().height = gl.L(54.0f) * 5;
        u55Var.getLayoutParams().height = gl.L(54.0f) * 5;
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
