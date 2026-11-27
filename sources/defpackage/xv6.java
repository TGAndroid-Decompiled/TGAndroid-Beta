package defpackage;

import java.util.ArrayList;
public final class xv6 implements Runnable {
    public final byte a;
    public final v34 b;
    public final ev6 c;
    public final ArrayList d;
    public final zv6 e;

    public xv6(zv6 zv6Var, v34 v34Var, ev6 ev6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.e = zv6Var;
        this.b = v34Var;
        this.c = ev6Var;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        ev6 ev6Var = this.c;
        zv6 zv6Var = this.e;
        v34 v34Var = this.b;
        switch (b) {
            case 0:
                v34Var.P(zv6Var, ev6Var, arrayList);
                return;
            default:
                v34Var.P(zv6Var, ev6Var, arrayList);
                return;
        }
    }
}
