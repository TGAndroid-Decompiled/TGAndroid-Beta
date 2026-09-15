package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ar0;
public final class qb implements RequestDelegate {
    public final int f17130a = 0;
    public final int f17131b;
    public final boolean f17132c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f17133f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f17131b = i10;
        this.f17133f = chat;
        this.d = user;
        this.f17132c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17130a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f17132c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f17131b, (TLRPC.Chat) this.f17133f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.r2((ar0) this.e, (String) this.f17133f, this.f17131b, tLObject, this.f17132c, this.d));
                return;
        }
    }

    public qb(ar0 ar0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = ar0Var;
        this.f17133f = str;
        this.f17131b = i10;
        this.f17132c = z10;
        this.d = user;
    }
}
