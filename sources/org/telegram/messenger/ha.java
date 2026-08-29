package org.telegram.messenger;

import java.util.ArrayList;
public final class ha implements Runnable {
    public final int f20431a;
    public final MessagesController f20432b;
    public final ArrayList f20433c;

    public ha(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f20431a = i10;
        this.f20432b = messagesController;
        this.f20433c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20431a) {
            case 0:
                this.f20432b.lambda$processUpdateArray$397(this.f20433c);
                return;
            case 1:
                this.f20432b.lambda$processUpdates$379(this.f20433c);
                return;
            case 2:
                this.f20432b.lambda$processUpdates$378(this.f20433c);
                return;
            case 3:
                this.f20432b.lambda$getChannelDifference$341(this.f20433c);
                return;
            case 4:
                this.f20432b.lambda$processUpdateArray$398(this.f20433c);
                return;
            case 5:
                this.f20432b.lambda$checkChatInviter$372(this.f20433c);
                return;
            case 6:
                this.f20432b.lambda$reloadMentionsCountForChannels$222(this.f20433c);
                return;
            default:
                this.f20432b.lambda$checkChatInviter$373(this.f20433c);
                return;
        }
    }
}
