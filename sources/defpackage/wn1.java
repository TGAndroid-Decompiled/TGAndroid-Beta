package defpackage;

import org.telegram.tgnet.TLRPC;
public final class wn1 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final TLRPC.User c;

    public wn1(zu1 zu1Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.presentFragment(zu1.ha(user.id));
                return;
            default:
                zu1Var.Da(user);
                return;
        }
    }
}
