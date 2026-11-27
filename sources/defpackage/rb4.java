package defpackage;

import org.telegram.tgnet.TLRPC;
public final class rb4 implements Runnable {
    public final byte a;
    public final xb4 b;
    public final TLRPC.Document c;
    public final boolean d;

    public rb4(xb4 xb4Var, TLRPC.Document document, boolean z, byte b) {
        this.a = b;
        this.b = xb4Var;
        this.c = document;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Document document = this.c;
        xb4 xb4Var = this.b;
        switch (b) {
            case 0:
                xb4Var.d0(document, z);
                return;
            default:
                xb4Var.a0(document, z);
                return;
        }
    }
}
