package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rq0;
import org.telegram.ui.vj0;
import org.telegram.ui.xj0;
public final class ac implements RequestDelegate {
    public final int f19621a = 0;
    public final int f19622b;
    public final boolean f19623c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f19624f;

    public ac(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.d = messagesController;
        this.f19622b = i10;
        this.e = chat;
        this.f19624f = user;
        this.f19623c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19621a) {
            case 0:
                boolean z10 = this.f19623c;
                ((MessagesController) this.d).lambda$pinMessage$129(this.f19622b, (TLRPC.Chat) this.e, (TLRPC.User) this.f19624f, z10, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new li.p2((xj0) this.d, (vj0) this.e, this.f19622b, (String) this.f19624f, this.f19623c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new li.p2((rq0) this.d, (String) this.e, this.f19622b, tLObject, this.f19623c, (TLRPC.User) this.f19624f));
                return;
        }
    }

    public ac(xj0 xj0Var, vj0 vj0Var, int i10, String str, boolean z10) {
        this.d = xj0Var;
        this.e = vj0Var;
        this.f19622b = i10;
        this.f19624f = str;
        this.f19623c = z10;
    }

    public ac(rq0 rq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.d = rq0Var;
        this.e = str;
        this.f19622b = i10;
        this.f19623c = z10;
        this.f19624f = user;
    }
}
