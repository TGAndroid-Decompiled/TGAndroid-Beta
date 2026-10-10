package org.telegram.messenger;

import java.util.ArrayList;
public final class ta implements Runnable {
    public final int f19235a;
    public final MessagesController f19236b;
    public final ArrayList f19237c;

    public ta(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f19235a = i10;
        this.f19236b = messagesController;
        this.f19237c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19235a) {
            case 0:
                this.f19236b.lambda$processUpdates$382(this.f19237c);
                return;
            case 1:
                this.f19236b.lambda$processUpdateArray$400(this.f19237c);
                return;
            case 2:
                this.f19236b.lambda$checkChatInviter$372(this.f19237c);
                return;
            case 3:
                this.f19236b.lambda$processUpdates$381(this.f19237c);
                return;
            case 4:
                this.f19236b.lambda$processUpdateArray$401(this.f19237c);
                return;
            case 5:
                this.f19236b.lambda$getChannelDifference$340(this.f19237c);
                return;
            case 6:
                this.f19236b.lambda$reloadMentionsCountForChannels$221(this.f19237c);
                return;
            default:
                this.f19236b.lambda$checkChatInviter$371(this.f19237c);
                return;
        }
    }
}
