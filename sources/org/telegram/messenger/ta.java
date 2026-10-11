package org.telegram.messenger;

import java.util.ArrayList;
public final class ta implements Runnable {
    public final int f19273a;
    public final MessagesController f19274b;
    public final ArrayList f19275c;

    public ta(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19273a = i10;
        this.f19274b = messagesController;
        this.f19275c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19273a) {
            case 0:
                this.f19274b.lambda$processUpdates$382(this.f19275c);
                return;
            case 1:
                this.f19274b.lambda$processUpdateArray$400(this.f19275c);
                return;
            case 2:
                this.f19274b.lambda$checkChatInviter$372(this.f19275c);
                return;
            case 3:
                this.f19274b.lambda$processUpdates$381(this.f19275c);
                return;
            case 4:
                this.f19274b.lambda$processUpdateArray$401(this.f19275c);
                return;
            case 5:
                this.f19274b.lambda$getChannelDifference$340(this.f19275c);
                return;
            case 6:
                this.f19274b.lambda$reloadMentionsCountForChannels$221(this.f19275c);
                return;
            default:
                this.f19274b.lambda$checkChatInviter$371(this.f19275c);
                return;
        }
    }
}
