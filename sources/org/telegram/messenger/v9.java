package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f19221a;
    public final Object f19222b;
    public final boolean f19223c;
    public final long d;
    public final Object f19224e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19221a = 0;
        this.f19222b = messagesController;
        this.f19223c = z10;
        this.f19224e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19221a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19222b).lambda$deleteParticipantFromChat$316(this.f19223c, (TLRPC.User) this.f19224e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19222b).lambda$checkChatInviter$375((TLRPC.Chat) this.f19224e, this.f19223c, this.d, tLObject, tL_error);
                return;
            case 2:
                g80.s((g80) this.f19222b, this.d, this.f19223c, (TLRPC.TL_messages_importChatInvite) this.f19224e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.u2((zh.g) this.f19222b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19224e, this.f19223c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19221a = i10;
        this.f19222b = notificationCenterDelegate;
        this.f19224e = obj;
        this.f19223c = z10;
        this.d = j3;
    }

    public v9(g80 g80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19221a = 2;
        this.f19222b = g80Var;
        this.d = j3;
        this.f19223c = z10;
        this.f19224e = tL_messages_importChatInvite;
    }
}
