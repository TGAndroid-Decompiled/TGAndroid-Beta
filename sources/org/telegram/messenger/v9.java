package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f19399a;
    public final Object f19400b;
    public final boolean f19401c;
    public final long d;
    public final Object f19402e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19399a = 0;
        this.f19400b = messagesController;
        this.f19401c = z10;
        this.f19402e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19399a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19400b).lambda$deleteParticipantFromChat$316(this.f19401c, (TLRPC.User) this.f19402e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19400b).lambda$checkChatInviter$375((TLRPC.Chat) this.f19402e, this.f19401c, this.d, tLObject, tL_error);
                return;
            case 2:
                u80.s((u80) this.f19400b, this.d, this.f19401c, (TLRPC.TL_messages_importChatInvite) this.f19402e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.g) this.f19400b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19402e, this.f19401c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19399a = i10;
        this.f19400b = notificationCenterDelegate;
        this.f19402e = obj;
        this.f19401c = z10;
        this.d = j3;
    }

    public v9(u80 u80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19399a = 2;
        this.f19400b = u80Var;
        this.d = j3;
        this.f19401c = z10;
        this.f19402e = tL_messages_importChatInvite;
    }
}
