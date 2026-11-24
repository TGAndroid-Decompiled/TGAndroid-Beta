package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class k04 implements Runnable {
    public final byte a;
    public final y24 b;

    public k04(y24 y24Var, byte b) {
        this.a = b;
        this.b = y24Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        y24 y24Var = this.b;
        switch (b) {
            case 0:
                p04 p04Var = y24Var.x.R.H0;
                if (!p04Var.G) {
                    p04Var.d(true);
                    Utilities.B(new k04(y24Var, (byte) 1), new x24(y24Var, (byte) 0));
                    return;
                }
                return;
            default:
                ArrayList arrayList = y24Var.r;
                ArrayList arrayList2 = y24Var.h;
                z24 z24Var = y24Var.x;
                e34 e34Var = z24Var.R;
                if (z24Var.N == y24Var.b) {
                    arrayList2.remove(arrayList);
                    z24Var.F = y24Var.c;
                    z24Var.G = y24Var.d;
                    z24Var.H = y24Var.e;
                    z24Var.I = y24Var.f;
                    z24Var.J = arrayList2;
                    z24Var.K = y24Var.n;
                    z24Var.L = new ArrayList(arrayList);
                    e34Var.H0.d(false);
                    y59 adapter = e34Var.E0.getAdapter();
                    z24 z24Var2 = e34Var.A0;
                    if (adapter != z24Var2) {
                        e34Var.E0.setAdapter(z24Var2);
                    }
                    z24Var.f();
                    return;
                }
                return;
        }
    }
}
