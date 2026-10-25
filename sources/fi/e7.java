package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.un;
public final class e7 extends f7 {
    public final TLRPC.Chat f10828b;

    public e7(String str, TLRPC.Chat chat) {
        super(str);
        this.f10828b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f10828b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.r2 r2Var) {
        r2Var.presentFragment(un.ba(-this.f10828b.f22027id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        TLRPC.Chat chat = this.f10828b;
        j9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, j9Var);
    }
}
