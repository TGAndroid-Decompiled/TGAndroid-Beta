package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f17569a;
    public final MessagesController f17570b;
    public final ArrayList f17571c;

    public ea(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f17569a = i10;
        this.f17570b = messagesController;
        this.f17571c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17569a) {
            case 0:
                this.f17570b.lambda$processUpdateArray$397(this.f17571c);
                return;
            case 1:
                this.f17570b.lambda$processUpdates$379(this.f17571c);
                return;
            case 2:
                this.f17570b.lambda$processUpdates$378(this.f17571c);
                return;
            case 3:
                this.f17570b.lambda$getChannelDifference$341(this.f17571c);
                return;
            case 4:
                this.f17570b.lambda$processUpdateArray$398(this.f17571c);
                return;
            case 5:
                this.f17570b.lambda$checkChatInviter$372(this.f17571c);
                return;
            case 6:
                this.f17570b.lambda$reloadMentionsCountForChannels$222(this.f17571c);
                return;
            default:
                this.f17570b.lambda$checkChatInviter$373(this.f17571c);
                return;
        }
    }
}
