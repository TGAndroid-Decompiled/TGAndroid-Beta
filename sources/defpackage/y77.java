package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y77 implements Runnable {
    public final byte a;
    public final na7 b;
    public final TLRPC.Updates c;
    public final boolean d;

    public y77(na7 na7Var, TLRPC.Updates updates, boolean z, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = updates;
        this.d = z;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.d.c(new y77(this.b, this.c, this.d, (byte) 1));
                return;
            default:
                this.b.R3(this.c, this.d);
                return;
        }
    }
}
