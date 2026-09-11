package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u9 implements RequestDelegate {
    public final int f19147a;
    public final Object f19148b;
    public final boolean f19149c;
    public final long d;
    public final Object f19150e;

    public u9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19147a = 0;
        this.f19148b = messagesController;
        this.f19149c = z10;
        this.f19150e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19147a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19148b).lambda$deleteParticipantFromChat$316(this.f19149c, (TLRPC.User) this.f19150e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19148b).lambda$checkChatInviter$375((TLRPC.Chat) this.f19150e, this.f19149c, this.d, tLObject, tL_error);
                return;
            case 2:
                g80.s((g80) this.f19148b, this.d, this.f19149c, (TLRPC.TL_messages_importChatInvite) this.f19150e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.u2((zh.g) this.f19148b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19150e, this.f19149c, this.d));
                return;
        }
    }

    public u9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19147a = i10;
        this.f19148b = notificationCenterDelegate;
        this.f19150e = obj;
        this.f19149c = z10;
        this.d = j3;
    }

    public u9(g80 g80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19147a = 2;
        this.f19148b = g80Var;
        this.d = j3;
        this.f19149c = z10;
        this.f19150e = tL_messages_importChatInvite;
    }
}
