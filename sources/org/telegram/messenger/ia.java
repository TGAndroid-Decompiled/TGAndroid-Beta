package org.telegram.messenger;

import java.util.ArrayList;
public final class ia implements Runnable {
    public final int f17471a;
    public final MessagesController f17472b;
    public final ArrayList f17473c;

    public ia(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f17471a = i10;
        this.f17472b = messagesController;
        this.f17473c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17471a) {
            case 0:
                this.f17472b.lambda$processUpdateArray$397(this.f17473c);
                return;
            case 1:
                this.f17472b.lambda$processUpdates$379(this.f17473c);
                return;
            case 2:
                this.f17472b.lambda$processUpdates$378(this.f17473c);
                return;
            case 3:
                this.f17472b.lambda$getChannelDifference$341(this.f17473c);
                return;
            case 4:
                this.f17472b.lambda$processUpdateArray$398(this.f17473c);
                return;
            case 5:
                this.f17472b.lambda$checkChatInviter$372(this.f17473c);
                return;
            case 6:
                this.f17472b.lambda$reloadMentionsCountForChannels$222(this.f17473c);
                return;
            default:
                this.f17472b.lambda$checkChatInviter$373(this.f17473c);
                return;
        }
    }
}
