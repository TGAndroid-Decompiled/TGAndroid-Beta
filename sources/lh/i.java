package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements RequestDelegate {
    public final int f12569a;
    public final boolean f12570b;
    public final long f12571c;
    public final Object d;
    public final Object e;

    public i(MessagesController messagesController, boolean z4, TLRPC.User user, long j10) {
        this.f12569a = 1;
        this.d = messagesController;
        this.f12570b = z4;
        this.e = user;
        this.f12571c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12569a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j((q) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f12570b, this.f12571c));
                return;
            case 1:
                long j10 = this.f12571c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.f12570b, (TLRPC.User) this.e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.f12570b, this.f12571c, tLObject, tL_error);
                return;
            default:
                h80.s((h80) this.d, this.f12571c, this.f12570b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                return;
        }
    }

    public i(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z4, long j10, int i10) {
        this.f12569a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f12570b = z4;
        this.f12571c = j10;
    }

    public i(h80 h80Var, long j10, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f12569a = 3;
        this.d = h80Var;
        this.f12571c = j10;
        this.f12570b = z4;
        this.e = tL_messages_importChatInvite;
    }
}
