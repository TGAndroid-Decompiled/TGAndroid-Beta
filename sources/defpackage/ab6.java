package defpackage;

import java.util.ArrayList;
public final class ab6 implements Runnable {
    public final byte a;
    public final eb6 b;
    public final ArrayList c;

    public ab6(eb6 eb6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = eb6Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = eb6Var.b;
                arrayList2.addAll(arrayList);
                for (int i = 0; i < arrayList2.size(); i++) {
                    db6 db6Var = (db6) arrayList2.get(i);
                    eb6Var.a.k(db6Var, db6Var.a);
                }
                gl.c3(new ab6(eb6Var, arrayList, (byte) 1));
                return;
            default:
                eb6Var.J.addAll(arrayList);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    db6 db6Var2 = (db6) arrayList.get(i2);
                    eb6Var.K.k(db6Var2, db6Var2.a);
                }
                eb6.q();
                kk7.e().k(283, new Object[0]);
                return;
        }
    }
}
