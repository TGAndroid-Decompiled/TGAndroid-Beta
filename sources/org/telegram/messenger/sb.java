package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lq0;
public final class sb implements RequestDelegate {
    public final int f19488a = 0;
    public final int f19489b;
    public final boolean f19490c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f19491f;

    public sb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f19489b = i10;
        this.f19491f = chat;
        this.d = user;
        this.f19490c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19488a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19490c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f19489b, (TLRPC.Chat) this.f19491f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ki.r2((lq0) this.e, (String) this.f19491f, this.f19489b, tLObject, this.f19490c, this.d));
                return;
        }
    }

    public sb(lq0 lq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = lq0Var;
        this.f19491f = str;
        this.f19489b = i10;
        this.f19490c = z10;
        this.d = user;
    }
}
