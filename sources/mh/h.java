package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements RequestDelegate {
    public final int f14143a;
    public final boolean f14144b;
    public final long f14145c;
    public final Object d;
    public final Object f14146e;

    public h(MessagesController messagesController, boolean z4, TLRPC.User user, long j10) {
        this.f14143a = 1;
        this.d = messagesController;
        this.f14144b = z4;
        this.f14146e = user;
        this.f14145c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14143a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i((p) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f14146e, this.f14144b, this.f14145c));
                return;
            case 1:
                long j10 = this.f14145c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.f14144b, (TLRPC.User) this.f14146e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.f14146e, this.f14144b, this.f14145c, tLObject, tL_error);
                return;
            default:
                j80.s((j80) this.d, this.f14145c, this.f14144b, (TLRPC.TL_messages_importChatInvite) this.f14146e, tLObject, tL_error);
                return;
        }
    }

    public h(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z4, long j10, int i10) {
        this.f14143a = i10;
        this.d = notificationCenterDelegate;
        this.f14146e = obj;
        this.f14144b = z4;
        this.f14145c = j10;
    }

    public h(j80 j80Var, long j10, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f14143a = 3;
        this.d = j80Var;
        this.f14145c = j10;
        this.f14144b = z4;
        this.f14146e = tL_messages_importChatInvite;
    }
}
