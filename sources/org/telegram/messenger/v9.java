package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f17734a;
    public final Object f17735b;
    public final boolean f17736c;
    public final long d;
    public final Object e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f17734a = 0;
        this.f17735b = messagesController;
        this.f17736c = z10;
        this.e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17734a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f17735b).lambda$deleteParticipantFromChat$316(this.f17736c, (TLRPC.User) this.e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17735b).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.f17736c, this.d, tLObject, tL_error);
                return;
            case 2:
                r80.s((r80) this.f17735b, this.d, this.f17736c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.g) this.f17735b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f17736c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f17734a = i10;
        this.f17735b = notificationCenterDelegate;
        this.e = obj;
        this.f17736c = z10;
        this.d = j3;
    }

    public v9(r80 r80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f17734a = 2;
        this.f17735b = r80Var;
        this.d = j3;
        this.f17736c = z10;
        this.e = tL_messages_importChatInvite;
    }
}
