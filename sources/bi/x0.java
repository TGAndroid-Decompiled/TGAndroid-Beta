package bi;

import android.view.View;
import android.widget.LinearLayout;
public final class x0 implements View.OnClickListener {
    public final int f4194a;
    public final b1 f4195b;

    public x0(b1 b1Var, int i7) {
        this.f4194a = i7;
        this.f4195b = b1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4194a) {
            case 0:
                this.f4195b.c(null);
                return;
            default:
                b1 b1Var = this.f4195b;
                LinearLayout linearLayout = b1Var.f3394e;
                if (linearLayout != null && !b1Var.O) {
                    b1Var.f3394e = null;
                    b1Var.h(linearLayout, false);
                    return;
                }
                return;
        }
    }
}
