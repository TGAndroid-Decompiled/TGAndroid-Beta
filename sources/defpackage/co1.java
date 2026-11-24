package defpackage;

import org.telegram.tgnet.TLRPC;
public final class co1 implements Runnable {
    public final byte a = 1;
    public final mu1 b;
    public final TLRPC.TL_attachMenuBot c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public co1(mu1 mu1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = mu1Var;
        this.c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.e;
        TLRPC.TL_error tL_error = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.a9(tL_attachMenuBot, tL_error, user);
                return;
            default:
                mu1Var.Y8(tL_attachMenuBot, tL_error, user);
                return;
        }
    }

    public co1(mu1 mu1Var, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = mu1Var;
        this.d = tL_error;
        this.c = tL_attachMenuBot;
        this.e = user;
    }
}
