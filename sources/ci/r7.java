package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xn;
public final class r7 extends s7 {
    public final TLRPC.Chat f5456b;

    public r7(String str, TLRPC.Chat chat) {
        super(str);
        this.f5456b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f5456b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(xn.R9(-this.f5456b.f18329id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
        TLRPC.Chat chat = this.f5456b;
        h9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, h9Var);
    }
}
