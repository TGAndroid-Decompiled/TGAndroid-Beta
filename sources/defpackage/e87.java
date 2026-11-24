package defpackage;

import org.telegram.tgnet.TLRPC;
public final class e87 implements Runnable {
    public final byte a;
    public final z97 b;
    public final TLRPC.TL_error c;

    public e87(z97 z97Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = z97Var;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        z97 z97Var = this.b;
        switch (b) {
            case 0:
                z97Var.b(tL_error);
                return;
            default:
                z97Var.b(tL_error);
                return;
        }
    }
}
