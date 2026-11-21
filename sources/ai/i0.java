package ai;

import org.telegram.messenger.x10;
public final class i0 implements Runnable {
    public final int f1227a = 1;
    public final String f1228b;
    public final x10 f1229c;

    public i0(String str, x10 x10Var) {
        this.f1228b = str;
        this.f1229c = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f1227a) {
            case 0:
                this.f1229c.a(this.f1228b);
                return;
            default:
                org.telegram.messenger.g0.g3(new c1.a(19, this.f1229c, ci.f.c(this.f1228b, org.telegram.messenger.g0.L(240.0f), gc.b.M, 0.75f, null)));
                return;
        }
    }

    public i0(x10 x10Var, String str) {
        this.f1229c = x10Var;
        this.f1228b = str;
    }
}
