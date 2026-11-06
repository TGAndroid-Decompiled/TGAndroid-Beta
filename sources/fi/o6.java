package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.an;
public final class o6 extends p6 {
    public final TLRPC.Chat f12561b;

    public o6(String str, TLRPC.Chat chat) {
        super(str);
        this.f12561b = chat;
    }

    @Override
    public final String a() {
        return hd.M0(2131754819, null);
    }

    @Override
    public final String b() {
        return this.f12561b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        f2Var.presentFragment(an.ra(-this.f12561b.f26953id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.f12561b;
        w8Var.q(chat);
        imageReceiver.i0(chat, w8Var, null);
    }
}
