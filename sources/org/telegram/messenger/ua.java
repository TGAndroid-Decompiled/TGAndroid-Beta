package org.telegram.messenger;

import java.util.ArrayList;
public final class ua implements Runnable {
    public final int f19657a;
    public final MessagesController f19658b;
    public final ArrayList f19659c;

    public ua(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19657a = i10;
        this.f19658b = messagesController;
        this.f19659c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19657a) {
            case 0:
                this.f19658b.lambda$processUpdates$382(this.f19659c);
                return;
            case 1:
                this.f19658b.lambda$processUpdateArray$400(this.f19659c);
                return;
            case 2:
                this.f19658b.lambda$checkChatInviter$372(this.f19659c);
                return;
            case 3:
                this.f19658b.lambda$processUpdates$381(this.f19659c);
                return;
            case 4:
                this.f19658b.lambda$processUpdateArray$401(this.f19659c);
                return;
            case 5:
                this.f19658b.lambda$getChannelDifference$340(this.f19659c);
                return;
            case 6:
                this.f19658b.lambda$reloadMentionsCountForChannels$221(this.f19659c);
                return;
            default:
                this.f19658b.lambda$checkChatInviter$371(this.f19659c);
                return;
        }
    }
}
