package defpackage;

import org.telegram.tgnet.TLRPC;
public final class c57 implements Runnable {
    public final byte a;
    public final na7 b;
    public final TLRPC.User c;

    public c57(na7 na7Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.Z2(user, na7Var.k1, true, null);
                return;
            case 1:
                na7Var.h1.remove(Long.valueOf(user.id));
                return;
            default:
                na7Var.getContactsController().a(user);
                return;
        }
    }
}
