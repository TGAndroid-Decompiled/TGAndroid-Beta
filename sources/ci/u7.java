package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bo;
public final class u7 extends v7 {
    public final TLRPC.Chat f5632b;

    public u7(String str, TLRPC.Chat chat) {
        super(str);
        this.f5632b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f5632b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(bo.R9(-this.f5632b.f18121id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.f5632b;
        f9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, f9Var);
    }
}
