package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class zh3 extends FragmentContextView {
    public final byte X0;
    public final uj3 Y0;

    public zh3(uj3 uj3Var, Context context, uj3 uj3Var2, byte b) {
        super(context, uj3Var2, true);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = uj3Var;
                super(context, uj3Var2, false);
                return;
            default:
                this.Y0 = uj3Var;
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.X0;
        boolean z = false;
        uj3 uj3Var = this.Y0;
        switch (b) {
            case 0:
                xj3 xj3Var = uj3Var.L1;
                FrameLayout frameLayout = uj3Var.I1;
                if (i == 0) {
                    z = true;
                }
                xj3Var.j(frameLayout, z, true);
                return;
            default:
                xj3 xj3Var2 = uj3Var.L1;
                FrameLayout frameLayout2 = uj3Var.K1;
                if (i == 0) {
                    z = true;
                }
                xj3Var2.j(frameLayout2, z, true);
                return;
        }
    }
}
