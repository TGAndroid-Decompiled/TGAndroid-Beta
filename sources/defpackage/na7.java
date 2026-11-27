package defpackage;

import org.telegram.tgnet.TLRPC;
public final class na7 implements Runnable {
    public final byte a;
    public final gc7 b;
    public final TLRPC.TL_error c;

    public na7(gc7 gc7Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = gc7Var;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        gc7 gc7Var = this.b;
        switch (b) {
            case 0:
                gc7Var.b(tL_error);
                return;
            default:
                gc7Var.b(tL_error);
                return;
        }
    }
}
