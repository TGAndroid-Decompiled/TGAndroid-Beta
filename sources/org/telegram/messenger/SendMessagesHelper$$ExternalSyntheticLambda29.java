package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class SendMessagesHelper$$ExternalSyntheticLambda29 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final ArrayList f$1;
    public final int f$2;
    public final int f$3;
    public final TLRPC.Message f$4;
    public final int f$5;
    public final TLRPC.Message f$6;
    public final MessageObject f$7;
    public final int f$8;

    public SendMessagesHelper$$ExternalSyntheticLambda29(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i, int i2, TLRPC.Message message, int i3, TLRPC.Message message2, MessageObject messageObject, int i4, int i5) {
        this.$r8$classId = i5;
        this.f$0 = sendMessagesHelper;
        this.f$1 = arrayList;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = message;
        this.f$5 = i3;
        this.f$6 = message2;
        this.f$7 = messageObject;
        this.f$8 = i4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendMessage$9(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8);
                break;
            default:
                this.f$0.lambda$sendMessage$10(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8);
                break;
        }
    }
}
