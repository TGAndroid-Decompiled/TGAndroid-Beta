package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hq0;
public final class sb implements RequestDelegate {
    public final int f19967a = 0;
    public final int f19968b;
    public final boolean f19969c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f19970e;
    public final Object f19971f;

    public sb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z4) {
        this.f19970e = messagesController;
        this.f19968b = i10;
        this.f19971f = chat;
        this.d = user;
        this.f19969c = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19967a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z4 = this.f19969c;
                ((MessagesController) this.f19970e).lambda$pinMessage$130(this.f19968b, (TLRPC.Chat) this.f19971f, user, z4, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1((hq0) this.f19970e, (String) this.f19971f, this.f19968b, tLObject, this.f19969c, this.d));
                return;
        }
    }

    public sb(hq0 hq0Var, String str, int i10, boolean z4, TLRPC.User user) {
        this.f19970e = hq0Var;
        this.f19971f = str;
        this.f19968b = i10;
        this.f19969c = z4;
        this.d = user;
    }
}
