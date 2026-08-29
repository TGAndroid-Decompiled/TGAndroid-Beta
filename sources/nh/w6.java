package nh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tn;
public final class w6 extends x6 {
    public final TLRPC.Chat f18796b;

    public w6(String str, TLRPC.Chat chat) {
        super(str);
        this.f18796b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f18796b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(tn.R9(-this.f18796b.f22392id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.Chat chat = this.f18796b;
        e9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, e9Var);
    }
}
