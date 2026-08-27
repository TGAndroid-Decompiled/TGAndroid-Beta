package lh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rn;

public final class g7 extends h7 {

    public final TLRPC.Chat f16039b;

    public g7(String str, TLRPC.Chat chat) {
        super(str);
        this.f16039b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f16039b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(rn.R9(-this.f16039b.f22380id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        TLRPC.Chat chat = this.f16039b;
        y8Var.q(chat);
        imageReceiver.setForUserOrChat(chat, y8Var);
    }
}
