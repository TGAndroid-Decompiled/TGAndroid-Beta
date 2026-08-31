package org.telegram.messenger;

import java.util.ArrayList;
public final class ia implements Runnable {
    public final int f18945a;
    public final MessagesController f18946b;
    public final ArrayList f18947c;

    public ia(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f18945a = i10;
        this.f18946b = messagesController;
        this.f18947c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18945a) {
            case 0:
                this.f18946b.lambda$processUpdateArray$397(this.f18947c);
                return;
            case 1:
                this.f18946b.lambda$processUpdates$379(this.f18947c);
                return;
            case 2:
                this.f18946b.lambda$processUpdates$378(this.f18947c);
                return;
            case 3:
                this.f18946b.lambda$getChannelDifference$341(this.f18947c);
                return;
            case 4:
                this.f18946b.lambda$processUpdateArray$398(this.f18947c);
                return;
            case 5:
                this.f18946b.lambda$checkChatInviter$372(this.f18947c);
                return;
            case 6:
                this.f18946b.lambda$reloadMentionsCountForChannels$222(this.f18947c);
                return;
            default:
                this.f18946b.lambda$checkChatInviter$373(this.f18947c);
                return;
        }
    }
}
