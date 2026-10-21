package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jq0;
public final class ub implements RequestDelegate {
    public final int f19657a = 0;
    public final int f19658b;
    public final boolean f19659c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f19660f;

    public ub(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f19658b = i10;
        this.f19660f = chat;
        this.d = user;
        this.f19659c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19657a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19659c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f19658b, (TLRPC.Chat) this.f19660f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ki.r2((jq0) this.e, (String) this.f19660f, this.f19658b, tLObject, this.f19659c, this.d));
                return;
        }
    }

    public ub(jq0 jq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = jq0Var;
        this.f19660f = str;
        this.f19658b = i10;
        this.f19659c = z10;
        this.d = user;
    }
}
