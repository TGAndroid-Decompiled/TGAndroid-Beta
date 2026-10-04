package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wq0;
public final class qb implements RequestDelegate {
    public final int f18967a = 0;
    public final int f18968b;
    public final boolean f18969c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f18970e;
    public final Object f18971f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f18970e = messagesController;
        this.f18968b = i10;
        this.f18971f = chat;
        this.d = user;
        this.f18969c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18967a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f18969c;
                ((MessagesController) this.f18970e).lambda$pinMessage$130(this.f18968b, (TLRPC.Chat) this.f18971f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((wq0) this.f18970e, (String) this.f18971f, this.f18968b, tLObject, this.f18969c, this.d));
                return;
        }
    }

    public qb(wq0 wq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f18970e = wq0Var;
        this.f18971f = str;
        this.f18968b = i10;
        this.f18969c = z10;
        this.d = user;
    }
}
