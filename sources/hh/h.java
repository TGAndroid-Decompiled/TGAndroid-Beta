package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t70;
import org.telegram.ui.TwoStepVerificationActivity;

public final class h implements RequestDelegate {

    public final int f9362a;

    public final boolean f9363b;

    public final long f9364c;
    public final Object d;

    public final Object f9365e;

    public h(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.f9362a = 1;
        this.d = messagesController;
        this.f9363b = z10;
        this.f9365e = user;
        this.f9364c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9362a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i((r) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f9365e, this.f9363b, this.f9364c));
                break;
            case 1:
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.f9363b, (TLRPC.User) this.f9365e, this.f9364c, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.f9365e, this.f9363b, this.f9364c, tLObject, tL_error);
                break;
            default:
                t70.t((t70) this.d, this.f9364c, this.f9363b, (TLRPC.TL_messages_importChatInvite) this.f9365e, tLObject, tL_error);
                break;
        }
    }

    public h(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.f9362a = i10;
        this.d = notificationCenterDelegate;
        this.f9365e = obj;
        this.f9363b = z10;
        this.f9364c = j10;
    }

    public h(t70 t70Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f9362a = 3;
        this.d = t70Var;
        this.f9364c = j10;
        this.f9363b = z10;
        this.f9365e = tL_messages_importChatInvite;
    }
}
