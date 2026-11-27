package defpackage;

import java.util.ArrayList;
public final class dd6 implements Runnable {
    public final byte a;
    public final id6 b;
    public final hd6 c;

    public dd6(id6 id6Var, hd6 hd6Var, byte b) {
        this.a = b;
        this.b = id6Var;
        this.c = hd6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hd6 hd6Var = this.c;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = id6Var.J;
                arrayList.remove(hd6Var);
                id6Var.K.l(hd6Var.a);
                if (arrayList.isEmpty()) {
                    id6.s();
                }
                jn7.e().k(284, new Object[0]);
                return;
            case 1:
                ArrayList arrayList2 = id6Var.J;
                arrayList2.remove(hd6Var);
                id6Var.K.l(hd6Var.a);
                if (arrayList2.isEmpty()) {
                    id6.s();
                }
                jn7.e().k(284, new Object[0]);
                return;
            default:
                ArrayList arrayList3 = id6Var.J;
                arrayList3.remove(hd6Var);
                id6Var.K.l(hd6Var.a);
                if (arrayList3.isEmpty()) {
                    id6.s();
                }
                jn7.e().k(284, new Object[0]);
                return;
        }
    }
}
