package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.lb0;
public final class m implements RequestDelegate {
    public final int f5057a;
    public final boolean f5058b;
    public final long f5059c;
    public final Object d;
    public final Object e;

    public m(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.f5057a = 1;
        this.d = messagesController;
        this.f5058b = z10;
        this.e = user;
        this.f5059c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5057a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n((y) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f5058b, this.f5059c));
                return;
            case 1:
                long j10 = this.f5059c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$317(this.f5058b, (TLRPC.User) this.e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$376((TLRPC.Chat) this.e, this.f5058b, this.f5059c, tLObject, tL_error);
                return;
            case 3:
                c90.s((c90) this.d, this.f5059c, this.f5058b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new n((lb0) this.d, tLObject, this.f5059c, (String) this.e, this.f5058b, tL_error));
                return;
        }
    }

    public m(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.f5057a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f5058b = z10;
        this.f5059c = j10;
    }

    public m(c90 c90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f5057a = 3;
        this.d = c90Var;
        this.f5059c = j10;
        this.f5058b = z10;
        this.e = tL_messages_importChatInvite;
    }

    public m(lb0 lb0Var, long j10, String str, boolean z10) {
        this.f5057a = 4;
        this.d = lb0Var;
        this.f5059c = j10;
        this.e = str;
        this.f5058b = z10;
    }
}
