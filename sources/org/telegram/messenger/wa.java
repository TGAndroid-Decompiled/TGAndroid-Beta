package org.telegram.messenger;

import java.util.ArrayList;
public final class wa implements Runnable {
    public final int f20055a;
    public final MessagesController f20056b;
    public final ArrayList f20057c;

    public wa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f20055a = i10;
        this.f20056b = messagesController;
        this.f20057c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20055a) {
            case 0:
                this.f20056b.lambda$processUpdates$382(this.f20057c);
                return;
            case 1:
                this.f20056b.lambda$processUpdateArray$400(this.f20057c);
                return;
            case 2:
                this.f20056b.lambda$checkChatInviter$372(this.f20057c);
                return;
            case 3:
                this.f20056b.lambda$processUpdates$381(this.f20057c);
                return;
            case 4:
                this.f20056b.lambda$processUpdateArray$401(this.f20057c);
                return;
            case 5:
                this.f20056b.lambda$getChannelDifference$340(this.f20057c);
                return;
            case 6:
                this.f20056b.lambda$reloadMentionsCountForChannels$221(this.f20057c);
                return;
            default:
                this.f20056b.lambda$checkChatInviter$371(this.f20057c);
                return;
        }
    }
}
