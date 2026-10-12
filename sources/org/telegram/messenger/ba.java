package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fc0;
public final class ba implements RequestDelegate {
    public final int f17162a;
    public final Object f17163b;
    public final boolean f17164c;
    public final long d;
    public final Object f17165e;

    public ba(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.f17162a = 0;
        this.f17163b = messagesController;
        this.f17164c = z10;
        this.f17165e = user;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17162a) {
            case 0:
                long j3 = this.d;
                ((MessagesController) this.f17163b).lambda$deleteParticipantFromChat$315(this.f17164c, (TLRPC.User) this.f17165e, j3, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17163b).lambda$checkChatInviter$374((TLRPC.Chat) this.f17165e, this.f17164c, this.d, tLObject, tL_error);
                return;
            case 2:
                m90.u((m90) this.f17163b, this.d, this.f17164c, (TLRPC.TL_messages_importChatInvite) this.f17165e, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.i3((fc0) this.f17163b, tLObject, this.d, (String) this.f17165e, this.f17164c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.i3((yh.g) this.f17163b, tL_error, tLObject, (TwoStepVerificationActivity) this.f17165e, this.f17164c, this.d));
                return;
        }
    }

    public ba(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.f17162a = i10;
        this.f17163b = notificationCenterDelegate;
        this.f17165e = obj;
        this.f17164c = z10;
        this.d = j3;
    }

    public ba(m90 m90Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f17162a = 2;
        this.f17163b = m90Var;
        this.d = j3;
        this.f17164c = z10;
        this.f17165e = tL_messages_importChatInvite;
    }

    public ba(fc0 fc0Var, long j3, String str, boolean z10) {
        this.f17162a = 3;
        this.f17163b = fc0Var;
        this.d = j3;
        this.f17165e = str;
        this.f17164c = z10;
    }
}
