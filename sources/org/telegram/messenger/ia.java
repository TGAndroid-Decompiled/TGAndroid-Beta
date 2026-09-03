package org.telegram.messenger;

import java.util.ArrayList;
public final class ia implements Runnable {
    public final int f17452a;
    public final MessagesController f17453b;
    public final ArrayList f17454c;

    public ia(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f17452a = i10;
        this.f17453b = messagesController;
        this.f17454c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17452a) {
            case 0:
                this.f17453b.lambda$processUpdateArray$397(this.f17454c);
                return;
            case 1:
                this.f17453b.lambda$processUpdates$379(this.f17454c);
                return;
            case 2:
                this.f17453b.lambda$processUpdates$378(this.f17454c);
                return;
            case 3:
                this.f17453b.lambda$getChannelDifference$341(this.f17454c);
                return;
            case 4:
                this.f17453b.lambda$processUpdateArray$398(this.f17454c);
                return;
            case 5:
                this.f17453b.lambda$checkChatInviter$372(this.f17454c);
                return;
            case 6:
                this.f17453b.lambda$reloadMentionsCountForChannels$222(this.f17454c);
                return;
            default:
                this.f17453b.lambda$checkChatInviter$373(this.f17454c);
                return;
        }
    }
}
