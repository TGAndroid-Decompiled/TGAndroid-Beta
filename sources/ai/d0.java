package ai;

import org.telegram.messenger.y10;
public final class d0 implements Runnable {
    public final int f1161a = 1;
    public final String f1162b;
    public final y10 f1163c;

    public d0(String str, y10 y10Var) {
        this.f1162b = str;
        this.f1163c = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f1161a) {
            case 0:
                this.f1163c.a(this.f1162b);
                return;
            default:
                org.telegram.messenger.g0.g3(new c1.c(17, this.f1163c, ci.f.c(this.f1162b, org.telegram.messenger.g0.L(240.0f), gc.b.M, 0.75f, null)));
                return;
        }
    }

    public d0(y10 y10Var, String str) {
        this.f1163c = y10Var;
        this.f1162b = str;
    }
}
