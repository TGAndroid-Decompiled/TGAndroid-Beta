package org.telegram.messenger;

import java.util.ArrayList;
public final class wa implements Runnable {
    public final int f19990a;
    public final MessagesController f19991b;
    public final ArrayList f19992c;

    public wa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19990a = i10;
        this.f19991b = messagesController;
        this.f19992c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19990a) {
            case 0:
                this.f19991b.lambda$processUpdates$382(this.f19992c);
                return;
            case 1:
                this.f19991b.lambda$processUpdateArray$400(this.f19992c);
                return;
            case 2:
                this.f19991b.lambda$checkChatInviter$372(this.f19992c);
                return;
            case 3:
                this.f19991b.lambda$processUpdates$381(this.f19992c);
                return;
            case 4:
                this.f19991b.lambda$processUpdateArray$401(this.f19992c);
                return;
            case 5:
                this.f19991b.lambda$getChannelDifference$340(this.f19992c);
                return;
            case 6:
                this.f19991b.lambda$reloadMentionsCountForChannels$221(this.f19992c);
                return;
            default:
                this.f19991b.lambda$checkChatInviter$371(this.f19992c);
                return;
        }
    }
}
