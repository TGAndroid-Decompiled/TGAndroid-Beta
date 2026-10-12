package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dr0;
public final class xb implements RequestDelegate {
    public final int f19568a = 0;
    public final int f19569b;
    public final boolean f19570c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f19571e;
    public final Object f19572f;

    public xb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f19571e = messagesController;
        this.f19569b = i10;
        this.f19572f = chat;
        this.d = user;
        this.f19570c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19568a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19570c;
                ((MessagesController) this.f19571e).lambda$pinMessage$129(this.f19569b, (TLRPC.Chat) this.f19572f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((dr0) this.f19571e, (String) this.f19572f, this.f19569b, tLObject, this.f19570c, this.d));
                return;
        }
    }

    public xb(dr0 dr0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f19571e = dr0Var;
        this.f19572f = str;
        this.f19569b = i10;
        this.f19570c = z10;
        this.d = user;
    }
}
