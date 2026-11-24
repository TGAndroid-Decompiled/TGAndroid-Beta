package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ks9 extends ls9 {
    public final TLRPC.Chat b;

    public ks9(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override
    public final String a() {
        return jb6.M0(2131754818, null);
    }

    @Override
    public final String b() {
        return this.b.title;
    }

    @Override
    public final void c(d dVar) {
        dVar.presentFragment(yv1.ga(-this.b.id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        pc0 pc0Var = new pc0((ylb) null);
        TLRPC.Chat chat = this.b;
        pc0Var.p(chat);
        imageReceiver.U(chat, pc0Var, null);
    }
}
