package defpackage;

import org.telegram.tgnet.TLRPC;
public final class c77 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final TLRPC.User c;

    public c77(oc7 oc7Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.b3(user, oc7Var.k1, true, null);
                return;
            case 1:
                oc7Var.h1.remove(Long.valueOf(user.id));
                return;
            default:
                oc7Var.getContactsController().a(user);
                return;
        }
    }
}
