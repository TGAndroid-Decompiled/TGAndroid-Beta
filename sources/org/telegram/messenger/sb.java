package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kq0;
public final class sb implements RequestDelegate {
    public final int f19487a = 0;
    public final int f19488b;
    public final boolean f19489c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f19490f;

    public sb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f19488b = i10;
        this.f19490f = chat;
        this.d = user;
        this.f19489c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19487a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19489c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f19488b, (TLRPC.Chat) this.f19490f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ki.r2((kq0) this.e, (String) this.f19490f, this.f19488b, tLObject, this.f19489c, this.d));
                return;
        }
    }

    public sb(kq0 kq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = kq0Var;
        this.f19490f = str;
        this.f19488b = i10;
        this.f19489c = z10;
        this.d = user;
    }
}
