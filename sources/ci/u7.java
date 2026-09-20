package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zn;
public final class u7 extends v7 {
    public final TLRPC.Chat f5633b;

    public u7(String str, TLRPC.Chat chat) {
        super(str);
        this.f5633b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f5633b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(zn.R9(-this.f5633b.f18328id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.f5633b;
        g9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, g9Var);
    }
}
