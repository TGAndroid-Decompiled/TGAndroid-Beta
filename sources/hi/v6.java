package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bn;
public final class v6 extends w6 {
    public final TLRPC.Chat f15604b;

    public v6(String str, TLRPC.Chat chat) {
        super(str);
        this.f15604b = chat;
    }

    @Override
    public final String a() {
        return gd.N0(2131754818, null);
    }

    @Override
    public final String b() {
        return this.f15604b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        g2Var.presentFragment(bn.ua(-this.f15604b.f28492id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        TLRPC.Chat chat = this.f15604b;
        a9Var.q(chat);
        imageReceiver.j0(chat, a9Var, null);
    }
}
