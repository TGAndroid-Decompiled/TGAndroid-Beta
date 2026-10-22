package org.telegram.messenger;

import java.util.ArrayList;
public final class xa implements Runnable {
    public final int f20067a;
    public final MessagesController f20068b;
    public final ArrayList f20069c;

    public xa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f20067a = i10;
        this.f20068b = messagesController;
        this.f20069c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20067a) {
            case 0:
                this.f20068b.lambda$processUpdates$382(this.f20069c);
                return;
            case 1:
                this.f20068b.lambda$processUpdateArray$400(this.f20069c);
                return;
            case 2:
                this.f20068b.lambda$checkChatInviter$372(this.f20069c);
                return;
            case 3:
                this.f20068b.lambda$processUpdates$381(this.f20069c);
                return;
            case 4:
                this.f20068b.lambda$processUpdateArray$401(this.f20069c);
                return;
            case 5:
                this.f20068b.lambda$getChannelDifference$340(this.f20069c);
                return;
            case 6:
                this.f20068b.lambda$reloadMentionsCountForChannels$221(this.f20069c);
                return;
            default:
                this.f20068b.lambda$checkChatInviter$371(this.f20069c);
                return;
        }
    }
}
