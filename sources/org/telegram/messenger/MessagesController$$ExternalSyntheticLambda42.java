package org.telegram.messenger;

import androidx.collection.LongSparseArray;

public final class MessagesController$$ExternalSyntheticLambda42 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final LongSparseArray f$1;
    public final LongSparseArray f$2;

    public MessagesController$$ExternalSyntheticLambda42(MessagesController messagesController, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = longSparseArray;
        this.f$2 = longSparseArray2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getNewDeleteTask$83(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$checkDeletingTask$86(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$updatePrintingStrings$170(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$checkDeletingTask$85(this.f$1, this.f$2);
                break;
        }
    }
}
