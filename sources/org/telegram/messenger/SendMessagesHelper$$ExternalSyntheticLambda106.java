package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

public final class SendMessagesHelper$$ExternalSyntheticLambda106 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TLObject f$1;
    public final MessageObject f$2;
    public final String f$3;
    public final SendMessagesHelper.DelayedMessage f$4;
    public final boolean f$5;
    public final SendMessagesHelper.DelayedMessage f$6;
    public final Object f$7;
    public final HashMap f$8;
    public final boolean f$9;

    public SendMessagesHelper$$ExternalSyntheticLambda106(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap map, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = tLObject;
        this.f$2 = messageObject;
        this.f$3 = str;
        this.f$4 = delayedMessage;
        this.f$5 = z;
        this.f$6 = delayedMessage2;
        this.f$7 = obj;
        this.f$8 = map;
        this.f$9 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSendMessageRequest$77(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
            case 1:
                this.f$0.lambda$performSendMessageRequest$78(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$82(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
        }
    }
}
