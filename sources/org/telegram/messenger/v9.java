package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v9 implements RequestDelegate {
    public final int f17749a;
    public final Object f17750b;
    public final boolean f17751c;
    public final long d;
    public final Object e;

    public v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f17749a = 0;
        this.f17750b = messagesController;
        this.f17751c = z10;
        this.e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17749a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f17750b).lambda$deleteParticipantFromChat$316(this.f17751c, (TLRPC.User) this.e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17750b).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.f17751c, this.d, tLObject, tL_error);
                return;
            case 2:
                s80.s((s80) this.f17750b, this.d, this.f17751c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.g) this.f17750b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f17751c, this.d));
                return;
        }
    }

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f17749a = i10;
        this.f17750b = notificationCenterDelegate;
        this.e = obj;
        this.f17751c = z10;
        this.d = j3;
    }

    public v9(s80 s80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f17749a = 2;
        this.f17750b = s80Var;
        this.d = j3;
        this.f17751c = z10;
        this.e = tL_messages_importChatInvite;
    }
}
