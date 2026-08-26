package org.telegram.messenger;

import androidx.collection.LongSparseArray;

public final class MessagesStorage$$ExternalSyntheticLambda54 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final LongSparseArray f$1;

    public MessagesStorage$$ExternalSyntheticLambda54(MessagesStorage messagesStorage, LongSparseArray longSparseArray, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = longSparseArray;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteEphemeralMessages$205(this.f$1);
                break;
            case 1:
                this.f$0.lambda$getDialogs$239(this.f$1);
                break;
            case 2:
                this.f$0.lambda$markMessagesAsDeletedInternal$225(this.f$1);
                break;
            default:
                this.f$0.lambda$putWebPages$188(this.f$1);
                break;
        }
    }
}
