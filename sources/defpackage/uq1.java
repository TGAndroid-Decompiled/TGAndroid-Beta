package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class uq1 extends FragmentContextView {
    public final byte X0;
    public final mu1 Y0;

    public uq1(mu1 mu1Var, Context context, mu1 mu1Var2, wjb wjbVar, byte b) {
        super(context, mu1Var2, null, true, wjbVar);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = mu1Var;
                super(context, mu1Var2, null, false, wjbVar);
                return;
            default:
                this.Y0 = mu1Var;
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.X0;
        boolean z = false;
        mu1 mu1Var = this.Y0;
        switch (b) {
            case 0:
                ez1 ez1Var = mu1Var.b1;
                FrameLayout frameLayout = mu1Var.p2;
                if (i == 0) {
                    z = true;
                }
                ez1Var.j(frameLayout, z, true);
                return;
            default:
                ez1 ez1Var2 = mu1Var.b1;
                FrameLayout frameLayout2 = mu1Var.n2;
                if (i == 0) {
                    z = true;
                }
                ez1Var2.j(frameLayout2, z, true);
                return;
        }
    }
}
