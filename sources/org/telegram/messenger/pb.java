package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.br0;
public final class pb implements RequestDelegate {
    public final int f18725a = 0;
    public final int f18726b;
    public final boolean f18727c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f18728e;
    public final Object f18729f;

    public pb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f18728e = messagesController;
        this.f18726b = i10;
        this.f18729f = chat;
        this.d = user;
        this.f18727c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18725a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f18727c;
                ((MessagesController) this.f18728e).lambda$pinMessage$130(this.f18726b, (TLRPC.Chat) this.f18729f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ji.q2((br0) this.f18728e, (String) this.f18729f, this.f18726b, tLObject, this.f18727c, this.d));
                return;
        }
    }

    public pb(br0 br0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f18728e = br0Var;
        this.f18729f = str;
        this.f18726b = i10;
        this.f18727c = z10;
        this.d = user;
    }
}
