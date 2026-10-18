package org.telegram.messenger;

import java.util.ArrayList;
public final class sa implements Runnable {
    public final int f19485a;
    public final MessagesController f19486b;
    public final ArrayList f19487c;

    public sa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19485a = i10;
        this.f19486b = messagesController;
        this.f19487c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19485a) {
            case 0:
                this.f19486b.lambda$processUpdates$382(this.f19487c);
                return;
            case 1:
                this.f19486b.lambda$processUpdateArray$400(this.f19487c);
                return;
            case 2:
                this.f19486b.lambda$checkChatInviter$372(this.f19487c);
                return;
            case 3:
                this.f19486b.lambda$processUpdates$381(this.f19487c);
                return;
            case 4:
                this.f19486b.lambda$processUpdateArray$401(this.f19487c);
                return;
            case 5:
                this.f19486b.lambda$getChannelDifference$340(this.f19487c);
                return;
            case 6:
                this.f19486b.lambda$reloadMentionsCountForChannels$221(this.f19487c);
                return;
            default:
                this.f19486b.lambda$checkChatInviter$371(this.f19487c);
                return;
        }
    }
}
