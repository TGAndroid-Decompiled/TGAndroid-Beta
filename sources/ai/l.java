package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z80;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ob0;
public final class l implements RequestDelegate {
    public final int f1664a;
    public final boolean f1665b;
    public final long f1666c;
    public final Object d;
    public final Object e;

    public l(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.f1664a = 1;
        this.d = messagesController;
        this.f1665b = z10;
        this.e = user;
        this.f1666c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1664a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m((x) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f1665b, this.f1666c));
                return;
            case 1:
                long j10 = this.f1666c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$315(this.f1665b, (TLRPC.User) this.e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$374((TLRPC.Chat) this.e, this.f1665b, this.f1666c, tLObject, tL_error);
                return;
            case 3:
                z80.t((z80) this.d, this.f1666c, this.f1665b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new m((ob0) this.d, tLObject, this.f1666c, (String) this.e, this.f1665b, tL_error));
                return;
        }
    }

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.f1664a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f1665b = z10;
        this.f1666c = j10;
    }

    public l(z80 z80Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f1664a = 3;
        this.d = z80Var;
        this.f1666c = j10;
        this.f1665b = z10;
        this.e = tL_messages_importChatInvite;
    }

    public l(ob0 ob0Var, long j10, String str, boolean z10) {
        this.f1664a = 4;
        this.d = ob0Var;
        this.f1666c = j10;
        this.e = str;
        this.f1665b = z10;
    }
}
