package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class vz3 implements Runnable {
    public final byte a;
    public final i24 b;

    public vz3(i24 i24Var, byte b) {
        this.a = b;
        this.b = i24Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        i24 i24Var = this.b;
        switch (b) {
            case 0:
                a04 a04Var = i24Var.x.R.H0;
                if (!a04Var.G) {
                    a04Var.d(true);
                    Utilities.B(new vz3(i24Var, (byte) 1), new h24(i24Var, (byte) 0));
                    return;
                }
                return;
            default:
                ArrayList arrayList = i24Var.r;
                ArrayList arrayList2 = i24Var.h;
                j24 j24Var = i24Var.x;
                o24 o24Var = j24Var.R;
                if (j24Var.N == i24Var.b) {
                    arrayList2.remove(arrayList);
                    j24Var.F = i24Var.c;
                    j24Var.G = i24Var.d;
                    j24Var.H = i24Var.e;
                    j24Var.I = i24Var.f;
                    j24Var.J = arrayList2;
                    j24Var.K = i24Var.n;
                    j24Var.L = new ArrayList(arrayList);
                    o24Var.H0.d(false);
                    j79 adapter = o24Var.E0.getAdapter();
                    j24 j24Var2 = o24Var.A0;
                    if (adapter != j24Var2) {
                        o24Var.E0.setAdapter(j24Var2);
                    }
                    j24Var.f();
                    return;
                }
                return;
        }
    }
}
