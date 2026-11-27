package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ro1 implements Runnable {
    public final byte a = 1;
    public final zu1 b;
    public final TLRPC.TL_attachMenuBot c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public ro1(zu1 zu1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = zu1Var;
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
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.l9(tL_attachMenuBot, tL_error, user);
                return;
            default:
                zu1Var.j9(tL_attachMenuBot, tL_error, user);
                return;
        }
    }

    public ro1(zu1 zu1Var, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = zu1Var;
        this.d = tL_error;
        this.c = tL_attachMenuBot;
        this.e = user;
    }
}
