package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ar0;
public final class ub implements RequestDelegate {
    public final int f19335a = 0;
    public final int f19336b;
    public final boolean f19337c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f19338e;
    public final Object f19339f;

    public ub(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f19338e = messagesController;
        this.f19336b = i10;
        this.f19339f = chat;
        this.d = user;
        this.f19337c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19335a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19337c;
                ((MessagesController) this.f19338e).lambda$pinMessage$129(this.f19336b, (TLRPC.Chat) this.f19339f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((ar0) this.f19338e, (String) this.f19339f, this.f19336b, tLObject, this.f19337c, this.d));
                return;
        }
    }

    public ub(ar0 ar0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f19338e = ar0Var;
        this.f19339f = str;
        this.f19336b = i10;
        this.f19337c = z10;
        this.d = user;
    }
}
