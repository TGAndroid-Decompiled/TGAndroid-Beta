package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class fh3 extends FragmentContextView {
    public final byte X0;
    public final cj3 Y0;

    public fh3(cj3 cj3Var, Context context, cj3 cj3Var2, byte b) {
        super(context, cj3Var2, true);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = cj3Var;
                super(context, cj3Var2, false);
                return;
            default:
                this.Y0 = cj3Var;
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.X0;
        boolean z = false;
        cj3 cj3Var = this.Y0;
        switch (b) {
            case 0:
                fj3 fj3Var = cj3Var.L1;
                FrameLayout frameLayout = cj3Var.I1;
                if (i == 0) {
                    z = true;
                }
                fj3Var.j(frameLayout, z, true);
                return;
            default:
                fj3 fj3Var2 = cj3Var.L1;
                FrameLayout frameLayout2 = cj3Var.K1;
                if (i == 0) {
                    z = true;
                }
                fj3Var2.j(frameLayout2, z, true);
                return;
        }
    }
}
