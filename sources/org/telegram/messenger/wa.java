package org.telegram.messenger;

import java.util.ArrayList;
public final class wa implements Runnable {
    public final int f18917a;
    public final MessagesController f18918b;
    public final ArrayList f18919c;

    public wa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f18917a = i10;
        this.f18918b = messagesController;
        this.f18919c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18917a) {
            case 0:
                this.f18918b.lambda$processUpdates$382(this.f18919c);
                return;
            case 1:
                this.f18918b.lambda$processUpdateArray$400(this.f18919c);
                return;
            case 2:
                this.f18918b.lambda$checkChatInviter$372(this.f18919c);
                return;
            case 3:
                this.f18918b.lambda$processUpdates$381(this.f18919c);
                return;
            case 4:
                this.f18918b.lambda$processUpdateArray$401(this.f18919c);
                return;
            case 5:
                this.f18918b.lambda$getChannelDifference$340(this.f18919c);
                return;
            case 6:
                this.f18918b.lambda$reloadMentionsCountForChannels$221(this.f18919c);
                return;
            default:
                this.f18918b.lambda$checkChatInviter$371(this.f18919c);
                return;
        }
    }
}
