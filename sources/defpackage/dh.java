package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class dh implements View.OnClickListener {
    public final byte a;
    public final fx0 b;

    public dh(fx0 fx0Var, byte b) {
        this.a = b;
        this.b = fx0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        fx0 fx0Var = this.b;
        switch (b) {
            case 0:
                fx0Var.dismiss();
                return;
            case 1:
                fx0Var.J(((Integer) view.getTag()).intValue());
                return;
            case 2:
                fx0Var.dismiss();
                return;
            case 3:
                fx0Var.dismiss();
                return;
            case 4:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    fx0Var.dismiss();
                    return;
                }
                return;
            case 5:
                fx0Var.dismiss();
                return;
            case 6:
                fx0Var.dismiss();
                return;
            case 7:
                fx0Var.dismiss();
                return;
            default:
                fx0Var.dismiss();
                return;
        }
    }
}
