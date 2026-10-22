package ei;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qn;
public final class h7 extends i7 {
    public final TLRPC.Chat f9160b;

    public h7(String str, TLRPC.Chat chat) {
        super(str);
        this.f9160b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f9160b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(qn.W9(-this.f9160b.f20279id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        TLRPC.Chat chat = this.f9160b;
        h9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, h9Var);
    }
}
