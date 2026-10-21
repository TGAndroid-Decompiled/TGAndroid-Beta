package org.telegram.messenger;

import java.util.ArrayList;
public final class ua implements Runnable {
    public final int f19654a;
    public final MessagesController f19655b;
    public final ArrayList f19656c;

    public ua(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19654a = i10;
        this.f19655b = messagesController;
        this.f19656c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19654a) {
            case 0:
                this.f19655b.lambda$processUpdates$382(this.f19656c);
                return;
            case 1:
                this.f19655b.lambda$processUpdateArray$400(this.f19656c);
                return;
            case 2:
                this.f19655b.lambda$checkChatInviter$372(this.f19656c);
                return;
            case 3:
                this.f19655b.lambda$processUpdates$381(this.f19656c);
                return;
            case 4:
                this.f19655b.lambda$processUpdateArray$401(this.f19656c);
                return;
            case 5:
                this.f19655b.lambda$getChannelDifference$340(this.f19656c);
                return;
            case 6:
                this.f19655b.lambda$reloadMentionsCountForChannels$221(this.f19656c);
                return;
            default:
                this.f19655b.lambda$checkChatInviter$371(this.f19656c);
                return;
        }
    }
}
