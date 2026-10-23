package ei;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sn;
public final class h7 extends i7 {
    public final TLRPC.Chat f9171b;

    public h7(String str, TLRPC.Chat chat) {
        super(str);
        this.f9171b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f9171b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(sn.W9(-this.f9171b.f20343id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat chat = this.f9171b;
        h9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, h9Var);
    }
}
