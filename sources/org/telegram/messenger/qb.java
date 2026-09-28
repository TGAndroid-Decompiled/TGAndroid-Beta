package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tq0;
public final class qb implements RequestDelegate {
    public final int f17374a = 0;
    public final int f17375b;
    public final boolean f17376c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f17377f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f17375b = i10;
        this.f17377f = chat;
        this.d = user;
        this.f17376c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17374a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f17376c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f17375b, (TLRPC.Chat) this.f17377f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((tq0) this.e, (String) this.f17377f, this.f17375b, tLObject, this.f17376c, this.d));
                return;
        }
    }

    public qb(tq0 tq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = tq0Var;
        this.f17377f = str;
        this.f17375b = i10;
        this.f17376c = z10;
        this.d = user;
    }
}
