package kh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qn;
public final class i7 extends j7 {
    public final TLRPC.Chat f15430b;

    public i7(String str, TLRPC.Chat chat) {
        super(str);
        this.f15430b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f15430b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(qn.R9(-this.f15430b.f22380id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        TLRPC.Chat chat = this.f15430b;
        z8Var.q(chat);
        imageReceiver.setForUserOrChat(chat, z8Var);
    }
}
