package cg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z implements View.OnClickListener {
    public final int f3467a;
    public final v0 f3468b;

    public z(v0 v0Var, int i10) {
        this.f3467a = i10;
        this.f3468b = v0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3467a) {
            case 0:
                v0 v0Var = this.f3468b;
                AndroidUtilities.addToClipboard(v0Var.p1());
                v0Var.dismiss();
                return;
            case 1:
                g0 g0Var = this.f3468b.A0;
                if (g0Var.h) {
                    g0Var.f3092e.performClick();
                    return;
                } else {
                    g0Var.f3095r.performClick();
                    return;
                }
            case 2:
                g0 g0Var2 = this.f3468b.A0;
                if (g0Var2.h) {
                    g0Var2.f3092e.performClick();
                    return;
                } else {
                    g0Var2.f3095r.performClick();
                    return;
                }
            default:
                v0.S(this.f3468b);
                return;
        }
    }
}
