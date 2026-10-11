package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zn;
public final class r7 extends s7 {
    public final TLRPC.Chat f5908b;

    public r7(String str, TLRPC.Chat chat) {
        super(str);
        this.f5908b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f5908b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.m2 m2Var) {
        m2Var.presentFragment(zn.W9(-this.f5908b.f20032id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        TLRPC.Chat chat = this.f5908b;
        j9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, j9Var);
    }
}
