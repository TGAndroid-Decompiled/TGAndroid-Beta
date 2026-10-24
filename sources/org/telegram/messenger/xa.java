package org.telegram.messenger;

import java.util.ArrayList;
public final class xa implements Runnable {
    public final int f20132a;
    public final MessagesController f20133b;
    public final ArrayList f20134c;

    public xa(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f20132a = i10;
        this.f20133b = messagesController;
        this.f20134c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20132a) {
            case 0:
                this.f20133b.lambda$processUpdates$382(this.f20134c);
                return;
            case 1:
                this.f20133b.lambda$processUpdateArray$400(this.f20134c);
                return;
            case 2:
                this.f20133b.lambda$checkChatInviter$372(this.f20134c);
                return;
            case 3:
                this.f20133b.lambda$processUpdates$381(this.f20134c);
                return;
            case 4:
                this.f20133b.lambda$processUpdateArray$401(this.f20134c);
                return;
            case 5:
                this.f20133b.lambda$getChannelDifference$340(this.f20134c);
                return;
            case 6:
                this.f20133b.lambda$reloadMentionsCountForChannels$221(this.f20134c);
                return;
            default:
                this.f20133b.lambda$checkChatInviter$371(this.f20134c);
                return;
        }
    }
}
