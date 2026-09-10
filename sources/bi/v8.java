package bi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.eo;
public final class v8 extends w8 {
    public final TLRPC.Chat f3798b;

    public v8(String str, TLRPC.Chat chat) {
        super(str);
        this.f3798b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f3798b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(eo.R9(-this.f3798b.f17195id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.f3798b;
        g9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, g9Var);
    }
}
