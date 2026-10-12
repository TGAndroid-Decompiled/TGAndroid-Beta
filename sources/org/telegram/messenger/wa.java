package org.telegram.messenger;

import java.util.ArrayList;
public final class wa implements Runnable {
    public final int f19460a;
    public final MessagesController f19461b;
    public final ArrayList f19462c;

    public wa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19460a = i10;
        this.f19461b = messagesController;
        this.f19462c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19460a) {
            case 0:
                this.f19461b.lambda$processUpdates$382(this.f19462c);
                return;
            case 1:
                this.f19461b.lambda$processUpdateArray$400(this.f19462c);
                return;
            case 2:
                this.f19461b.lambda$checkChatInviter$372(this.f19462c);
                return;
            case 3:
                this.f19461b.lambda$processUpdates$381(this.f19462c);
                return;
            case 4:
                this.f19461b.lambda$processUpdateArray$401(this.f19462c);
                return;
            case 5:
                this.f19461b.lambda$getChannelDifference$340(this.f19462c);
                return;
            case 6:
                this.f19461b.lambda$reloadMentionsCountForChannels$221(this.f19462c);
                return;
            default:
                this.f19461b.lambda$checkChatInviter$371(this.f19462c);
                return;
        }
    }
}
