package defpackage;

import org.telegram.messenger.Utilities;
public final class g71 implements Runnable {
    public final byte a;
    public final y71 b;
    public final p c;
    public final o71 d;

    public g71(y71 y71Var, p pVar, o71 o71Var, byte b) {
        this.a = b;
        this.b = y71Var;
        this.c = pVar;
        this.d = o71Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.e.c(new g71(this.b, this.c, this.d, (byte) 1));
                return;
            default:
                this.b.g0(this.c, this.d);
                return;
        }
    }
}
