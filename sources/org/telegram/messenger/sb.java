package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fq0;
public final class sb implements RequestDelegate {
    public final int f18382a = 0;
    public final int f18383b;
    public final boolean f18384c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f18385f;

    public sb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z4) {
        this.e = messagesController;
        this.f18383b = i10;
        this.f18385f = chat;
        this.d = user;
        this.f18384c = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18382a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z4 = this.f18384c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f18383b, (TLRPC.Chat) this.f18385f, user, z4, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1((fq0) this.e, (String) this.f18385f, this.f18383b, tLObject, this.f18384c, this.d));
                return;
        }
    }

    public sb(fq0 fq0Var, String str, int i10, boolean z4, TLRPC.User user) {
        this.e = fq0Var;
        this.f18385f = str;
        this.f18383b = i10;
        this.f18384c = z4;
        this.d = user;
    }
}
