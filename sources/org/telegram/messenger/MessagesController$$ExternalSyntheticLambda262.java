package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda262 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final long f$1;
    public final long f$2;
    public final int f$3;
    public final int f$4;
    public final boolean f$5;
    public final Object f$6;

    public MessagesController$$ExternalSyntheticLambda262(int i, int i2, long j, long j2, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z) {
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$5 = z;
        this.f$6 = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f$6;
                ((MessagesController) this.f$0).lambda$deleteDialog$142(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, inputPeer, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$deleteMessagesRange$466(this.f$1, this.f$3, this.f$4, this.f$2, this.f$5, (Runnable) this.f$6, tLObject, tL_error);
                break;
            default:
                VoIPGroupNotification.lambda$request$1(this.f$3, this.f$1, this.f$2, this.f$4, this.f$5, (Context) this.f$0, (String) this.f$6, tLObject, tL_error);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda262(Context context, int i, long j, String str, long j2, int i2, boolean z) {
        this.f$3 = i;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$4 = i2;
        this.f$5 = z;
        this.f$0 = context;
        this.f$6 = str;
    }

    public MessagesController$$ExternalSyntheticLambda262(MessagesController messagesController, long j, int i, int i2, long j2, boolean z, Runnable runnable) {
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$2 = j2;
        this.f$5 = z;
        this.f$6 = runnable;
    }
}
