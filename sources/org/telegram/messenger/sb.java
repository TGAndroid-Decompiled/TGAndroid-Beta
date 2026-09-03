package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mq0;
public final class sb implements RequestDelegate {
    public final int f18362a = 0;
    public final int f18363b;
    public final boolean f18364c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f18365f;

    public sb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z4) {
        this.e = messagesController;
        this.f18363b = i10;
        this.f18365f = chat;
        this.d = user;
        this.f18364c = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18362a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z4 = this.f18364c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f18363b, (TLRPC.Chat) this.f18365f, user, z4, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1((mq0) this.e, (String) this.f18365f, this.f18363b, tLObject, this.f18364c, this.d));
                return;
        }
    }

    public sb(mq0 mq0Var, String str, int i10, boolean z4, TLRPC.User user) {
        this.e = mq0Var;
        this.f18365f = str;
        this.f18363b = i10;
        this.f18364c = z4;
        this.d = user;
    }
}
