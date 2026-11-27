package defpackage;

import android.view.View;
public final class toc implements qs3 {
    public final byte a;
    public final zoc b;

    public toc(zoc zocVar, byte b) {
        this.a = b;
        this.b = zocVar;
    }

    @Override
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        zoc zocVar = this.b;
        switch (b) {
            case 0:
                zocVar.C = f;
                zocVar.a.invalidate();
                return;
            case 1:
                zocVar.c0 = f;
                dl1 dl1Var = zocVar.a;
                dl1Var.invalidate();
                if (dl1Var.getParent() instanceof View) {
                    ((View) dl1Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                zocVar.a0 = f;
                dl1 dl1Var2 = zocVar.a;
                dl1Var2.invalidate();
                if (dl1Var2.getParent() instanceof View) {
                    ((View) dl1Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
