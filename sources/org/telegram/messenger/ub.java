package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.br0;
public final class ub implements RequestDelegate {
    public final int f19333a = 0;
    public final int f19334b;
    public final boolean f19335c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f19336e;
    public final Object f19337f;

    public ub(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f19336e = messagesController;
        this.f19334b = i10;
        this.f19337f = chat;
        this.d = user;
        this.f19335c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19333a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19335c;
                ((MessagesController) this.f19336e).lambda$pinMessage$129(this.f19334b, (TLRPC.Chat) this.f19337f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((br0) this.f19336e, (String) this.f19337f, this.f19334b, tLObject, this.f19335c, this.d));
                return;
        }
    }

    public ub(br0 br0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f19336e = br0Var;
        this.f19337f = str;
        this.f19334b = i10;
        this.f19335c = z10;
        this.d = user;
    }
}
