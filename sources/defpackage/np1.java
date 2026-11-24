package defpackage;

import org.telegram.tgnet.TLRPC;
public final class np1 implements Runnable {
    public final byte a = 0;
    public final yv1 b;
    public final TLRPC.TL_error c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public np1(yv1 yv1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = yv1Var;
        this.d = tL_attachMenuBot;
        this.c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.e;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.d;
        TLRPC.TL_error tL_error = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.i9(tL_attachMenuBot, tL_error, user);
                return;
            default:
                yv1Var.k9(tL_attachMenuBot, tL_error, user);
                return;
        }
    }

    public np1(yv1 yv1Var, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = yv1Var;
        this.c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
