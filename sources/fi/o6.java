package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn;
public final class o6 extends p6 {
    public final TLRPC.Chat f12559b;

    public o6(String str, TLRPC.Chat chat) {
        super(str);
        this.f12559b = chat;
    }

    @Override
    public final String a() {
        return id.M0(2131754819, null);
    }

    @Override
    public final String b() {
        return this.f12559b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        f2Var.presentFragment(cn.ta(-this.f12559b.f26956id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat chat = this.f12559b;
        w8Var.q(chat);
        imageReceiver.i0(chat, w8Var, null);
    }
}
