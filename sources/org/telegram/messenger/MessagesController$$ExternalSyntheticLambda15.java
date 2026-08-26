package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesController$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final ArrayList f$1;

    public MessagesController$$ExternalSyntheticLambda15(MessagesController messagesController, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processUpdates$379(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processUpdateArray$397(this.f$1);
                break;
            case 2:
                this.f$0.lambda$processUpdates$378(this.f$1);
                break;
            case 3:
                this.f$0.lambda$getChannelDifference$341(this.f$1);
                break;
            case 4:
                this.f$0.lambda$processUpdateArray$398(this.f$1);
                break;
            case 5:
                this.f$0.lambda$checkChatInviter$372(this.f$1);
                break;
            case 6:
                this.f$0.lambda$reloadMentionsCountForChannels$222(this.f$1);
                break;
            default:
                this.f$0.lambda$checkChatInviter$373(this.f$1);
                break;
        }
    }
}
