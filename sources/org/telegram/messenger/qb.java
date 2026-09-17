package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cr0;
public final class qb implements RequestDelegate {
    public final int f17139a = 0;
    public final int f17140b;
    public final boolean f17141c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f17142f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f17140b = i10;
        this.f17142f = chat;
        this.d = user;
        this.f17141c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17139a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f17141c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f17140b, (TLRPC.Chat) this.f17142f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.r2((cr0) this.e, (String) this.f17142f, this.f17140b, tLObject, this.f17141c, this.d));
                return;
        }
    }

    public qb(cr0 cr0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = cr0Var;
        this.f17142f = str;
        this.f17140b = i10;
        this.f17141c = z10;
        this.d = user;
    }
}
