package defpackage;

import org.telegram.tgnet.TLRPC;
public final class x94 implements Runnable {
    public final byte a;
    public final ba4 b;
    public final TLRPC.Document c;
    public final boolean d;

    public x94(ba4 ba4Var, TLRPC.Document document, boolean z, byte b) {
        this.a = b;
        this.b = ba4Var;
        this.c = document;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Document document = this.c;
        ba4 ba4Var = this.b;
        switch (b) {
            case 0:
                ba4Var.d0(document, z);
                return;
            default:
                ba4Var.a0(document, z);
                return;
        }
    }
}
