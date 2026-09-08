package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f19248a;
    public final Object f19249b;
    public final boolean f19250c;
    public final long d;
    public final Object f19251e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19248a = 0;
        this.f19249b = messagesController;
        this.f19250c = z10;
        this.f19251e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19248a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19249b).lambda$deleteParticipantFromChat$316(this.f19250c, (TLRPC.User) this.f19251e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19249b).lambda$checkChatInviter$375((TLRPC.Chat) this.f19251e, this.f19250c, this.d, tLObject, tL_error);
                return;
            case 2:
                g80.s((g80) this.f19249b, this.d, this.f19250c, (TLRPC.TL_messages_importChatInvite) this.f19251e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.u2((zh.g) this.f19249b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19251e, this.f19250c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19248a = i10;
        this.f19249b = notificationCenterDelegate;
        this.f19251e = obj;
        this.f19250c = z10;
        this.d = j3;
    }

    public v9(g80 g80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19248a = 2;
        this.f19249b = g80Var;
        this.d = j3;
        this.f19250c = z10;
        this.f19251e = tL_messages_importChatInvite;
    }
}
