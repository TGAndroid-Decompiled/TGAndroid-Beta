package org.telegram.messenger;

import java.util.ArrayList;
public final class wa implements Runnable {
    public final int f19459a;
    public final MessagesController f19460b;
    public final ArrayList f19461c;

    public wa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19459a = i10;
        this.f19460b = messagesController;
        this.f19461c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19459a) {
            case 0:
                this.f19460b.lambda$processUpdates$382(this.f19461c);
                return;
            case 1:
                this.f19460b.lambda$processUpdateArray$400(this.f19461c);
                return;
            case 2:
                this.f19460b.lambda$checkChatInviter$372(this.f19461c);
                return;
            case 3:
                this.f19460b.lambda$processUpdates$381(this.f19461c);
                return;
            case 4:
                this.f19460b.lambda$processUpdateArray$401(this.f19461c);
                return;
            case 5:
                this.f19460b.lambda$getChannelDifference$340(this.f19461c);
                return;
            case 6:
                this.f19460b.lambda$reloadMentionsCountForChannels$221(this.f19461c);
                return;
            default:
                this.f19460b.lambda$checkChatInviter$371(this.f19461c);
                return;
        }
    }
}
