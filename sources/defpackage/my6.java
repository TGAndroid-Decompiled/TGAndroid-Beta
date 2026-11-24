package defpackage;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
public final class my6 extends xy6 {
    public final byte E = 0;
    public final Object F;

    public my6(hu0 hu0Var, hu0 hu0Var2, FrameLayout frameLayout, long j) {
        super(hu0Var2, frameLayout, j, true);
        this.F = hu0Var;
    }

    @Override
    public final void f(String str, boolean z, boolean z2) {
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                if (z2) {
                    hu0.Y((hu0) obj).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z, z2);
                    return;
                }
            default:
                vy1 vy1Var = (vy1) obj;
                zya zyaVar = vy1Var.Q1;
                if (this.e.isEmpty()) {
                    if (zyaVar.getVisibility() != 4) {
                        zyaVar.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z2) {
                    vy1Var.v1.K.setText("");
                    return;
                } else {
                    super.f(str, z, z2);
                    return;
                }
        }
    }

    public my6(vy1 vy1Var, d dVar, ww0 ww0Var, long j) {
        super(dVar, ww0Var, j, false);
        this.F = vy1Var;
    }
}
