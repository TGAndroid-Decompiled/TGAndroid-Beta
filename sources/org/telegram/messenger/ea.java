package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f16016a;
    public final MessagesController f16017b;
    public final ArrayList f16018c;

    public ea(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f16016a = i10;
        this.f16017b = messagesController;
        this.f16018c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16016a) {
            case 0:
                this.f16017b.lambda$processUpdateArray$397(this.f16018c);
                return;
            case 1:
                this.f16017b.lambda$processUpdates$379(this.f16018c);
                return;
            case 2:
                this.f16017b.lambda$processUpdates$378(this.f16018c);
                return;
            case 3:
                this.f16017b.lambda$getChannelDifference$341(this.f16018c);
                return;
            case 4:
                this.f16017b.lambda$processUpdateArray$398(this.f16018c);
                return;
            case 5:
                this.f16017b.lambda$checkChatInviter$372(this.f16018c);
                return;
            case 6:
                this.f16017b.lambda$reloadMentionsCountForChannels$222(this.f16018c);
                return;
            default:
                this.f16017b.lambda$checkChatInviter$373(this.f16018c);
                return;
        }
    }
}
