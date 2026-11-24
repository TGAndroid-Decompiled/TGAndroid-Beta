package defpackage;

import org.telegram.tgnet.TLRPC;
public final class do1 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final TLRPC.User c;

    public do1(yv1 yv1Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.presentFragment(yv1.ga(user.id));
                return;
            default:
                yv1Var.Ca(user);
                return;
        }
    }
}
