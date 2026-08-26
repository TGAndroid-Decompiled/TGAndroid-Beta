package org.telegram.messenger;

import androidx.core.util.Consumer;

public final class MessagesController$$ExternalSyntheticLambda199 implements Runnable {
    public final int $r8$classId;
    public final Consumer f$0;
    public final int f$1;

    public MessagesController$$ExternalSyntheticLambda199(Consumer consumer, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = consumer;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f$0, this.f$1);
                break;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f$0, this.f$1);
                break;
        }
    }
}
