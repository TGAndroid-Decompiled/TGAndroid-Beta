package org.telegram.messenger;

import java.util.ArrayList;
public final class la implements Runnable {
    public final int f15699a;
    public final MessagesController f15700b;
    public final ArrayList f15701c;

    public la(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f15699a = i10;
        this.f15700b = messagesController;
        this.f15701c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15699a) {
            case 0:
                this.f15700b.lambda$processUpdateArray$397(this.f15701c);
                return;
            case 1:
                this.f15700b.lambda$processUpdates$379(this.f15701c);
                return;
            case 2:
                this.f15700b.lambda$processUpdates$378(this.f15701c);
                return;
            case 3:
                this.f15700b.lambda$getChannelDifference$341(this.f15701c);
                return;
            case 4:
                this.f15700b.lambda$processUpdateArray$398(this.f15701c);
                return;
            case 5:
                this.f15700b.lambda$checkChatInviter$372(this.f15701c);
                return;
            case 6:
                this.f15700b.lambda$reloadMentionsCountForChannels$222(this.f15701c);
                return;
            default:
                this.f15700b.lambda$checkChatInviter$373(this.f15701c);
                return;
        }
    }
}
