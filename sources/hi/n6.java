package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.an;
public final class n6 extends o6 {
    public final TLRPC.Chat f14763b;

    public n6(String str, TLRPC.Chat chat) {
        super(str);
        this.f14763b = chat;
    }

    @Override
    public final String a() {
        return hd.M0(2131754819, null);
    }

    @Override
    public final String b() {
        return this.f14763b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.e2 e2Var) {
        e2Var.presentFragment(an.ua(-this.f14763b.f28051id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        TLRPC.Chat chat = this.f14763b;
        t8Var.q(chat);
        imageReceiver.i0(chat, t8Var, null);
    }
}
