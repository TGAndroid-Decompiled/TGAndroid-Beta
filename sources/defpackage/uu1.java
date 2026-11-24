package defpackage;

import org.telegram.tgnet.TLRPC;
public final class uu1 implements Runnable {
    public final byte a;
    public final iv1 b;
    public final TLRPC.Chat c;

    public uu1(iv1 iv1Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = iv1Var;
        this.c = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        iv1 iv1Var = this.b;
        switch (b) {
            case 0:
                iv1Var.n(chat);
                return;
            case 1:
                iv1Var.a(chat);
                return;
            case 2:
                iv1Var.a.Aa(chat);
                return;
            default:
                c41.b0(iv1Var.a).Q(2131623990, 36, jb6.a0(null, null, 2131742499, chat.title)).k(true);
                return;
        }
    }
}
