package defpackage;

import org.telegram.tgnet.TLRPC;
public final class f77 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final TLRPC.User c;

    public f77(uc7 uc7Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.f3(user, uc7Var.k1, true, null);
                return;
            case 1:
                uc7Var.h1.remove(Long.valueOf(user.id));
                return;
            default:
                uc7Var.getContactsController().a(user);
                return;
        }
    }
}
