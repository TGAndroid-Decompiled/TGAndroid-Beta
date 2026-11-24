package defpackage;

import org.telegram.tgnet.TLRPC;
public final class xb4 implements Runnable {
    public final byte a;
    public final bc4 b;
    public final TLRPC.Document c;
    public final boolean d;

    public xb4(bc4 bc4Var, TLRPC.Document document, boolean z, byte b) {
        this.a = b;
        this.b = bc4Var;
        this.c = document;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Document document = this.c;
        bc4 bc4Var = this.b;
        switch (b) {
            case 0:
                bc4Var.d0(document, z);
                return;
            default:
                bc4Var.a0(document, z);
                return;
        }
    }
}
