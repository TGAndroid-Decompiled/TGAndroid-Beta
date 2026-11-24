package defpackage;

import android.view.ContextThemeWrapper;
import org.telegram.ui.PhotoViewer;
public final class o10 extends cd1 {
    public final byte b;
    public final gk7 c;

    public o10(gk7 gk7Var, ContextThemeWrapper contextThemeWrapper, byte b) {
        super(contextThemeWrapper);
        this.b = b;
        this.c = gk7Var;
    }

    @Override
    public final void c(boolean z) {
        boolean z2;
        int i;
        byte b = this.b;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                i20 i20Var = (i20) gk7Var;
                i20Var.updateColors();
                mg2 mg2Var = i20Var.H1;
                if (mg2Var != null) {
                    mg2Var.a(fo.w());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) gk7Var;
                a8 a8Var = photoViewer.G0;
                if (a8Var != null) {
                    a8Var.f(z);
                    a8 a8Var2 = photoViewer.G0;
                    if (z) {
                        i = 259241196;
                    } else {
                        i = 268435455;
                    }
                    a8Var2.setSelectorColor(i);
                }
                lbc lbcVar = photoViewer.G2;
                if (lbcVar != null) {
                    if (!fo.w() && !photoViewer.r) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    lbcVar.s0(z2);
                }
                mg2 mg2Var2 = photoViewer.x0;
                if (mg2Var2 != null) {
                    mg2Var2.a(fo.w());
                    return;
                }
                return;
        }
    }
}
