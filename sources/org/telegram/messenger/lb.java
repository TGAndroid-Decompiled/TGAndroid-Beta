package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zp0;
public final class lb implements RequestDelegate {
    public final int f20866a = 0;
    public final int f20867b;
    public final boolean f20868c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f20869e;
    public final Object f20870f;

    public lb(MessagesController messagesController, int i9, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f20869e = messagesController;
        this.f20867b = i9;
        this.f20870f = chat;
        this.d = user;
        this.f20868c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20866a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f20868c;
                ((MessagesController) this.f20869e).lambda$pinMessage$130(this.f20867b, (TLRPC.Chat) this.f20870f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1((zp0) this.f20869e, (String) this.f20870f, this.f20867b, tLObject, this.f20868c, this.d));
                return;
        }
    }

    public lb(zp0 zp0Var, String str, int i9, boolean z10, TLRPC.User user) {
        this.f20869e = zp0Var;
        this.f20870f = str;
        this.f20867b = i9;
        this.f20868c = z10;
        this.d = user;
    }
}
