package defpackage;

import org.telegram.tgnet.TLRPC;
public final class vt1 implements Runnable {
    public final byte a;
    public final ju1 b;
    public final TLRPC.Chat c;

    public vt1(ju1 ju1Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = ju1Var;
        this.c = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        ju1 ju1Var = this.b;
        switch (b) {
            case 0:
                d31.b0(ju1Var.a).Q(2131623990, 36, ob6.a0(null, null, 2131742467, chat.title)).k(true);
                return;
            case 1:
                ju1Var.n(chat);
                return;
            case 2:
                ju1Var.a(chat);
                return;
            default:
                ju1Var.a.Ba(chat);
                return;
        }
    }
}
