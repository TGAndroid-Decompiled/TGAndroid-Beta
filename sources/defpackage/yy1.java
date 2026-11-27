package defpackage;

import org.telegram.ui.Components.l;
public final class yy1 implements Runnable {
    public final byte a;
    public final l b;
    public final dz1 c;

    public yy1(l lVar, dz1 dz1Var, byte b) {
        this.a = b;
        this.b = lVar;
        this.c = dz1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        dz1 dz1Var = this.c;
        l lVar = this.b;
        switch (b) {
            case 0:
                lVar.removeView(dz1Var);
                return;
            case 1:
                lVar.removeView(dz1Var);
                return;
            case 2:
                lVar.removeView(dz1Var);
                if (lVar.a == dz1Var) {
                    lVar.a = null;
                    return;
                }
                return;
            default:
                lVar.removeView(dz1Var);
                if (lVar.b == dz1Var) {
                    lVar.b = null;
                    return;
                }
                return;
        }
    }
}
