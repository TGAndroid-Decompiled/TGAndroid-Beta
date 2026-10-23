package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mq0;
public final class wb implements RequestDelegate {
    public final int f20058a = 0;
    public final int f20059b;
    public final boolean f20060c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final Object f20061f;

    public wb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.f20059b = i10;
        this.f20061f = chat;
        this.d = user;
        this.f20060c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20058a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z10 = this.f20060c;
                ((MessagesController) this.e).lambda$pinMessage$129(this.f20059b, (TLRPC.Chat) this.f20061f, user, z10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ki.r2((mq0) this.e, (String) this.f20061f, this.f20059b, tLObject, this.f20060c, this.d));
                return;
        }
    }

    public wb(mq0 mq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = mq0Var;
        this.f20061f = str;
        this.f20059b = i10;
        this.f20060c = z10;
        this.d = user;
    }
}
