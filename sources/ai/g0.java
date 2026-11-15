package ai;

import org.telegram.messenger.z10;
public final class g0 implements Runnable {
    public final int f1211a = 1;
    public final String f1212b;
    public final z10 f1213c;

    public g0(String str, z10 z10Var) {
        this.f1212b = str;
        this.f1213c = z10Var;
    }

    @Override
    public final void run() {
        switch (this.f1211a) {
            case 0:
                this.f1213c.a(this.f1212b);
                return;
            default:
                org.telegram.messenger.g0.h3(new c1.c(18, this.f1213c, ci.f.c(this.f1212b, org.telegram.messenger.g0.L(240.0f), gc.c.M, 0.75f, null)));
                return;
        }
    }

    public g0(z10 z10Var, String str) {
        this.f1213c = z10Var;
        this.f1212b = str;
    }
}
