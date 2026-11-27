package defpackage;

import java.util.ArrayList;
public final class ed6 implements Runnable {
    public final byte a;
    public final id6 b;
    public final ArrayList c;

    public ed6(id6 id6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = id6Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = id6Var.b;
                arrayList2.addAll(arrayList);
                for (int i = 0; i < arrayList2.size(); i++) {
                    hd6 hd6Var = (hd6) arrayList2.get(i);
                    id6Var.a.k(hd6Var.a, hd6Var);
                }
                hl.c3(new ed6(id6Var, arrayList, (byte) 1));
                return;
            default:
                id6Var.J.addAll(arrayList);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    hd6 hd6Var2 = (hd6) arrayList.get(i2);
                    id6Var.K.k(hd6Var2.a, hd6Var2);
                }
                id6.q();
                jn7.e().k(284, new Object[0]);
                return;
        }
    }
}
