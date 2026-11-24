package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class di implements View.OnClickListener {
    public final byte a;
    public final my0 b;

    public di(my0 my0Var, byte b) {
        this.a = b;
        this.b = my0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                my0Var.dismiss();
                return;
            case 1:
                my0Var.I(((Integer) view.getTag()).intValue());
                return;
            case 2:
                my0Var.dismiss();
                return;
            case 3:
                my0Var.dismiss();
                return;
            case 4:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    my0Var.dismiss();
                    return;
                }
                return;
            case 5:
                my0Var.dismiss();
                return;
            case 6:
                my0Var.dismiss();
                return;
            case 7:
                my0Var.dismiss();
                return;
            default:
                my0Var.dismiss();
                return;
        }
    }
}
