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
    public final int f14145a;
    public final boolean f14146b;
    public final long f14147c;
    public final Object d;
    public final Object f14148e;

    public h(MessagesController messagesController, boolean z4, TLRPC.User user, long j10) {
        this.f14145a = 1;
        this.d = messagesController;
        this.f14146b = z4;
        this.f14148e = user;
        this.f14147c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14145a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i((p) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f14148e, this.f14146b, this.f14147c));
                return;
            case 1:
                long j10 = this.f14147c;
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.f14146b, (TLRPC.User) this.f14148e, j10, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.f14148e, this.f14146b, this.f14147c, tLObject, tL_error);
                return;
            default:
                j80.s((j80) this.d, this.f14147c, this.f14146b, (TLRPC.TL_messages_importChatInvite) this.f14148e, tLObject, tL_error);
                return;
        }
    }

    public h(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z4, long j10, int i10) {
        this.f14145a = i10;
        this.d = notificationCenterDelegate;
        this.f14148e = obj;
        this.f14146b = z4;
        this.f14147c = j10;
    }

    public h(j80 j80Var, long j10, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f14145a = 3;
        this.d = j80Var;
        this.f14147c = j10;
        this.f14146b = z4;
        this.f14148e = tL_messages_importChatInvite;
    }
}
