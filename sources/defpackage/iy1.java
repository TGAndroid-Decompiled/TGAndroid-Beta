package defpackage;

import org.telegram.ui.Components.l;
public final class iy1 implements Runnable {
    public final byte a;
    public final l b;
    public final je5 c;

    public iy1(l lVar, je5 je5Var, byte b) {
        this.a = b;
        this.b = lVar;
        this.c = je5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        je5 je5Var = this.c;
        l lVar = this.b;
        switch (b) {
            case 0:
                lVar.removeView(je5Var);
                if (lVar.b == je5Var) {
                    lVar.b = null;
                    return;
                }
                return;
            case 1:
                lVar.removeView(je5Var);
                return;
            case 2:
                lVar.removeView(je5Var);
                return;
            default:
                lVar.removeView(je5Var);
                if (lVar.a == je5Var) {
                    lVar.a = null;
                    return;
                }
                return;
        }
    }
}
