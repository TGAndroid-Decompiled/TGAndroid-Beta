package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ar0;
public final class ub implements RequestDelegate {
    public final int f19371a = 0;
    public final int f19372b;
    public final boolean f19373c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f19374e;
    public final Object f19375f;

    public ub(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f19374e = messagesController;
        this.f19372b = i10;
        this.f19375f = chat;
        this.d = user;
        this.f19373c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19371a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19373c;
                ((MessagesController) this.f19374e).lambda$pinMessage$129(this.f19372b, (TLRPC.Chat) this.f19375f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((ar0) this.f19374e, (String) this.f19375f, this.f19372b, tLObject, this.f19373c, this.d));
                return;
        }
    }

    public ub(ar0 ar0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f19374e = ar0Var;
        this.f19375f = str;
        this.f19372b = i10;
        this.f19373c = z10;
        this.d = user;
    }
}
