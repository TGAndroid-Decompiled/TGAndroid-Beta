package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class bu9 extends cu9 {
    public final TLRPC.Chat b;

    public bu9(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override
    public final String a() {
        return ob6.M0(2131754814, null);
    }

    @Override
    public final String b() {
        return this.b.title;
    }

    @Override
    public final void c(e eVar) {
        eVar.presentFragment(zu1.ha(-this.b.id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        rb0 rb0Var = new rb0((vnb) null);
        TLRPC.Chat chat = this.b;
        rb0Var.p(chat);
        imageReceiver.U(chat, rb0Var, null);
    }
}
