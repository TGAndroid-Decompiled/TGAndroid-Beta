package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uq0;
public final class qb implements RequestDelegate {
    public final int f17122a = 0;
    public final int f17123b;
    public final boolean f17124c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f17125f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f17123b = i10;
        this.f17125f = chat;
        this.d = user;
        this.f17124c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17122a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f17124c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f17123b, (TLRPC.Chat) this.f17125f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((uq0) this.e, (String) this.f17125f, this.f17123b, tLObject, this.f17124c, this.d));
                return;
        }
    }

    public qb(uq0 uq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = uq0Var;
        this.f17125f = str;
        this.f17123b = i10;
        this.f17124c = z10;
        this.d = user;
    }
}
