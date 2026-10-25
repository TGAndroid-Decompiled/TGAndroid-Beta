package org.telegram.messenger;

import java.util.ArrayList;
public final class wa implements Runnable {
    public final int f21745a;
    public final MessagesController f21746b;
    public final ArrayList f21747c;

    public wa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f21745a = i10;
        this.f21746b = messagesController;
        this.f21747c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21745a) {
            case 0:
                this.f21746b.lambda$processUpdates$384(this.f21747c);
                return;
            case 1:
                this.f21746b.lambda$processUpdateArray$402(this.f21747c);
                return;
            case 2:
                this.f21746b.lambda$processUpdateArray$403(this.f21747c);
                return;
            case 3:
                this.f21746b.lambda$checkChatInviter$374(this.f21747c);
                return;
            case 4:
                this.f21746b.lambda$processUpdates$383(this.f21747c);
                return;
            case 5:
                this.f21746b.lambda$getChannelDifference$342(this.f21747c);
                return;
            case 6:
                this.f21746b.lambda$reloadMentionsCountForChannels$221(this.f21747c);
                return;
            default:
                this.f21746b.lambda$checkChatInviter$373(this.f21747c);
                return;
        }
    }
}
