package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class kv2 implements View.OnClickListener {
    public final byte a;
    public final xv2 b;

    public kv2(xv2 xv2Var, byte b) {
        this.a = b;
        this.b = xv2Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        xv2 xv2Var = this.b;
        switch (b) {
            case 0:
                xv2Var.K = false;
                xv2Var.z.invalidate();
                xv2Var.b();
                return;
            case 1:
                Activity activity = xv2Var.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.N() != null && launchActivity.N().getLastFragment() != null) {
                        launchActivity.N().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(5)));
                }
                xv2Var.K = false;
                xv2Var.z.invalidate();
                xv2Var.b();
                return;
            case 2:
                vv2 vv2Var = xv2Var.l;
                if (vv2Var != null) {
                    vv2Var.L();
                }
                xv2Var.d();
                return;
            default:
                vv2 vv2Var2 = xv2Var.l;
                if (vv2Var2 != null) {
                    vv2Var2.p();
                }
                xv2Var.d();
                return;
        }
    }
}
