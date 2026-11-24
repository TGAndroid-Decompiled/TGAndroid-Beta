package defpackage;

import org.telegram.tgnet.TLRPC;
public final class it1 implements Runnable {
    public final byte a;
    public final wt1 b;
    public final TLRPC.Chat c;

    public it1(wt1 wt1Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = wt1Var;
        this.c = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        wt1 wt1Var = this.b;
        switch (b) {
            case 0:
                wt1Var.j(chat);
                return;
            case 1:
                wt1Var.a(chat);
                return;
            case 2:
                wt1Var.a.oa(chat);
                return;
            default:
                u21.b0(wt1Var.a).Q(2131623990, 36, k96.a0(null, null, 2131742573, chat.title)).k(true);
                return;
        }
    }
}
