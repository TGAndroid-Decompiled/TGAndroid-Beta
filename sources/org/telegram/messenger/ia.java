package org.telegram.messenger;

import java.util.ArrayList;
public final class ia implements Runnable {
    public final int f18947a;
    public final MessagesController f18948b;
    public final ArrayList f18949c;

    public ia(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f18947a = i10;
        this.f18948b = messagesController;
        this.f18949c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18947a) {
            case 0:
                this.f18948b.lambda$processUpdateArray$397(this.f18949c);
                return;
            case 1:
                this.f18948b.lambda$processUpdates$379(this.f18949c);
                return;
            case 2:
                this.f18948b.lambda$processUpdates$378(this.f18949c);
                return;
            case 3:
                this.f18948b.lambda$getChannelDifference$341(this.f18949c);
                return;
            case 4:
                this.f18948b.lambda$processUpdateArray$398(this.f18949c);
                return;
            case 5:
                this.f18948b.lambda$checkChatInviter$372(this.f18949c);
                return;
            case 6:
                this.f18948b.lambda$reloadMentionsCountForChannels$222(this.f18949c);
                return;
            default:
                this.f18948b.lambda$checkChatInviter$373(this.f18949c);
                return;
        }
    }
}
