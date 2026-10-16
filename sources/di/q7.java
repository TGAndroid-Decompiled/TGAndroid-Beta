package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fo;
public final class q7 extends r7 {
    public final TLRPC.Chat f7652b;

    public q7(String str, TLRPC.Chat chat) {
        super(str);
        this.f7652b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f7652b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.m2 m2Var) {
        m2Var.presentFragment(fo.W9(-this.f7652b.f18916id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.Chat chat = this.f7652b;
        k9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, k9Var);
    }
}
