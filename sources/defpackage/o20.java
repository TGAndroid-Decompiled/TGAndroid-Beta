package defpackage;

import android.view.ContextThemeWrapper;
import org.telegram.ui.PhotoViewer;
public final class o20 extends ke1 {
    public final byte b;
    public final jm7 c;

    public o20(jm7 jm7Var, ContextThemeWrapper contextThemeWrapper, byte b) {
        super(contextThemeWrapper);
        this.b = b;
        this.c = jm7Var;
    }

    @Override
    public final void c(boolean z) {
        boolean z2;
        int i;
        byte b = this.b;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                i30 i30Var = (i30) jm7Var;
                i30Var.updateColors();
                ai2 ai2Var = i30Var.H1;
                if (ai2Var != null) {
                    ai2Var.a(fp.w());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) jm7Var;
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
                ndc ndcVar = photoViewer.G2;
                if (ndcVar != null) {
                    if (!fp.w() && !photoViewer.r) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    ndcVar.s0(z2);
                }
                ai2 ai2Var2 = photoViewer.x0;
                if (ai2Var2 != null) {
                    ai2Var2.a(fp.w());
                    return;
                }
                return;
        }
    }
}
