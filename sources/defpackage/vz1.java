package defpackage;

import org.telegram.ui.Components.l;
public final class vz1 implements Runnable {
    public final byte a;
    public final l b;
    public final hg5 c;

    public vz1(l lVar, hg5 hg5Var, byte b) {
        this.a = b;
        this.b = lVar;
        this.c = hg5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hg5 hg5Var = this.c;
        l lVar = this.b;
        switch (b) {
            case 0:
                lVar.removeView(hg5Var);
                if (lVar.b == hg5Var) {
                    lVar.b = null;
                    return;
                }
                return;
            case 1:
                lVar.removeView(hg5Var);
                return;
            case 2:
                lVar.removeView(hg5Var);
                return;
            default:
                lVar.removeView(hg5Var);
                if (lVar.a == hg5Var) {
                    lVar.a = null;
                    return;
                }
                return;
        }
    }
}
