package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jq0;
public final class xb implements RequestDelegate {
    public final int f20070a = 0;
    public final int f20071b;
    public final boolean f20072c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f20073f;

    public xb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f20071b = i10;
        this.f20073f = chat;
        this.d = user;
        this.f20072c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20070a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f20072c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f20071b, (TLRPC.Chat) this.f20073f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ki.r2((jq0) this.e, (String) this.f20073f, this.f20071b, tLObject, this.f20072c, this.d));
                return;
        }
    }

    public xb(jq0 jq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = jq0Var;
        this.f20073f = str;
        this.f20071b = i10;
        this.f20072c = z10;
        this.d = user;
    }
}
