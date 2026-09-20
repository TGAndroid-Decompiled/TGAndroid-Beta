package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f17741a;
    public final Object f17742b;
    public final boolean f17743c;
    public final long d;
    public final Object e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f17741a = 0;
        this.f17742b = messagesController;
        this.f17743c = z10;
        this.e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17741a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f17742b).lambda$deleteParticipantFromChat$316(this.f17743c, (TLRPC.User) this.e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17742b).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.f17743c, this.d, tLObject, tL_error);
                return;
            case 2:
                o80.s((o80) this.f17742b, this.d, this.f17743c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.g) this.f17742b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f17743c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f17741a = i10;
        this.f17742b = notificationCenterDelegate;
        this.e = obj;
        this.f17743c = z10;
        this.d = j3;
    }

    public v9(o80 o80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f17741a = 2;
        this.f17742b = o80Var;
        this.d = j3;
        this.f17743c = z10;
        this.e = tL_messages_importChatInvite;
    }
}
