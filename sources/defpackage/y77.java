package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y77 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final TLRPC.Updates c;
    public final boolean d;

    public y77(oc7 oc7Var, TLRPC.Updates updates, boolean z, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = updates;
        this.d = z;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.T3(this.c, this.d);
                return;
            default:
                Utilities.d.c(new y77(this.b, this.c, this.d, (byte) 0));
                return;
        }
    }
}
