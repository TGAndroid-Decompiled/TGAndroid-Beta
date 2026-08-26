package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesController$$ExternalSyntheticLambda122 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final ArrayList f$1;
    public final long f$2;

    public MessagesController$$ExternalSyntheticLambda122(MessagesController messagesController, long j, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$2 = j;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$markAllTopicsAsRead$7(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$generateJoinMessage$368(this.f$2, this.f$1);
                break;
            case 2:
                this.f$0.lambda$getDifference$354(this.f$2, this.f$1);
                break;
            case 3:
                this.f$0.lambda$processUpdateArray$418(this.f$2, this.f$1);
                break;
            case 4:
                this.f$0.lambda$deleteMessagesByPush$369(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$getDifference$355(this.f$2, this.f$1);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda122(MessagesController messagesController, ArrayList arrayList, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = arrayList;
        this.f$2 = j;
    }
}
