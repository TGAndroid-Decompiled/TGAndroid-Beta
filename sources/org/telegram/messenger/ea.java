package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f17744a;
    public final MessagesController f17745b;
    public final ArrayList f17746c;

    public ea(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f17744a = i10;
        this.f17745b = messagesController;
        this.f17746c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17744a) {
            case 0:
                this.f17745b.lambda$processUpdateArray$397(this.f17746c);
                return;
            case 1:
                this.f17745b.lambda$processUpdates$379(this.f17746c);
                return;
            case 2:
                this.f17745b.lambda$processUpdates$378(this.f17746c);
                return;
            case 3:
                this.f17745b.lambda$getChannelDifference$341(this.f17746c);
                return;
            case 4:
                this.f17745b.lambda$processUpdateArray$398(this.f17746c);
                return;
            case 5:
                this.f17745b.lambda$checkChatInviter$372(this.f17746c);
                return;
            case 6:
                this.f17745b.lambda$reloadMentionsCountForChannels$222(this.f17746c);
                return;
            default:
                this.f17745b.lambda$checkChatInviter$373(this.f17746c);
                return;
        }
    }
}
