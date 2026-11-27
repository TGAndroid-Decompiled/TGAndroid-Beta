package defpackage;

import org.telegram.messenger.Utilities;
public final class h61 implements Runnable {
    public final byte a;
    public final z61 b;
    public final p c;
    public final p61 d;

    public h61(z61 z61Var, p pVar, p61 p61Var, byte b) {
        this.a = b;
        this.b = z61Var;
        this.c = pVar;
        this.d = p61Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.e.c(new h61(this.b, this.c, this.d, (byte) 1));
                return;
            default:
                this.b.f0(this.c, this.d);
                return;
        }
    }
}
