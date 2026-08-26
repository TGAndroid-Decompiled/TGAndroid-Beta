package org.telegram.messenger;

import org.telegram.messenger.utils.EphemeralMessagesHelper;

public final class MessagesController$$ExternalSyntheticLambda174 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final EphemeralMessagesHelper.EphemeralUpdates.StructBuilder f$1;

    public MessagesController$$ExternalSyntheticLambda174(MessagesController messagesController, EphemeralMessagesHelper.EphemeralUpdates.StructBuilder structBuilder, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = structBuilder;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processUpdateArray$402(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processUpdateArray$404(this.f$1);
                break;
            default:
                this.f$0.lambda$processUpdateArray$399(this.f$1);
                break;
        }
    }
}
