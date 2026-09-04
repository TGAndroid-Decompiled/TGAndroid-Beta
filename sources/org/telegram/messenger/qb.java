package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.br0;
public final class qb implements RequestDelegate {
    public final int f18778a = 0;
    public final int f18779b;
    public final boolean f18780c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f18781e;
    public final Object f18782f;

    public qb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f18781e = messagesController;
        this.f18779b = i10;
        this.f18782f = chat;
        this.d = user;
        this.f18780c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18778a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f18780c;
                ((MessagesController) this.f18781e).lambda$pinMessage$130(this.f18779b, (TLRPC.Chat) this.f18782f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ji.q2((br0) this.f18781e, (String) this.f18782f, this.f18779b, tLObject, this.f18780c, this.d));
                return;
        }
    }

    public qb(br0 br0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f18781e = br0Var;
        this.f18782f = str;
        this.f18779b = i10;
        this.f18780c = z10;
        this.d = user;
    }
}
