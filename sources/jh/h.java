package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements RequestDelegate {
    public final int f12138a;
    public final boolean f12139b;
    public final long f12140c;
    public final Object d;
    public final Object f12141e;

    public h(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.f12138a = 1;
        this.d = messagesController;
        this.f12139b = z10;
        this.f12141e = user;
        this.f12140c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12138a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i((q) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f12141e, this.f12139b, this.f12140c));
                return;
            case 1:
                long j10 = this.f12140c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.f12139b, (TLRPC.User) this.f12141e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.f12141e, this.f12139b, this.f12140c, tLObject, tL_error);
                return;
            default:
                c80.s((c80) this.d, this.f12140c, this.f12139b, (TLRPC.TL_messages_importChatInvite) this.f12141e, tLObject, tL_error);
                return;
        }
    }

    public h(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.f12138a = i10;
        this.d = notificationCenterDelegate;
        this.f12141e = obj;
        this.f12139b = z10;
        this.f12140c = j10;
    }

    public h(c80 c80Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f12138a = 3;
        this.d = c80Var;
        this.f12140c = j10;
        this.f12139b = z10;
        this.f12141e = tL_messages_importChatInvite;
    }
}
