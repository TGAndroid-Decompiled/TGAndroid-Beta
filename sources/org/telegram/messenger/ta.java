package org.telegram.messenger;

import java.util.ArrayList;
public final class ta implements Runnable {
    public final int f19570a;
    public final MessagesController f19571b;
    public final ArrayList f19572c;

    public ta(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19570a = i10;
        this.f19571b = messagesController;
        this.f19572c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19570a) {
            case 0:
                this.f19571b.lambda$processUpdates$382(this.f19572c);
                return;
            case 1:
                this.f19571b.lambda$processUpdateArray$400(this.f19572c);
                return;
            case 2:
                this.f19571b.lambda$checkChatInviter$372(this.f19572c);
                return;
            case 3:
                this.f19571b.lambda$processUpdates$381(this.f19572c);
                return;
            case 4:
                this.f19571b.lambda$processUpdateArray$401(this.f19572c);
                return;
            case 5:
                this.f19571b.lambda$getChannelDifference$340(this.f19572c);
                return;
            case 6:
                this.f19571b.lambda$reloadMentionsCountForChannels$221(this.f19572c);
                return;
            default:
                this.f19571b.lambda$checkChatInviter$371(this.f19572c);
                return;
        }
    }
}
