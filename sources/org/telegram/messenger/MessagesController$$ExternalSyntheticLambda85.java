package org.telegram.messenger;

import androidx.collection.LongSparseArray;

public final class MessagesController$$ExternalSyntheticLambda85 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final LongSparseArray f$1;

    public MessagesController$$ExternalSyntheticLambda85(MessagesController messagesController, LongSparseArray longSparseArray, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = longSparseArray;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getChannelDifference$340(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processUpdateArray$407(this.f$1);
                break;
            default:
                this.f$0.lambda$processUpdateArray$406(this.f$1);
                break;
        }
    }
}
