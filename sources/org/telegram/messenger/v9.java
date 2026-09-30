package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f17776a;
    public final Object f17777b;
    public final boolean f17778c;
    public final long d;
    public final Object e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f17776a = 0;
        this.f17777b = messagesController;
        this.f17778c = z10;
        this.e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17776a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f17777b).lambda$deleteParticipantFromChat$316(this.f17778c, (TLRPC.User) this.e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17777b).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.f17778c, this.d, tLObject, tL_error);
                return;
            case 2:
                u80.s((u80) this.f17777b, this.d, this.f17778c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.g) this.f17777b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f17778c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f17776a = i10;
        this.f17777b = notificationCenterDelegate;
        this.e = obj;
        this.f17778c = z10;
        this.d = j3;
    }

    public v9(u80 u80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f17776a = 2;
        this.f17777b = u80Var;
        this.d = j3;
        this.f17778c = z10;
        this.e = tL_messages_importChatInvite;
    }
}
