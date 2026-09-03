package eg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z implements View.OnClickListener {
    public final int f5573a;
    public final v0 f5574b;

    public z(v0 v0Var, int i10) {
        this.f5573a = i10;
        this.f5574b = v0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5573a) {
            case 0:
                v0 v0Var = this.f5574b;
                AndroidUtilities.addToClipboard(v0Var.p1());
                v0Var.dismiss();
                return;
            case 1:
                g0 g0Var = this.f5574b.B0;
                if (g0Var.h) {
                    g0Var.e.performClick();
                    return;
                } else {
                    g0Var.f5221r.performClick();
                    return;
                }
            case 2:
                g0 g0Var2 = this.f5574b.B0;
                if (g0Var2.h) {
                    g0Var2.e.performClick();
                    return;
                } else {
                    g0Var2.f5221r.performClick();
                    return;
                }
            default:
                v0.S(this.f5574b);
                return;
        }
    }
}
