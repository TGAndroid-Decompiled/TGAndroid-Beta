package bi;

import android.view.View;
import android.widget.LinearLayout;
public final class x0 implements View.OnClickListener {
    public final int f4230a;
    public final b1 f4231b;

    public x0(b1 b1Var, int i7) {
        this.f4230a = i7;
        this.f4231b = b1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4230a) {
            case 0:
                this.f4231b.c(null);
                return;
            default:
                b1 b1Var = this.f4231b;
                LinearLayout linearLayout = b1Var.f3422e;
                if (linearLayout != null && !b1Var.O) {
                    b1Var.f3422e = null;
                    b1Var.h(linearLayout, false);
                    return;
                }
                return;
        }
    }
}
