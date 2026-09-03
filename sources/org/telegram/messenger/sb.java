package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mq0;
public final class sb implements RequestDelegate {
    public final int f19969a = 0;
    public final int f19970b;
    public final boolean f19971c;
    public final TLRPC.User d;
    public final NotificationCenter.NotificationCenterDelegate f19972e;
    public final Object f19973f;

    public sb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z4) {
        this.f19972e = messagesController;
        this.f19970b = i10;
        this.f19973f = chat;
        this.d = user;
        this.f19971c = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19969a) {
            case 0:
                TLRPC.User user = this.d;
                boolean z4 = this.f19971c;
                ((MessagesController) this.f19972e).lambda$pinMessage$130(this.f19970b, (TLRPC.Chat) this.f19973f, user, z4, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1((mq0) this.f19972e, (String) this.f19973f, this.f19970b, tLObject, this.f19971c, this.d));
                return;
        }
    }

    public sb(mq0 mq0Var, String str, int i10, boolean z4, TLRPC.User user) {
        this.f19972e = mq0Var;
        this.f19973f = str;
        this.f19970b = i10;
        this.f19971c = z4;
        this.d = user;
    }
}
