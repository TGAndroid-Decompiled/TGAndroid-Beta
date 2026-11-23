package ai;

import org.telegram.messenger.y10;
public final class i0 implements Runnable {
    public final int f1234a = 1;
    public final String f1235b;
    public final y10 f1236c;

    public i0(String str, y10 y10Var) {
        this.f1235b = str;
        this.f1236c = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f1234a) {
            case 0:
                this.f1236c.a(this.f1235b);
                return;
            default:
                org.telegram.messenger.g0.g3(new c1.a(19, this.f1236c, ci.f.c(this.f1235b, org.telegram.messenger.g0.L(240.0f), gc.b.M, 0.75f, null)));
                return;
        }
    }

    public i0(y10 y10Var, String str) {
        this.f1236c = y10Var;
        this.f1235b = str;
    }
}
