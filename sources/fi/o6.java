package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn;
public final class o6 extends p6 {
    public final TLRPC.Chat f12563b;

    public o6(String str, TLRPC.Chat chat) {
        super(str);
        this.f12563b = chat;
    }

    @Override
    public final String a() {
        return id.M0(2131754819, null);
    }

    @Override
    public final String b() {
        return this.f12563b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        f2Var.presentFragment(cn.ta(-this.f12563b.f26960id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        TLRPC.Chat chat = this.f12563b;
        v8Var.q(chat);
        imageReceiver.i0(chat, v8Var, null);
    }
}
