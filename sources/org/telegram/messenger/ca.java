package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ca implements RequestDelegate {
    public final int f14860a;
    public final Object f14861b;
    public final boolean f14862c;
    public final long d;
    public final Object e;

    public ca(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f14860a = 0;
        this.f14861b = messagesController;
        this.f14862c = z10;
        this.e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14860a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f14861b).lambda$deleteParticipantFromChat$316(this.f14862c, (TLRPC.User) this.e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f14861b).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.f14862c, this.d, tLObject, tL_error);
                return;
            case 2:
                q80.s((q80) this.f14861b, this.d, this.f14862c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gg((xh.h) this.f14861b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f14862c, this.d));
                return;
        }
    }

    public ca(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f14860a = i10;
        this.f14861b = notificationCenterDelegate;
        this.e = obj;
        this.f14862c = z10;
        this.d = j3;
    }

    public ca(q80 q80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f14860a = 2;
        this.f14861b = q80Var;
        this.d = j3;
        this.f14862c = z10;
        this.e = tL_messages_importChatInvite;
    }
}
