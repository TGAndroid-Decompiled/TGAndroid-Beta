package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hr0;
public final class xb implements RequestDelegate {
    public final int f19008a = 0;
    public final int f19009b;
    public final boolean f19010c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f19011f;

    public xb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f19009b = i10;
        this.f19011f = chat;
        this.d = user;
        this.f19010c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19008a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19010c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f19009b, (TLRPC.Chat) this.f19011f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ji.r2((hr0) this.e, (String) this.f19011f, this.f19009b, tLObject, this.f19010c, this.d));
                return;
        }
    }

    public xb(hr0 hr0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = hr0Var;
        this.f19011f = str;
        this.f19009b = i10;
        this.f19010c = z10;
        this.d = user;
    }
}
