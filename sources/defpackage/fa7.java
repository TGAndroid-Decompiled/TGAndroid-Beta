package defpackage;

import org.telegram.tgnet.TLRPC;
public final class fa7 implements Runnable {
    public final byte a;
    public final ac7 b;
    public final TLRPC.TL_error c;

    public fa7(ac7 ac7Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = ac7Var;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        ac7 ac7Var = this.b;
        switch (b) {
            case 0:
                ac7Var.b(tL_error);
                return;
            default:
                ac7Var.b(tL_error);
                return;
        }
    }
}
