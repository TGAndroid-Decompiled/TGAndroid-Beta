package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wq0;
public final class qb implements RequestDelegate {
    public final int f18972a = 0;
    public final int f18973b;
    public final boolean f18974c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f18975e;
    public final Object f18976f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f18975e = messagesController;
        this.f18973b = i10;
        this.f18976f = chat;
        this.d = user;
        this.f18974c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18972a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f18974c;
                ((MessagesController) this.f18975e).lambda$pinMessage$130(this.f18973b, (TLRPC.Chat) this.f18976f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((wq0) this.f18975e, (String) this.f18976f, this.f18973b, tLObject, this.f18974c, this.d));
                return;
        }
    }

    public qb(wq0 wq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f18975e = wq0Var;
        this.f18976f = str;
        this.f18973b = i10;
        this.f18974c = z10;
        this.d = user;
    }
}
