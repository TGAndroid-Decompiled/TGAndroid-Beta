package ai;

import org.telegram.messenger.w10;
public final class e0 implements Runnable {
    public final int f1177a = 1;
    public final String f1178b;
    public final w10 f1179c;

    public e0(String str, w10 w10Var) {
        this.f1178b = str;
        this.f1179c = w10Var;
    }

    @Override
    public final void run() {
        switch (this.f1177a) {
            case 0:
                this.f1179c.a(this.f1178b);
                return;
            default:
                org.telegram.messenger.g0.g3(new c1.a(19, this.f1179c, ci.f.c(this.f1178b, org.telegram.messenger.g0.L(240.0f), gc.b.M, 0.75f, null)));
                return;
        }
    }

    public e0(w10 w10Var, String str) {
        this.f1179c = w10Var;
        this.f1178b = str;
    }
}
