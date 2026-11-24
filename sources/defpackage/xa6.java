package defpackage;

import java.util.ArrayList;
public final class xa6 implements Runnable {
    public final byte a;
    public final eb6 b;
    public final db6 c;

    public xa6(eb6 eb6Var, db6 db6Var, byte b) {
        this.a = b;
        this.b = eb6Var;
        this.c = db6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        db6 db6Var = this.c;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = eb6Var.J;
                arrayList.remove(db6Var);
                eb6Var.K.l(db6Var.a);
                if (arrayList.isEmpty()) {
                    eb6.s();
                }
                kk7.e().k(283, new Object[0]);
                return;
            case 1:
                ArrayList arrayList2 = eb6Var.J;
                arrayList2.remove(db6Var);
                eb6Var.K.l(db6Var.a);
                if (arrayList2.isEmpty()) {
                    eb6.s();
                }
                kk7.e().k(283, new Object[0]);
                return;
            default:
                ArrayList arrayList3 = eb6Var.J;
                arrayList3.remove(db6Var);
                eb6Var.K.l(db6Var.a);
                if (arrayList3.isEmpty()) {
                    eb6.s();
                }
                kk7.e().k(283, new Object[0]);
                return;
        }
    }
}
