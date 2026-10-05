package org.telegram.messenger;

import java.util.ArrayList;
public final class ea implements Runnable {
    public final int f17750a;
    public final MessagesController f17751b;
    public final ArrayList f17752c;

    public ea(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f17750a = i10;
        this.f17751b = messagesController;
        this.f17752c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17750a) {
            case 0:
                this.f17751b.lambda$processUpdateArray$397(this.f17752c);
                return;
            case 1:
                this.f17751b.lambda$processUpdates$379(this.f17752c);
                return;
            case 2:
                this.f17751b.lambda$processUpdates$378(this.f17752c);
                return;
            case 3:
                this.f17751b.lambda$getChannelDifference$341(this.f17752c);
                return;
            case 4:
                this.f17751b.lambda$processUpdateArray$398(this.f17752c);
                return;
            case 5:
                this.f17751b.lambda$checkChatInviter$372(this.f17752c);
                return;
            case 6:
                this.f17751b.lambda$reloadMentionsCountForChannels$222(this.f17752c);
                return;
            default:
                this.f17751b.lambda$checkChatInviter$373(this.f17752c);
                return;
        }
    }
}
