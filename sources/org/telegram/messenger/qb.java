package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tq0;
public final class qb implements RequestDelegate {
    public final int f17360a = 0;
    public final int f17361b;
    public final boolean f17362c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f17363f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f17361b = i10;
        this.f17363f = chat;
        this.d = user;
        this.f17362c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17360a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f17362c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f17361b, (TLRPC.Chat) this.f17363f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((tq0) this.e, (String) this.f17363f, this.f17361b, tLObject, this.f17362c, this.d));
                return;
        }
    }

    public qb(tq0 tq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = tq0Var;
        this.f17363f = str;
        this.f17361b = i10;
        this.f17362c = z10;
        this.d = user;
    }
}
