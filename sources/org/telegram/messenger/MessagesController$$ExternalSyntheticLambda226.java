package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda226 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final long f$1;
    public final int f$2;
    public final int f$3;
    public final long f$4;
    public final Object f$5;
    public final boolean f$6;
    public final Object f$7;

    public MessagesController$$ExternalSyntheticLambda226(MessagesController messagesController, long j, int i, int i2, long j2, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z, Runnable runnable) {
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = j2;
        this.f$5 = tL_messages_affectedHistory;
        this.f$6 = z;
        this.f$7 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$deleteMessagesRange$464(this.f$1, this.f$2, this.f$3, this.f$4, (TLRPC.TL_messages_affectedHistory) this.f$5, this.f$6, (Runnable) this.f$7);
                break;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.f$0, this.f$2, this.f$1, this.f$4, this.f$3, this.f$6, (Context) this.f$5, (String) this.f$7);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda226(TLObject tLObject, int i, long j, long j2, int i2, boolean z, Context context, String str) {
        this.f$0 = tLObject;
        this.f$2 = i;
        this.f$1 = j;
        this.f$4 = j2;
        this.f$3 = i2;
        this.f$6 = z;
        this.f$5 = context;
        this.f$7 = str;
    }
}
