package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ib0;
public final class l implements RequestDelegate {
    public final int f1672a;
    public final boolean f1673b;
    public final long f1674c;
    public final Object d;
    public final Object e;

    public l(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.f1672a = 1;
        this.d = messagesController;
        this.f1673b = z10;
        this.e = user;
        this.f1674c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1672a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m((x) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f1673b, this.f1674c));
                return;
            case 1:
                long j10 = this.f1674c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$315(this.f1673b, (TLRPC.User) this.e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$374((TLRPC.Chat) this.e, this.f1673b, this.f1674c, tLObject, tL_error);
                return;
            case 3:
                a90.u((a90) this.d, this.f1674c, this.f1673b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new m((ib0) this.d, tLObject, this.f1674c, (String) this.e, this.f1673b, tL_error));
                return;
        }
    }

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.f1672a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f1673b = z10;
        this.f1674c = j10;
    }

    public l(a90 a90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f1672a = 3;
        this.d = a90Var;
        this.f1674c = j10;
        this.f1673b = z10;
        this.e = tL_messages_importChatInvite;
    }

    public l(ib0 ib0Var, long j10, String str, boolean z10) {
        this.f1672a = 4;
        this.d = ib0Var;
        this.f1674c = j10;
        this.e = str;
        this.f1673b = z10;
    }
}
