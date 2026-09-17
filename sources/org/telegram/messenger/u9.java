package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u9 implements RequestDelegate {
    public final int f19174a;
    public final Object f19175b;
    public final boolean f19176c;
    public final long d;
    public final Object f19177e;

    public u9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f19174a = 0;
        this.f19175b = messagesController;
        this.f19176c = z10;
        this.f19177e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19174a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f19175b).lambda$deleteParticipantFromChat$316(this.f19176c, (TLRPC.User) this.f19177e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19175b).lambda$checkChatInviter$375((TLRPC.Chat) this.f19177e, this.f19176c, this.d, tLObject, tL_error);
                return;
            case 2:
                g80.s((g80) this.f19175b, this.d, this.f19176c, (TLRPC.TL_messages_importChatInvite) this.f19177e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.u2((zh.g) this.f19175b, tL_error, tLObject, (TwoStepVerificationActivity) this.f19177e, this.f19176c, this.d));
                return;
        }
    }

    public u9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f19174a = i10;
        this.f19175b = notificationCenterDelegate;
        this.f19177e = obj;
        this.f19176c = z10;
        this.d = j3;
    }

    public u9(g80 g80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f19174a = 2;
        this.f19175b = g80Var;
        this.d = j3;
        this.f19176c = z10;
        this.f19177e = tL_messages_importChatInvite;
    }
}
