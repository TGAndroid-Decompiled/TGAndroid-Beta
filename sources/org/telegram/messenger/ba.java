package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fc0;
public final class ba implements RequestDelegate {
    public final int f17163a;
    public final Object f17164b;
    public final boolean f17165c;
    public final long d;
    public final Object f17166e;

    public ba(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f17163a = 0;
        this.f17164b = messagesController;
        this.f17165c = z10;
        this.f17166e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17163a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f17164b).lambda$deleteParticipantFromChat$315(this.f17165c, (TLRPC.User) this.f17166e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17164b).lambda$checkChatInviter$374((TLRPC.Chat) this.f17166e, this.f17165c, this.d, tLObject, tL_error);
                return;
            case 2:
                m90.u((m90) this.f17164b, this.d, this.f17165c, (TLRPC.TL_messages_importChatInvite) this.f17166e, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.i3((fc0) this.f17164b, tLObject, this.d, (String) this.f17166e, this.f17165c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.i3((yh.g) this.f17164b, tL_error, tLObject, (TwoStepVerificationActivity) this.f17166e, this.f17165c, this.d));
                return;
        }
    }

    public ba(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f17163a = i10;
        this.f17164b = notificationCenterDelegate;
        this.f17166e = obj;
        this.f17165c = z10;
        this.d = j3;
    }

    public ba(m90 m90Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f17163a = 2;
        this.f17164b = m90Var;
        this.d = j3;
        this.f17165c = z10;
        this.f17166e = tL_messages_importChatInvite;
    }

    public ba(fc0 fc0Var, long j3, String str, boolean z10) {
        this.f17163a = 3;
        this.f17164b = fc0Var;
        this.d = j3;
        this.f17166e = str;
        this.f17165c = z10;
    }
}
