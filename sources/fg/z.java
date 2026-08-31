package fg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z implements View.OnClickListener {
    public final int f6632a;
    public final v0 f6633b;

    public z(v0 v0Var, int i10) {
        this.f6632a = i10;
        this.f6633b = v0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6632a) {
            case 0:
                v0 v0Var = this.f6633b;
                AndroidUtilities.addToClipboard(v0Var.p1());
                v0Var.dismiss();
                return;
            case 1:
                g0 g0Var = this.f6633b.B0;
                if (g0Var.h) {
                    g0Var.f6247e.performClick();
                    return;
                } else {
                    g0Var.f6250r.performClick();
                    return;
                }
            case 2:
                g0 g0Var2 = this.f6633b.B0;
                if (g0Var2.h) {
                    g0Var2.f6247e.performClick();
                    return;
                } else {
                    g0Var2.f6250r.performClick();
                    return;
                }
            default:
                v0.S(this.f6633b);
                return;
        }
    }
}
