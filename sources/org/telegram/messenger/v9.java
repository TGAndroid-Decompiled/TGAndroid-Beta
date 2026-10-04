package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f19401a;
    public final Object f19402b;
    public final boolean f19403c;
    public final long d;
    public final Object f19404e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19401a = 0;
        this.f19402b = messagesController;
        this.f19403c = z10;
        this.f19404e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19401a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19402b).lambda$deleteParticipantFromChat$316(this.f19403c, (TLRPC.User) this.f19404e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19402b).lambda$checkChatInviter$375((TLRPC.Chat) this.f19404e, this.f19403c, this.d, tLObject, tL_error);
                return;
            case 2:
                u80.s((u80) this.f19402b, this.d, this.f19403c, (TLRPC.TL_messages_importChatInvite) this.f19404e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.g) this.f19402b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19404e, this.f19403c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19401a = i10;
        this.f19402b = notificationCenterDelegate;
        this.f19404e = obj;
        this.f19403c = z10;
        this.d = j3;
    }

    public v9(u80 u80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19401a = 2;
        this.f19402b = u80Var;
        this.d = j3;
        this.f19403c = z10;
        this.f19404e = tL_messages_importChatInvite;
    }
}
