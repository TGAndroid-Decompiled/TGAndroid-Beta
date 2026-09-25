package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f16270a;
    public final MessagesController f16271b;
    public final ArrayList f16272c;

    public ea(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f16270a = i10;
        this.f16271b = messagesController;
        this.f16272c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16270a) {
            case 0:
                this.f16271b.lambda$processUpdateArray$397(this.f16272c);
                return;
            case 1:
                this.f16271b.lambda$processUpdates$379(this.f16272c);
                return;
            case 2:
                this.f16271b.lambda$processUpdates$378(this.f16272c);
                return;
            case 3:
                this.f16271b.lambda$getChannelDifference$341(this.f16272c);
                return;
            case 4:
                this.f16271b.lambda$processUpdateArray$398(this.f16272c);
                return;
            case 5:
                this.f16271b.lambda$checkChatInviter$372(this.f16272c);
                return;
            case 6:
                this.f16271b.lambda$reloadMentionsCountForChannels$222(this.f16272c);
                return;
            default:
                this.f16271b.lambda$checkChatInviter$373(this.f16272c);
                return;
        }
    }
}
