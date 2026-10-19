package org.telegram.messenger;

import java.util.ArrayList;
public final class sa implements Runnable {
    public final int f19482a;
    public final MessagesController f19483b;
    public final ArrayList f19484c;

    public sa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19482a = i10;
        this.f19483b = messagesController;
        this.f19484c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19482a) {
            case 0:
                this.f19483b.lambda$processUpdates$382(this.f19484c);
                return;
            case 1:
                this.f19483b.lambda$processUpdateArray$400(this.f19484c);
                return;
            case 2:
                this.f19483b.lambda$checkChatInviter$372(this.f19484c);
                return;
            case 3:
                this.f19483b.lambda$processUpdates$381(this.f19484c);
                return;
            case 4:
                this.f19483b.lambda$processUpdateArray$401(this.f19484c);
                return;
            case 5:
                this.f19483b.lambda$getChannelDifference$340(this.f19484c);
                return;
            case 6:
                this.f19483b.lambda$reloadMentionsCountForChannels$221(this.f19484c);
                return;
            default:
                this.f19483b.lambda$checkChatInviter$371(this.f19484c);
                return;
        }
    }
}
