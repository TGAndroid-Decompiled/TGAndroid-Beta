package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ri3 extends FragmentContextView {
    public final byte X0;
    public final nk3 Y0;

    public ri3(nk3 nk3Var, Context context, nk3 nk3Var2, byte b) {
        super(context, nk3Var2, true);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = nk3Var;
                super(context, nk3Var2, false);
                return;
            default:
                this.Y0 = nk3Var;
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.X0;
        boolean z = false;
        nk3 nk3Var = this.Y0;
        switch (b) {
            case 0:
                qk3 qk3Var = nk3Var.L1;
                FrameLayout frameLayout = nk3Var.I1;
                if (i == 0) {
                    z = true;
                }
                qk3Var.j(frameLayout, z, true);
                return;
            default:
                qk3 qk3Var2 = nk3Var.L1;
                FrameLayout frameLayout2 = nk3Var.K1;
                if (i == 0) {
                    z = true;
                }
                qk3Var2.j(frameLayout2, z, true);
                return;
        }
    }
}
