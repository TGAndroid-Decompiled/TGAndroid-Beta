package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jq0;
public final class ub implements RequestDelegate {
    public final int f19660a = 0;
    public final int f19661b;
    public final boolean f19662c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f19663f;

    public ub(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f19661b = i10;
        this.f19663f = chat;
        this.d = user;
        this.f19662c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19660a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19662c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f19661b, (TLRPC.Chat) this.f19663f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ki.r2((jq0) this.e, (String) this.f19663f, this.f19661b, tLObject, this.f19662c, this.d));
                return;
        }
    }

    public ub(jq0 jq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = jq0Var;
        this.f19663f = str;
        this.f19661b = i10;
        this.f19662c = z10;
        this.d = user;
    }
}
