package ai;

import org.telegram.messenger.z10;
public final class h0 implements Runnable {
    public final int f1220a = 1;
    public final String f1221b;
    public final z10 f1222c;

    public h0(String str, z10 z10Var) {
        this.f1221b = str;
        this.f1222c = z10Var;
    }

    @Override
    public final void run() {
        switch (this.f1220a) {
            case 0:
                this.f1222c.a(this.f1221b);
                return;
            default:
                org.telegram.messenger.g0.h3(new c1.c(18, this.f1222c, ci.f.c(this.f1221b, org.telegram.messenger.g0.L(240.0f), gc.c.M, 0.75f, null)));
                return;
        }
    }

    public h0(z10 z10Var, String str) {
        this.f1222c = z10Var;
        this.f1221b = str;
    }
}
