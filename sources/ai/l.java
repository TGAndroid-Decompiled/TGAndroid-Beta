package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.kb0;
public final class l implements RequestDelegate {
    public final int f1741a;
    public final boolean f1742b;
    public final long f1743c;
    public final Object d;
    public final Object e;

    public l(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.f1741a = 1;
        this.d = messagesController;
        this.f1742b = z10;
        this.e = user;
        this.f1743c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1741a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m((x) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f1742b, this.f1743c));
                return;
            case 1:
                long j10 = this.f1743c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$315(this.f1742b, (TLRPC.User) this.e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$374((TLRPC.Chat) this.e, this.f1742b, this.f1743c, tLObject, tL_error);
                return;
            case 3:
                a90.t((a90) this.d, this.f1743c, this.f1742b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new m((kb0) this.d, tLObject, this.f1743c, (String) this.e, this.f1742b, tL_error));
                return;
        }
    }

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.f1741a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f1742b = z10;
        this.f1743c = j10;
    }

    public l(a90 a90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f1741a = 3;
        this.d = a90Var;
        this.f1743c = j10;
        this.f1742b = z10;
        this.e = tL_messages_importChatInvite;
    }

    public l(kb0 kb0Var, long j10, String str, boolean z10) {
        this.f1741a = 4;
        this.d = kb0Var;
        this.f1743c = j10;
        this.e = str;
        this.f1742b = z10;
    }
}
