package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wn;
public final class r7 extends s7 {
    public final TLRPC.Chat f5459b;

    public r7(String str, TLRPC.Chat chat) {
        super(str);
        this.f5459b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f5459b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.m2 m2Var) {
        m2Var.presentFragment(wn.R9(-this.f5459b.f18336id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        TLRPC.Chat chat = this.f5459b;
        h9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, h9Var);
    }
}
