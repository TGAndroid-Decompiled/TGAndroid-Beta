package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class jq9 extends kq9 {
    public final TLRPC.Chat b;

    public jq9(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override
    public final String a() {
        return k96.M0(2131754818, null);
    }

    @Override
    public final String b() {
        return this.b.title;
    }

    @Override
    public final void c(d dVar) {
        dVar.presentFragment(mu1.W9(-this.b.id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        pb0 pb0Var = new pb0((wjb) null);
        TLRPC.Chat chat = this.b;
        pb0Var.p(chat);
        imageReceiver.U(chat, pb0Var, null);
    }
}
