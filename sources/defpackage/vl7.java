package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class vl7 implements Runnable {
    public final byte a;
    public final lm7 b;

    public vl7(lm7 lm7Var, byte b) {
        this.a = b;
        this.b = lm7Var;
    }

    @Override
    public final void run() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        boolean z5;
        byte b = this.a;
        j1d j1dVar = null;
        r3 = null;
        fj6 fj6Var = null;
        lm7 lm7Var = this.b;
        switch (b) {
            case 0:
                lm7Var.j0();
                return;
            case 1:
                lm7Var.R = null;
                lm7Var.y0(2, true);
                return;
            case 2:
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    j1dVar = launchActivity.g1;
                }
                if ((j1dVar == null || j1dVar.c <= 0) && lm7Var.O != (i = lm7Var.P)) {
                    lm7Var.O = i;
                    lm7Var.M0(false);
                    return;
                }
                return;
            case 3:
                na4 na4Var = lm7Var.a0;
                da4[] da4VarArr = lm7Var.Y;
                if (lm7Var.getParentLayout() != null) {
                    for (e eVar : lm7Var.getParentLayout().getFragmentStack()) {
                        if (eVar instanceof fj6) {
                            fj6Var = (fj6) eVar;
                        }
                    }
                }
                if (fj6Var != null && fj6Var.b0() == lm7Var) {
                    z = true;
                } else {
                    z = false;
                }
                if (ea4.e(fj6Var) && !ea4.b(lm7Var)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                na4Var.c(z2, z3, z4, ea4.l(lm7Var));
                if (!z && lm7Var.c0) {
                    na4Var.b();
                }
                lm7Var.c0 = z;
                boolean z6 = false;
                for (int i2 = 0; i2 < da4VarArr.length; i2++) {
                    if (z2 && ea4.d(lm7Var.b[i2].f)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 |= z5;
                    lm7Var.O0(i2);
                    da4VarArr[i2].a.b(z5);
                    da4VarArr[i2].a.c();
                }
                vl7 vl7Var = lm7Var.Z;
                if (!z6 && !z3) {
                    j = 400;
                } else {
                    j = 100;
                }
                hl.d3(vl7Var, j);
                return;
            default:
                lm7Var.H.setVisibility(8);
                return;
        }
    }
}
