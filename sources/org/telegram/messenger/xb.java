package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fr0;
public final class xb implements RequestDelegate {
    public final int f18712a = 0;
    public final int f18713b;
    public final boolean f18714c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f18715f;

    public xb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f18713b = i10;
        this.f18715f = chat;
        this.d = user;
        this.f18714c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18712a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f18714c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f18713b, (TLRPC.Chat) this.f18715f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ji.r2((fr0) this.e, (String) this.f18715f, this.f18713b, tLObject, this.f18714c, this.d));
                return;
        }
    }

    public xb(fr0 fr0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = fr0Var;
        this.f18715f = str;
        this.f18713b = i10;
        this.f18714c = z10;
        this.d = user;
    }
}
