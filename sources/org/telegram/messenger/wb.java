package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jq0;
public final class wb implements RequestDelegate {
    public final int f19993a = 0;
    public final int f19994b;
    public final boolean f19995c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f19996f;

    public wb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f19994b = i10;
        this.f19996f = chat;
        this.d = user;
        this.f19995c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19993a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19995c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f19994b, (TLRPC.Chat) this.f19996f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ki.r2((jq0) this.e, (String) this.f19996f, this.f19994b, tLObject, this.f19995c, this.d));
                return;
        }
    }

    public wb(jq0 jq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = jq0Var;
        this.f19996f = str;
        this.f19994b = i10;
        this.f19995c = z10;
        this.d = user;
    }
}
