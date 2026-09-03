package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements RequestDelegate {
    public final int f12553a;
    public final boolean f12554b;
    public final long f12555c;
    public final Object d;
    public final Object e;

    public i(MessagesController messagesController, boolean z4, TLRPC.User user, long j10) {
        this.f12553a = 1;
        this.d = messagesController;
        this.f12554b = z4;
        this.e = user;
        this.f12555c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12553a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j((q) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f12554b, this.f12555c));
                return;
            case 1:
                long j10 = this.f12555c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.f12554b, (TLRPC.User) this.e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.f12554b, this.f12555c, tLObject, tL_error);
                return;
            default:
                i80.s((i80) this.d, this.f12555c, this.f12554b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
        }
    }

    public i(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z4, long j10, int i10) {
        this.f12553a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f12554b = z4;
        this.f12555c = j10;
    }

    public i(i80 i80Var, long j10, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f12553a = 3;
        this.d = i80Var;
        this.f12555c = j10;
        this.f12554b = z4;
        this.e = tL_messages_importChatInvite;
    }
}
