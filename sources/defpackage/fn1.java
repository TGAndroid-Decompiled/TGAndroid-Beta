package defpackage;

import org.telegram.tgnet.TLRPC;
public final class fn1 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final TLRPC.User c;

    public fn1(mu1 mu1Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.presentFragment(mu1.U9(user.id));
                return;
            default:
                mu1Var.qa(user);
                return;
        }
    }
}
