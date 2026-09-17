package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.co;
public final class u7 extends v7 {
    public final TLRPC.Chat f8283b;

    public u7(String str, TLRPC.Chat chat) {
        super(str);
        this.f8283b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f8283b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(co.R9(-this.f8283b.f19896id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.f8283b;
        i9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, i9Var);
    }
}
