package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bn;
public final class l6 extends m6 {
    public final TLRPC.Chat f15007b;

    public l6(String str, TLRPC.Chat chat) {
        super(str);
        this.f15007b = chat;
    }

    @Override
    public final String a() {
        return hd.N0(2131754818, null);
    }

    @Override
    public final String b() {
        return this.f15007b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        g2Var.presentFragment(bn.ua(-this.f15007b.f28434id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        TLRPC.Chat chat = this.f15007b;
        b9Var.q(chat);
        imageReceiver.i0(chat, b9Var, null);
    }
}
