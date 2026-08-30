package eg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z implements View.OnClickListener {
    public final int f5584a;
    public final v0 f5585b;

    public z(v0 v0Var, int i10) {
        this.f5584a = i10;
        this.f5585b = v0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5584a) {
            case 0:
                v0 v0Var = this.f5585b;
                AndroidUtilities.addToClipboard(v0Var.p1());
                v0Var.dismiss();
                return;
            case 1:
                g0 g0Var = this.f5585b.B0;
                if (g0Var.h) {
                    g0Var.e.performClick();
                    return;
                } else {
                    g0Var.f5232r.performClick();
                    return;
                }
            case 2:
                g0 g0Var2 = this.f5585b.B0;
                if (g0Var2.h) {
                    g0Var2.e.performClick();
                    return;
                } else {
                    g0Var2.f5232r.performClick();
                    return;
                }
            default:
                v0.S(this.f5585b);
                return;
        }
    }
}
