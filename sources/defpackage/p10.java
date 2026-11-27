package defpackage;

import android.view.ContextThemeWrapper;
import org.telegram.ui.PhotoViewer;
public final class p10 extends kd1 {
    public final byte b;
    public final fn7 c;

    public p10(fn7 fn7Var, ContextThemeWrapper contextThemeWrapper, byte b) {
        super(contextThemeWrapper);
        this.b = b;
        this.c = fn7Var;
    }

    @Override
    public final void c(boolean z) {
        boolean z2;
        int i;
        byte b = this.b;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                j20 j20Var = (j20) fn7Var;
                j20Var.updateColors();
                eh2 eh2Var = j20Var.H1;
                if (eh2Var != null) {
                    eh2Var.a(go.w());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) fn7Var;
                b8 b8Var = photoViewer.G0;
                if (b8Var != null) {
                    b8Var.f(z);
                    b8 b8Var2 = photoViewer.G0;
                    if (z) {
                        i = 259241196;
                    } else {
                        i = 268435455;
                    }
                    b8Var2.setSelectorColor(i);
                }
                kfc kfcVar = photoViewer.G2;
                if (kfcVar != null) {
                    if (!go.w() && !photoViewer.r) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    kfcVar.s0(z2);
                }
                eh2 eh2Var2 = photoViewer.x0;
                if (eh2Var2 != null) {
                    eh2Var2.a(go.w());
                    return;
                }
                return;
        }
    }
}
