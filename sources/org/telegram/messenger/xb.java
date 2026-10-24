package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lq0;
public final class xb implements RequestDelegate {
    public final int f20135a = 0;
    public final int f20136b;
    public final boolean f20137c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f20138f;

    public xb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f20136b = i10;
        this.f20138f = chat;
        this.d = user;
        this.f20137c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20135a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f20137c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f20136b, (TLRPC.Chat) this.f20138f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ki.r2((lq0) this.e, (String) this.f20138f, this.f20136b, tLObject, this.f20137c, this.d));
                return;
        }
    }

    public xb(lq0 lq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = lq0Var;
        this.f20138f = str;
        this.f20136b = i10;
        this.f20137c = z10;
        this.d = user;
    }
}
