package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f17494a;
    public final Object f17495b;
    public final boolean f17496c;
    public final long d;
    public final Object e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f17494a = 0;
        this.f17495b = messagesController;
        this.f17496c = z10;
        this.e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17494a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f17495b).lambda$deleteParticipantFromChat$316(this.f17496c, (TLRPC.User) this.e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17495b).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.f17496c, this.d, tLObject, tL_error);
                return;
            case 2:
                h80.s((h80) this.f17495b, this.d, this.f17496c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.g) this.f17495b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f17496c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f17494a = i10;
        this.f17495b = notificationCenterDelegate;
        this.e = obj;
        this.f17496c = z10;
        this.d = j3;
    }

    public v9(h80 h80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f17494a = 2;
        this.f17495b = h80Var;
        this.d = j3;
        this.f17496c = z10;
        this.e = tL_messages_importChatInvite;
    }
}
