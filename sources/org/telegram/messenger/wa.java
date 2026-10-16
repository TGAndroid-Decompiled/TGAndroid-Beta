package org.telegram.messenger;

import java.util.ArrayList;
public final class wa implements Runnable {
    public final int f18617a;
    public final MessagesController f18618b;
    public final ArrayList f18619c;

    public wa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f18617a = i10;
        this.f18618b = messagesController;
        this.f18619c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18617a) {
            case 0:
                this.f18618b.lambda$processUpdates$382(this.f18619c);
                return;
            case 1:
                this.f18618b.lambda$processUpdateArray$400(this.f18619c);
                return;
            case 2:
                this.f18618b.lambda$checkChatInviter$372(this.f18619c);
                return;
            case 3:
                this.f18618b.lambda$processUpdates$381(this.f18619c);
                return;
            case 4:
                this.f18618b.lambda$processUpdateArray$401(this.f18619c);
                return;
            case 5:
                this.f18618b.lambda$getChannelDifference$340(this.f18619c);
                return;
            case 6:
                this.f18618b.lambda$reloadMentionsCountForChannels$221(this.f18619c);
                return;
            default:
                this.f18618b.lambda$checkChatInviter$371(this.f18619c);
                return;
        }
    }
}
