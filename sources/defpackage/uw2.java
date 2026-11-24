package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class uw2 implements View.OnClickListener {
    public final byte a;
    public final hx2 b;

    public uw2(hx2 hx2Var, byte b) {
        this.a = b;
        this.b = hx2Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        hx2 hx2Var = this.b;
        switch (b) {
            case 0:
                hx2Var.K = false;
                hx2Var.z.invalidate();
                hx2Var.b();
                return;
            case 1:
                Activity activity = hx2Var.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.N() != null && launchActivity.N().getLastFragment() != null) {
                        launchActivity.N().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(5)));
                }
                hx2Var.K = false;
                hx2Var.z.invalidate();
                hx2Var.b();
                return;
            case 2:
                fx2 fx2Var = hx2Var.l;
                if (fx2Var != null) {
                    fx2Var.M();
                }
                hx2Var.d();
                return;
            default:
                fx2 fx2Var2 = hx2Var.l;
                if (fx2Var2 != null) {
                    fx2Var2.p();
                }
                hx2Var.d();
                return;
        }
    }
}
