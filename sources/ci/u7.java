package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zn;
public final class u7 extends v7 {
    public final TLRPC.Chat f5631b;

    public u7(String str, TLRPC.Chat chat) {
        super(str);
        this.f5631b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f5631b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(zn.R9(-this.f5631b.f18343id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.f5631b;
        g9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, g9Var);
    }
}
