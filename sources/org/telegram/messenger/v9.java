package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f19406a;
    public final Object f19407b;
    public final boolean f19408c;
    public final long d;
    public final Object f19409e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19406a = 0;
        this.f19407b = messagesController;
        this.f19408c = z10;
        this.f19409e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19406a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19407b).lambda$deleteParticipantFromChat$316(this.f19408c, (TLRPC.User) this.f19409e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19407b).lambda$checkChatInviter$375((TLRPC.Chat) this.f19409e, this.f19408c, this.d, tLObject, tL_error);
                return;
            case 2:
                u80.s((u80) this.f19407b, this.d, this.f19408c, (TLRPC.TL_messages_importChatInvite) this.f19409e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.h) this.f19407b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19409e, this.f19408c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19406a = i10;
        this.f19407b = notificationCenterDelegate;
        this.f19409e = obj;
        this.f19408c = z10;
        this.d = j3;
    }

    public v9(u80 u80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19406a = 2;
        this.f19407b = u80Var;
        this.d = j3;
        this.f19408c = z10;
        this.f19409e = tL_messages_importChatInvite;
    }
}
