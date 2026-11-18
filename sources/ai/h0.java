package ai;

import org.telegram.messenger.x10;
public final class h0 implements Runnable {
    public final int f1214a = 1;
    public final String f1215b;
    public final x10 f1216c;

    public h0(String str, x10 x10Var) {
        this.f1215b = str;
        this.f1216c = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f1214a) {
            case 0:
                this.f1216c.a(this.f1215b);
                return;
            default:
                org.telegram.messenger.g0.g3(new c1.c(17, this.f1216c, ci.f.c(this.f1215b, org.telegram.messenger.g0.L(240.0f), gc.b.M, 0.75f, null)));
                return;
        }
    }

    public h0(x10 x10Var, String str) {
        this.f1216c = x10Var;
        this.f1215b = str;
    }
}
