package org.telegram.messenger;

import java.util.ArrayList;
public final class da implements Runnable {
    public final int f17468a;
    public final MessagesController f17469b;
    public final ArrayList f17470c;

    public da(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f17468a = i10;
        this.f17469b = messagesController;
        this.f17470c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17468a) {
            case 0:
                this.f17469b.lambda$processUpdateArray$397(this.f17470c);
                return;
            case 1:
                this.f17469b.lambda$processUpdates$379(this.f17470c);
                return;
            case 2:
                this.f17469b.lambda$processUpdates$378(this.f17470c);
                return;
            case 3:
                this.f17469b.lambda$getChannelDifference$341(this.f17470c);
                return;
            case 4:
                this.f17469b.lambda$processUpdateArray$398(this.f17470c);
                return;
            case 5:
                this.f17469b.lambda$checkChatInviter$372(this.f17470c);
                return;
            case 6:
                this.f17469b.lambda$reloadMentionsCountForChannels$222(this.f17470c);
                return;
            default:
                this.f17469b.lambda$checkChatInviter$373(this.f17470c);
                return;
        }
    }
}
