package defpackage;

import java.util.ArrayList;
public final class wc6 implements Runnable {
    public final byte a;
    public final dd6 b;
    public final cd6 c;

    public wc6(dd6 dd6Var, cd6 cd6Var, byte b) {
        this.a = b;
        this.b = dd6Var;
        this.c = cd6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cd6 cd6Var = this.c;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = dd6Var.J;
                arrayList.remove(cd6Var);
                dd6Var.K.l(cd6Var.a);
                if (arrayList.isEmpty()) {
                    dd6.s();
                }
                nm7.e().k(285, new Object[0]);
                return;
            case 1:
                ArrayList arrayList2 = dd6Var.J;
                arrayList2.remove(cd6Var);
                dd6Var.K.l(cd6Var.a);
                if (arrayList2.isEmpty()) {
                    dd6.s();
                }
                nm7.e().k(285, new Object[0]);
                return;
            default:
                ArrayList arrayList3 = dd6Var.J;
                arrayList3.remove(cd6Var);
                dd6Var.K.l(cd6Var.a);
                if (arrayList3.isEmpty()) {
                    dd6.s();
                }
                nm7.e().k(285, new Object[0]);
                return;
        }
    }
}
