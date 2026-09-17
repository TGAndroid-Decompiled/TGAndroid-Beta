package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f17536a;
    public final Object f17537b;
    public final boolean f17538c;
    public final long d;
    public final Object e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f17536a = 0;
        this.f17537b = messagesController;
        this.f17538c = z10;
        this.e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17536a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f17537b).lambda$deleteParticipantFromChat$316(this.f17538c, (TLRPC.User) this.e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17537b).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.f17538c, this.d, tLObject, tL_error);
                return;
            case 2:
                g80.s((g80) this.f17537b, this.d, this.f17538c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.g) this.f17537b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f17538c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f17536a = i10;
        this.f17537b = notificationCenterDelegate;
        this.e = obj;
        this.f17538c = z10;
        this.d = j3;
    }

    public v9(g80 g80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f17536a = 2;
        this.f17537b = g80Var;
        this.d = j3;
        this.f17538c = z10;
        this.e = tL_messages_importChatInvite;
    }
}
