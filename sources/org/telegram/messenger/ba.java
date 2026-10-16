package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ic0;
public final class ba implements RequestDelegate {
    public final int f16561a;
    public final Object f16562b;
    public final boolean f16563c;
    public final long d;
    public final Object e;

    public ba(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.f16561a = 0;
        this.f16562b = messagesController;
        this.f16563c = z10;
        this.e = user;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16561a) {
            case 0:
                long j10 = this.d;
                ((MessagesController) this.f16562b).lambda$deleteParticipantFromChat$315(this.f16563c, (TLRPC.User) this.e, j10, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16562b).lambda$checkChatInviter$374((TLRPC.Chat) this.e, this.f16563c, this.d, tLObject, tL_error);
                return;
            case 2:
                f90.u((f90) this.f16562b, this.d, this.f16563c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bi.x2((ic0) this.f16562b, tLObject, this.d, (String) this.e, this.f16563c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.x2((zh.g) this.f16562b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f16563c, this.d));
                return;
        }
    }

    public ba(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.f16561a = i10;
        this.f16562b = notificationCenterDelegate;
        this.e = obj;
        this.f16563c = z10;
        this.d = j10;
    }

    public ba(f90 f90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f16561a = 2;
        this.f16562b = f90Var;
        this.d = j10;
        this.f16563c = z10;
        this.e = tL_messages_importChatInvite;
    }

    public ba(ic0 ic0Var, long j10, String str, boolean z10) {
        this.f16561a = 3;
        this.f16562b = ic0Var;
        this.d = j10;
        this.e = str;
        this.f16563c = z10;
    }
}
