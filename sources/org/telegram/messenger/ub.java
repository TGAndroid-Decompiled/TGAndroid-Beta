package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.br0;
public final class ub implements RequestDelegate {
    public final int f19337a = 0;
    public final int f19338b;
    public final boolean f19339c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f19340e;
    public final Object f19341f;

    public ub(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f19340e = messagesController;
        this.f19338b = i10;
        this.f19341f = chat;
        this.d = user;
        this.f19339c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19337a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19339c;
                ((MessagesController) this.f19340e).lambda$pinMessage$129(this.f19338b, (TLRPC.Chat) this.f19341f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((br0) this.f19340e, (String) this.f19341f, this.f19338b, tLObject, this.f19339c, this.d));
                return;
        }
    }

    public ub(br0 br0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f19340e = br0Var;
        this.f19341f = str;
        this.f19338b = i10;
        this.f19339c = z10;
        this.d = user;
    }
}
