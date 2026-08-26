package org.telegram.messenger;

import android.util.SparseArray;

public final class MessagesController$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final SparseArray f$1;

    public MessagesController$$ExternalSyntheticLambda7(MessagesController messagesController, SparseArray sparseArray, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getChannelDifference$339(this.f$1);
                break;
            default:
                this.f$0.lambda$getDifference$352(this.f$1);
                break;
        }
    }
}
