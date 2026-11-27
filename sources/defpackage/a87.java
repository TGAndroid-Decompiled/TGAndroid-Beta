package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a87 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final TLRPC.Updates c;
    public final boolean d;

    public a87(uc7 uc7Var, TLRPC.Updates updates, boolean z, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = updates;
        this.d = z;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y3(this.c, this.d);
                return;
            default:
                Utilities.d.c(new a87(this.b, this.c, this.d, (byte) 0));
                return;
        }
    }
}
