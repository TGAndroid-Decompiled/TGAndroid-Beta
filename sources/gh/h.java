package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p70;
import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements RequestDelegate {
    public final int f8184a;
    public final boolean f8185b;
    public final long f8186c;
    public final Object d;
    public final Object f8187e;

    public h(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.f8184a = 1;
        this.d = messagesController;
        this.f8185b = z10;
        this.f8187e = user;
        this.f8186c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8184a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i((r) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f8187e, this.f8185b, this.f8186c));
                return;
            case 1:
                long j10 = this.f8186c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.f8185b, (TLRPC.User) this.f8187e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.f8187e, this.f8185b, this.f8186c, tLObject, tL_error);
                return;
            default:
                p70.s((p70) this.d, this.f8186c, this.f8185b, (TLRPC.TL_messages_importChatInvite) this.f8187e, tLObject, tL_error);
                return;
        }
    }

    public h(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i9) {
        this.f8184a = i9;
        this.d = notificationCenterDelegate;
        this.f8187e = obj;
        this.f8185b = z10;
        this.f8186c = j10;
    }

    public h(p70 p70Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f8184a = 3;
        this.d = p70Var;
        this.f8186c = j10;
        this.f8185b = z10;
        this.f8187e = tL_messages_importChatInvite;
    }
}
