package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dr0;
public final class xb implements RequestDelegate {
    public final int f19567a = 0;
    public final int f19568b;
    public final boolean f19569c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f19570e;
    public final Object f19571f;

    public xb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f19570e = messagesController;
        this.f19568b = i10;
        this.f19571f = chat;
        this.d = user;
        this.f19569c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19567a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f19569c;
                ((MessagesController) this.f19570e).lambda$pinMessage$129(this.f19568b, (TLRPC.Chat) this.f19571f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.s2((dr0) this.f19570e, (String) this.f19571f, this.f19568b, tLObject, this.f19569c, this.d));
                return;
        }
    }

    public xb(dr0 dr0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.f19570e = dr0Var;
        this.f19571f = str;
        this.f19568b = i10;
        this.f19569c = z10;
        this.d = user;
    }
}
