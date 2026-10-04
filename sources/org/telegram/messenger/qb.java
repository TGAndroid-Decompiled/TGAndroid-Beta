package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wq0;
public final class qb implements RequestDelegate {
    public final int f18968a = 0;
    public final int f18969b;
    public final boolean f18970c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f18971e;
    public final Object f18972f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f18971e = messagesController;
        this.f18969b = i10;
        this.f18972f = chat;
        this.d = user;
        this.f18970c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18968a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f18970c;
                ((MessagesController) this.f18971e).lambda$pinMessage$130(this.f18969b, (TLRPC.Chat) this.f18972f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((wq0) this.f18971e, (String) this.f18972f, this.f18969b, tLObject, this.f18970c, this.d));
                return;
        }
    }

    public qb(wq0 wq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f18971e = wq0Var;
        this.f18972f = str;
        this.f18969b = i10;
        this.f18970c = z10;
        this.d = user;
    }
}
