package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f17745a;
    public final MessagesController f17746b;
    public final ArrayList f17747c;

    public ea(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f17745a = i10;
        this.f17746b = messagesController;
        this.f17747c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17745a) {
            case 0:
                this.f17746b.lambda$processUpdateArray$397(this.f17747c);
                return;
            case 1:
                this.f17746b.lambda$processUpdates$379(this.f17747c);
                return;
            case 2:
                this.f17746b.lambda$processUpdates$378(this.f17747c);
                return;
            case 3:
                this.f17746b.lambda$getChannelDifference$341(this.f17747c);
                return;
            case 4:
                this.f17746b.lambda$processUpdateArray$398(this.f17747c);
                return;
            case 5:
                this.f17746b.lambda$checkChatInviter$372(this.f17747c);
                return;
            case 6:
                this.f17746b.lambda$reloadMentionsCountForChannels$222(this.f17747c);
                return;
            default:
                this.f17746b.lambda$checkChatInviter$373(this.f17747c);
                return;
        }
    }
}
