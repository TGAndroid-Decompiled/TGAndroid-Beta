package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.br0;
public final class xb implements RequestDelegate {
    public final int f16959a = 0;
    public final int f16960b;
    public final boolean f16961c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f16962f;

    public xb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f16960b = i10;
        this.f16962f = chat;
        this.d = user;
        this.f16961c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16959a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f16961c;
                ((MessagesController) this.e).lambda$pinMessage$130(this.f16960b, (TLRPC.Chat) this.f16962f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new hi.u2((br0) this.e, (String) this.f16962f, this.f16960b, tLObject, this.f16961c, this.d));
                return;
        }
    }

    public xb(br0 br0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = br0Var;
        this.f16962f = str;
        this.f16960b = i10;
        this.f16961c = z10;
        this.d = user;
    }
}
