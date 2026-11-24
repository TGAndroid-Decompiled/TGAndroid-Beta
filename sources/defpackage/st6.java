package defpackage;

import java.util.ArrayList;
public final class st6 implements Runnable {
    public final byte a;
    public final pj4 b;
    public final zs6 c;
    public final ArrayList d;
    public final ut6 e;

    public st6(ut6 ut6Var, pj4 pj4Var, zs6 zs6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.e = ut6Var;
        this.b = pj4Var;
        this.c = zs6Var;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        zs6 zs6Var = this.c;
        ut6 ut6Var = this.e;
        pj4 pj4Var = this.b;
        switch (b) {
            case 0:
                pj4Var.V(ut6Var, zs6Var, arrayList);
                return;
            default:
                pj4Var.V(ut6Var, zs6Var, arrayList);
                return;
        }
    }
}
