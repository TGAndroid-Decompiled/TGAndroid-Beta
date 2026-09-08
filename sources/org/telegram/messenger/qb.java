package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.br0;
public final class qb implements RequestDelegate {
    public final int f18805a = 0;
    public final int f18806b;
    public final boolean f18807c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f18808e;
    public final Object f18809f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f18808e = messagesController;
        this.f18806b = i10;
        this.f18809f = chat;
        this.d = user;
        this.f18807c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18805a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f18807c;
                ((MessagesController) this.f18808e).lambda$pinMessage$130(this.f18806b, (TLRPC.Chat) this.f18809f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ji.q2((br0) this.f18808e, (String) this.f18809f, this.f18806b, tLObject, this.f18807c, this.d));
                return;
        }
    }

    public qb(br0 br0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f18808e = br0Var;
        this.f18809f = str;
        this.f18806b = i10;
        this.f18807c = z10;
        this.d = user;
    }
}
