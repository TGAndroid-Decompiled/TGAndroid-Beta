package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bn;
public final class m6 extends n6 {
    public final TLRPC.Chat f15033b;

    public m6(String str, TLRPC.Chat chat) {
        super(str);
        this.f15033b = chat;
    }

    @Override
    public final String a() {
        return gd.M0(2131754819, null);
    }

    @Override
    public final String b() {
        return this.f15033b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.h2 h2Var) {
        h2Var.presentFragment(bn.ua(-this.f15033b.f28405id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        TLRPC.Chat chat = this.f15033b;
        b9Var.q(chat);
        imageReceiver.i0(chat, b9Var, null);
    }
}
