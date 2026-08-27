package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.aq0;

public final class pb implements RequestDelegate {

    public final int f21245a = 0;

    public final int f21246b;

    public final boolean f21247c;
    public final TLRPC.User d;

    public final NotificationCenter.NotificationCenterDelegate f21248e;

    public final Object f21249f;

    public pb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f21248e = messagesController;
        this.f21246b = i10;
        this.f21249f = chat;
        this.d = user;
        this.f21247c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21245a) {
            case 0:
                ((MessagesController) this.f21248e).lambda$pinMessage$130(this.f21246b, (TLRPC.Chat) this.f21249f, this.d, this.f21247c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new r1((aq0) this.f21248e, (String) this.f21249f, this.f21246b, tLObject, this.f21247c, this.d));
                break;
        }
    }

    public pb(aq0 aq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f21248e = aq0Var;
        this.f21249f = str;
        this.f21246b = i10;
        this.f21247c = z10;
        this.d = user;
    }
}
