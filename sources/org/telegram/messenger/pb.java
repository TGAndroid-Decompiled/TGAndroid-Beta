package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.br0;
public final class pb implements RequestDelegate {
    public final int f18698a = 0;
    public final int f18699b;
    public final boolean f18700c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f18701e;
    public final Object f18702f;

    public pb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f18701e = messagesController;
        this.f18699b = i10;
        this.f18702f = chat;
        this.d = user;
        this.f18700c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18698a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f18700c;
                ((MessagesController) this.f18701e).lambda$pinMessage$130(this.f18699b, (TLRPC.Chat) this.f18702f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ji.q2((br0) this.f18701e, (String) this.f18702f, this.f18699b, tLObject, this.f18700c, this.d));
                return;
        }
    }

    public pb(br0 br0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f18701e = br0Var;
        this.f18702f = str;
        this.f18699b = i10;
        this.f18700c = z10;
        this.d = user;
    }
}
