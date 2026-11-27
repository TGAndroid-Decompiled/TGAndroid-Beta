package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class rg implements View.OnClickListener {
    public final byte a;
    public final nx0 b;

    public rg(nx0 nx0Var, byte b) {
        this.a = b;
        this.b = nx0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                nx0Var.dismiss();
                return;
            case 1:
                nx0Var.I(((Integer) view.getTag()).intValue());
                return;
            case 2:
                nx0Var.dismiss();
                return;
            case 3:
                nx0Var.dismiss();
                return;
            case 4:
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    nx0Var.dismiss();
                    return;
                }
                return;
            case 5:
                nx0Var.dismiss();
                return;
            case 6:
                nx0Var.dismiss();
                return;
            case 7:
                nx0Var.dismiss();
                return;
            default:
                nx0Var.dismiss();
                return;
        }
    }
}
