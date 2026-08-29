package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zp0;
public final class rb implements RequestDelegate {
    public final int f21427a = 0;
    public final int f21428b;
    public final boolean f21429c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f21430e;
    public final Object f21431f;

    public rb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f21430e = messagesController;
        this.f21428b = i10;
        this.f21431f = chat;
        this.d = user;
        this.f21429c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21427a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f21429c;
                ((MessagesController) this.f21430e).lambda$pinMessage$130(this.f21428b, (TLRPC.Chat) this.f21431f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1((zp0) this.f21430e, (String) this.f21431f, this.f21428b, tLObject, this.f21429c, this.d));
                return;
        }
    }

    public rb(zp0 zp0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f21430e = zp0Var;
        this.f21431f = str;
        this.f21428b = i10;
        this.f21429c = z10;
        this.d = user;
    }
}
