package defpackage;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
public final class t07 extends e17 {
    public final byte E = 1;
    public final Object F;

    public t07(qu0 qu0Var, qu0 qu0Var2, FrameLayout frameLayout, long j) {
        super(qu0Var2, frameLayout, j, true);
        this.F = qu0Var;
    }

    @Override
    public final void f(String str, boolean z, boolean z2) {
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                if (z2) {
                    qu0.Y((qu0) obj).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z, z2);
                    return;
                }
            default:
                nz1 nz1Var = (nz1) obj;
                z2b z2bVar = nz1Var.Q1;
                if (this.e.isEmpty()) {
                    if (z2bVar.getVisibility() != 4) {
                        z2bVar.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z2) {
                    nz1Var.v1.L.setText("");
                    return;
                } else {
                    super.f(str, z, z2);
                    return;
                }
        }
    }

    public t07(nz1 nz1Var, e eVar, ex0 ex0Var, long j) {
        super(eVar, ex0Var, j, false);
        this.F = nz1Var;
    }
}
