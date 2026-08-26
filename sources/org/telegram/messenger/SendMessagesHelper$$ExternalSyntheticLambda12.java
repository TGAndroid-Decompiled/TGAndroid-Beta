package org.telegram.messenger;

import java.util.ArrayList;

public final class SendMessagesHelper$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final long f$1;
    public final ArrayList f$2;

    public SendMessagesHelper$$ExternalSyntheticLambda12(SendMessagesHelper sendMessagesHelper, long j, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = j;
        this.f$2 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSendMessageRequestMulti$69(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$sendMessage$11(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$97(this.f$1, this.f$2);
                break;
        }
    }
}
