package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.jc0;
public final class ba implements RequestDelegate {
    public final int f16861a;
    public final Object f16862b;
    public final boolean f16863c;
    public final long d;
    public final Object e;

    public ba(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.f16861a = 0;
        this.f16862b = messagesController;
        this.f16863c = z10;
        this.e = user;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16861a) {
            case 0:
                long j10 = this.d;
                ((MessagesController) this.f16862b).lambda$deleteParticipantFromChat$315(this.f16863c, (TLRPC.User) this.e, j10, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16862b).lambda$checkChatInviter$374((TLRPC.Chat) this.e, this.f16863c, this.d, tLObject, tL_error);
                return;
            case 2:
                g90.u((g90) this.f16862b, this.d, this.f16863c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bi.x2((jc0) this.f16862b, tLObject, this.d, (String) this.e, this.f16863c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.x2((zh.g) this.f16862b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f16863c, this.d));
                return;
        }
    }

    public ba(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.f16861a = i10;
        this.f16862b = notificationCenterDelegate;
        this.e = obj;
        this.f16863c = z10;
        this.d = j10;
    }

    public ba(g90 g90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f16861a = 2;
        this.f16862b = g90Var;
        this.d = j10;
        this.f16863c = z10;
        this.e = tL_messages_importChatInvite;
    }

    public ba(jc0 jc0Var, long j10, String str, boolean z10) {
        this.f16861a = 3;
        this.f16862b = jc0Var;
        this.d = j10;
        this.e = str;
        this.f16863c = z10;
    }
}
