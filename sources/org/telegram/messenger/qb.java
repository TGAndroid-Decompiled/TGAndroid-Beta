package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wq0;
public final class qb implements RequestDelegate {
    public final int f17371a = 0;
    public final int f17372b;
    public final boolean f17373c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f17374f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f17372b = i10;
        this.f17374f = chat;
        this.d = user;
        this.f17373c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17371a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f17373c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f17372b, (TLRPC.Chat) this.f17374f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((wq0) this.e, (String) this.f17374f, this.f17372b, tLObject, this.f17373c, this.d));
                return;
        }
    }

    public qb(wq0 wq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = wq0Var;
        this.f17374f = str;
        this.f17372b = i10;
        this.f17373c = z10;
        this.d = user;
    }
}
