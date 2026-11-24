package defpackage;

import org.telegram.messenger.Utilities;
public final class z51 implements Runnable {
    public final byte a;
    public final r61 b;
    public final p c;
    public final h61 d;

    public z51(r61 r61Var, p pVar, h61 h61Var, byte b) {
        this.a = b;
        this.b = r61Var;
        this.c = pVar;
        this.d = h61Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.e.c(new z51(this.b, this.c, this.d, (byte) 1));
                return;
            default:
                this.b.f0(this.c, this.d);
                return;
        }
    }
}
