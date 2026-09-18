package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cr0;
public final class qb implements RequestDelegate {
    public final int f17307a = 0;
    public final int f17308b;
    public final boolean f17309c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f17310f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f17308b = i10;
        this.f17310f = chat;
        this.d = user;
        this.f17309c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17307a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f17309c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f17308b, (TLRPC.Chat) this.f17310f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.r2((cr0) this.e, (String) this.f17310f, this.f17308b, tLObject, this.f17309c, this.d));
                return;
        }
    }

    public qb(cr0 cr0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = cr0Var;
        this.f17310f = str;
        this.f17308b = i10;
        this.f17309c = z10;
        this.d = user;
    }
}
