package gi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wm;
public final class p6 extends q6 {
    public final TLRPC.Chat f13381b;

    public p6(String str, TLRPC.Chat chat) {
        super(str);
        this.f13381b = chat;
    }

    @Override
    public final String a() {
        return bd.M0(2131754819, null);
    }

    @Override
    public final String b() {
        return this.f13381b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.d2 d2Var) {
        d2Var.presentFragment(wm.ra(-this.f13381b.f27001id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        TLRPC.Chat chat = this.f13381b;
        u8Var.q(chat);
        imageReceiver.i0(chat, u8Var, null);
    }
}
