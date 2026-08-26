package org.telegram.messenger;

import java.util.List;

public final class SendMessagesHelper$$ExternalSyntheticLambda41 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final String f$1;
    public final List f$2;

    public SendMessagesHelper$$ExternalSyntheticLambda41(SendMessagesHelper sendMessagesHelper, String str, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = str;
        this.f$2 = list;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendNotificationCallback$28(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$sendCallback$38(this.f$1, this.f$2);
                break;
        }
    }
}
